package de.hdm.foodMatch.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;
import java.util.List;

public class RecipeResponse {
    private Recipe recipe;
    private List<Ingredient> missingIngredients;
    private List<Ingredient> availableIngredient;

    public RecipeResponse(Recipe recipe, List<Ingredient> missingIngredients, List<Ingredient> availableIngredient) {
        this.recipe = recipe;
        this.missingIngredients = missingIngredients;
        this.availableIngredient = availableIngredient;
    }

    @JsonProperty("recipe")
    public Recipe getRecipe() {
        return recipe;
    }

    @JsonProperty("recipe")
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @JsonProperty("missingIngredient")
    public List<Ingredient> getMissingIngredients() {
        return missingIngredients;
    }

    @JsonProperty("missingIngredient")
    public void setMissingIngredients(List<Ingredient> missingIngredients) {
        this.missingIngredients = missingIngredients;
    }

    @JsonProperty("availableIngredient")
    public List<Ingredient> getAvailableIngredient() {
        return availableIngredient;
    }

    @JsonProperty("availableIngredient")
    public void setAvailableIngredient(List<Ingredient> availableIngredient) {
        this.availableIngredient = availableIngredient;
    }

    public static Recipe fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(Recipe obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        reader = mapper.reader(Recipe.class);
        writer = mapper.writerFor(Recipe.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

