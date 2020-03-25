package de.hdm.foodMatch.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;

public class SavedRecipe {
    private boolean vegetarian;
    private boolean vegan;
    private boolean glutenFree;
    private boolean dairyFree;
    private boolean veryHealthy;
    private Ingredient[] ingredients;
    private long id;
    private String title;
    private long readyInMinutes;
    private long servings;
    private String image;
    private String instructions;

    @JsonProperty("vegetarian")
    public boolean getVegetarian() {
        return vegetarian;
    }

    @JsonProperty("vegetarian")
    public void setVegetarian(boolean value) {
        this.vegetarian = value;
    }

    @JsonProperty("vegan")
    public boolean getVegan() {
        return vegan;
    }

    @JsonProperty("vegan")
    public void setVegan(boolean value) {
        this.vegan = value;
    }

    @JsonProperty("glutenFree")
    public boolean getGlutenFree() {
        return glutenFree;
    }

    @JsonProperty("glutenFree")
    public void setGlutenFree(boolean value) {
        this.glutenFree = value;
    }

    @JsonProperty("dairyFree")
    public boolean getDairyFree() {
        return dairyFree;
    }

    @JsonProperty("dairyFree")
    public void setDairyFree(boolean value) {
        this.dairyFree = value;
    }

    @JsonProperty("veryHealthy")
    public boolean getVeryHealthy() {
        return veryHealthy;
    }

    @JsonProperty("veryHealthy")
    public void setVeryHealthy(boolean value) {
        this.veryHealthy = value;
    }

    @JsonProperty("extendedIngredients")
    public Ingredient[] getIngredients() {
        return ingredients;
    }

    @JsonProperty("extendedIngredients")
    public void setIngredients(Ingredient[] value) {
        this.ingredients = value;
    }

    @JsonProperty("id")
    public long getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(long value) {
        this.id = value;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String value) {
        this.title = value;
    }

    @JsonProperty("readyInMinutes")
    public long getReadyInMinutes() {
        return readyInMinutes;
    }

    @JsonProperty("readyInMinutes")
    public void setReadyInMinutes(long value) {
        this.readyInMinutes = value;
    }

    @JsonProperty("servings")
    public long getServings() {
        return servings;
    }

    @JsonProperty("servings")
    public void setServings(long value) {
        this.servings = value;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String value) {
        this.image = value;
    }

    @JsonProperty("instructions")
    public String getInstructions() {
        return instructions;
    }

    @JsonProperty("instructions")
    public void setInstructions(String value) {
        this.instructions = value;
    }


    public static SavedRecipe fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(SavedRecipe obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        reader = mapper.reader(SavedRecipe.class);
        writer = mapper.writerFor(SavedRecipe.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }

    public static class RecipeArray {
        private SavedRecipe[] recipes;

        @JsonProperty("recipes")
        public SavedRecipe[] getRecipes() {
            return recipes;
        }

        @JsonProperty("recipes")
        public void setRecipes(SavedRecipe[] value) {
            this.recipes = value;
        }

        public static RecipeArray fromJsonString(String json) throws IOException {
            return getObjectReader().readValue(json);
        }

        public static String toJsonString(SavedRecipe obj) throws JsonProcessingException {
            return getObjectWriter().writeValueAsString(obj);
        }

        private static ObjectReader reader;
        private static ObjectWriter writer;

        private static void instantiateMapper() {
            ObjectMapper mapper = new ObjectMapper();
            reader = mapper.reader(RecipeArray.class);
            writer = mapper.writerFor(RecipeArray.class);
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

}