package de.hdm.foodMatch;

import de.hdm.foodMatch.data.model.Ingredient;
import de.hdm.foodMatch.data.model.Recipe;
import de.hdm.foodMatch.data.model.User;
import de.hdm.foodMatch.repository.IngredientRepository;
import de.hdm.foodMatch.repository.RecipeRepository;
import de.hdm.foodMatch.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static de.hdm.foodMatch.Constants.recipesJSON;
import static de.hdm.foodMatch.Constants.userJSON;

@SpringBootApplication
public class FoodMatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(FoodMatchApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository, RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {
        return args -> {
            //INIT FROM JSON
            final Recipe.RecipeArray recipeArray = Recipe.RecipeArray.fromJsonString(recipesJSON);
            recipeRepository.deleteAll();
            if (recipeArray != null) {
                for (Recipe recipe : recipeArray.getRecipes()) {
                    recipeRepository.save(recipe);
                    for (Ingredient ingredient : recipe.getIngredients()) {
                        ingredientRepository.save(ingredient);
                    }
                }
            }
            userRepository.deleteAll();
            userRepository.save(User.fromJsonString(userJSON));
            userRepository.findAll().forEach(System.out::println);
            recipeRepository.findAll().forEach(System.out::println);
        };
    }

}

