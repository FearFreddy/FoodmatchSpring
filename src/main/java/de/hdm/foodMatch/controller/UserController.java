package de.hdm.foodMatch.controller;


import de.hdm.foodMatch.data.model.Ingredient;
import de.hdm.foodMatch.data.model.Recipe;
import de.hdm.foodMatch.data.model.User;
import de.hdm.foodMatch.repository.IngredientRepository;
import de.hdm.foodMatch.repository.RecipeRepository;
import de.hdm.foodMatch.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "https://foodmatch-app.herokuapp.com")
class UserController {

    private final static String TAG = "ShoppingListController: ";
    private final IngredientRepository ingredientRepository;
    private final RecipeRepository recipeRepository;

    public UserController(UserRepository userRepository, IngredientRepository ingredientRepository, RecipeRepository recipeRepository) {
        this.ingredientRepository = ingredientRepository;
        this.userRepository = userRepository;
        this.recipeRepository = recipeRepository;
    }

    private final UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getUser() {
        List<User> list = ((List<User>) userRepository.findAll());
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/addUser")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @PostMapping("/deleteUser")
    void deleteUser(@RequestBody User user) {
        userRepository.delete(user);
    }

    @GetMapping("/user/removeIngredient")
    User removeIngredient(@RequestParam long userId, @RequestParam boolean isShoppingList, @RequestParam long ingredientId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        Optional<Ingredient> optionalIngredient = ingredientRepository.findById(ingredientId);

        if (optionalUser.isPresent() && optionalIngredient.isPresent()) {
            User user = optionalUser.get();
            long[] ids = Arrays.stream(isShoppingList
                    ? user.getNeededIngredients()
                    : user.getSavedIngredients())
                    .filter(ingrId -> ingredientId != ingrId)
                    .toArray();
            if (isShoppingList) {
                user.setNeededIngredients(ids);
            } else {
                user.setSavedIngredients(ids);
            }
            userRepository.save(user);
            return user;
        }
        return null;
    }

    @GetMapping("/user/removeRecipe")
    User removeRecipe(@RequestParam long userId, @RequestParam long recipeId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        Optional<Recipe> optionalRecipe = recipeRepository.findById(recipeId);

        if (optionalUser.isPresent() && optionalRecipe.isPresent()) {
            User user = optionalUser.get();
            long[] ids = Arrays.stream(user.getFavoriteRecipe())
                    .filter(recId -> recipeId != recId)
                    .toArray();
            user.setFavoriteRecipe(ids);
            userRepository.save(user);
            return user;
        }
        return null;
    }

    @GetMapping("/user/ingredients")
    Ingredient[] getIngredients(@RequestParam long userId, @RequestParam boolean isShoppingList) {
        Optional<User> optionalUser = userRepository.findById(userId);
        List<Ingredient> ingredients = (List<Ingredient>) ingredientRepository.findAll();
        if (optionalUser.isPresent()) {
            User user = optionalUser.get();
            return ingredients.stream().filter(
                    ingredient -> Arrays.stream(isShoppingList ? user.getNeededIngredients()
                            : user.getSavedIngredients()).anyMatch(longId -> longId == ingredient.getId())
            ).toArray(Ingredient[]::new);
        }
        return null;
    }

    @GetMapping("/user/addIngredient")
    User addIngredient(@RequestParam long userId, @RequestParam boolean isShoppingList, @RequestParam long ingredientId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        Optional<Ingredient> optionalIngredient = ingredientRepository.findById(ingredientId);

        if (optionalUser.isPresent() && optionalIngredient.isPresent()) {
            User user = optionalUser.get();
            List<Long> longs = Arrays.stream(isShoppingList
                    ? user.getNeededIngredients()
                    : user.getSavedIngredients())
                    .boxed()
                    .collect(Collectors.toList());
            if (longs.stream().noneMatch(ingrId -> ingredientId == ingrId)) {
                longs.add(ingredientId);
                if (isShoppingList) {
                    user.setNeededIngredients(longs.stream().mapToLong(l -> l).toArray());
                } else {
                    user.setSavedIngredients(longs.stream().mapToLong(l -> l).toArray());
                }
            }
            userRepository.save(user);
            return user;
        }
        return null;
    }

    @GetMapping("/user/addRecipe")
    void addRecipe(@RequestParam long userId, @RequestParam long recipeId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        Optional<Recipe> optionalRecipe = recipeRepository.findById(recipeId);

        if (optionalUser.isPresent() && optionalRecipe.isPresent()) {
            User user = optionalUser.get();
            List<Long> longs = Arrays.stream(user.getFavoriteRecipe())
                    .boxed()
                    .collect(Collectors.toList());
            if (longs.stream().noneMatch(recId -> recipeId == recId)) {
                longs.add(recipeId);
                user.setFavoriteRecipe(longs.stream().mapToLong(l -> l).toArray());
            }
            userRepository.save(user);
        }
    }

    @GetMapping("/user/search")
    public List<User> searchUserByName(@RequestParam String search) {
        List<User> userList = (List<User>) userRepository.findAll();
        List<User> filteredList = new ArrayList<>();
        for (User user : userList) {
            if ((user.getFirstname().toLowerCase() + user.getSurname().toLowerCase())
                    .contains(search.toLowerCase())) {
                filteredList.add(user);
            }
        }
        return filteredList;
    }
}
