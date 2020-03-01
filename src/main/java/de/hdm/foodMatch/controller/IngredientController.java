package de.hdm.foodMatch.controller;

import de.hdm.foodMatch.data.model.Ingredient;
import de.hdm.foodMatch.repository.IngredientRepository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
class IngredientController {

    private final static String TAG = "RecipeController: ";

    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    private final IngredientRepository ingredientRepository;

    @GetMapping("/ingredients")
    public List<Ingredient> getIngredients() {
        return (List<Ingredient>) ingredientRepository.findAll();
    }

    @PostMapping("/addIngredient")
    void addIngredient(@RequestBody Ingredient ingredient) {
        ingredientRepository.save(ingredient);
    }

    @PostMapping("/removeIngredient")
    void removeIngredient(@RequestBody Ingredient ingredient) {
        ingredientRepository.delete(ingredient);
    }

    @GetMapping("/ingredients/search")
    public List<Ingredient> searchIngredientByName(@RequestParam String search) {
        List<Ingredient> ingredientList = (List<Ingredient>) ingredientRepository.findAll();
        List<Ingredient> filteredList = new ArrayList<>();
        for (Ingredient ingredient : ingredientList) {
            if (ingredient.getName().toLowerCase().contains(search.toLowerCase())) {
                filteredList.add(ingredient);
            }
        }
        return filteredList;
    }
}
