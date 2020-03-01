package de.hdm.foodMatch.controller;

import de.hdm.foodMatch.data.model.Ingredient;
import de.hdm.foodMatch.data.model.Recipe;
import de.hdm.foodMatch.data.model.RecipeResponse;
import de.hdm.foodMatch.repository.RecipeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
class RecipeController {

    private final static String TAG = "RecipeController: ";

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    private final RecipeRepository recipeRepository;

    @GetMapping("/recipes")
    public List<Recipe> getRecipes() {
        return (List<Recipe>) recipeRepository.findAll();
    }

    @PostMapping("/addRecipe")
    void addRecipe(@RequestBody Recipe recipe) {
        recipeRepository.save(recipe);
    }

    @PostMapping("/removeRecipe")
    void removeRecipe(@RequestBody Recipe recipe) {
        recipeRepository.delete(recipe);
    }

    @GetMapping("/recipes/search")
    public List<Recipe> searchRecipeByName(@RequestParam String search) {
        List<Recipe> recipeList = (List<Recipe>) recipeRepository.findAll();
        List<Recipe> filteredList = new ArrayList<>();
        for (Recipe recipe : recipeList) {
            if (recipe.getTitle().toLowerCase().contains(search.toLowerCase())) {
                filteredList.add(recipe);
            }
        }
        return filteredList;
    }

    @GetMapping("/recipes/findByIngredients")
    public List<RecipeResponse> searchRecipeByIngredient(@RequestParam(name = "ingredients") List<String> ingredients) {
        List<Recipe> availableRecipes = (List<Recipe>) recipeRepository.findAll();
        return availableRecipes.stream()
                .filter(recipe ->
                        Arrays.stream(recipe.getIngredients())
                                .map(Ingredient::getName)
                                .anyMatch(x -> ingredients.stream().anyMatch(b -> b.equals(x))))
                .map(recipe -> {
                    return new RecipeResponse(recipe, Arrays.stream(recipe.getIngredients())
                            .filter(s -> ingredients.stream().noneMatch(i -> i.equals(s.getName())))
                            .collect(Collectors.toList()), Arrays.stream(recipe.getIngredients())
                            .filter(s -> ingredients.stream().anyMatch(i -> i.equals(s.getName())))
                            .collect(Collectors.toList()));
                })
                .collect(Collectors.toList());
    }
}