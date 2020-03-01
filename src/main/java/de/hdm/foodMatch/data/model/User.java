package de.hdm.foodMatch.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.io.IOException;

public class User {
    private long id;
    private String firstname;
    private String surname;
    private boolean male;
    private long[] favoriteRecipe;
    private long[] savedIngredients;
    private long[] neededIngredients;

    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    @JsonProperty("firstname")
    public void setFirstname(String value) {
        this.firstname = value;
    }

    @JsonProperty("id")
    public long getID() {
        return id;
    }

    @JsonProperty("id")
    public void setID(long value) {
        this.id = value;
    }


    @JsonProperty("surname")
    public String getSurname() {
        return surname;
    }

    @JsonProperty("surname")
    public void setSurname(String value) {
        this.surname = value;
    }

    @JsonProperty("male")
    public boolean getMale() {
        return male;
    }

    @JsonProperty("male")
    public void setMale(boolean value) {
        this.male = value;
    }

    @JsonProperty("favoriteRecipe")
    public long[] getFavoriteRecipe() {
        return favoriteRecipe;
    }

    @JsonProperty("favoriteRecipe")
    public void setFavoriteRecipe(long[] value) {
        this.favoriteRecipe = value;
    }

    @JsonProperty("savedIngredients")
    public long[] getSavedIngredients() {
        return savedIngredients;
    }

    @JsonProperty("savedIngredients")
    public void setSavedIngredients(long[] value) {
        this.savedIngredients = value;
    }

    @JsonProperty("neededIngredients")
    public long[] getNeededIngredients() {
        return neededIngredients;
    }

    @JsonProperty("neededIngredients")
    public void setNeededIngredients(long[] value) {
        this.neededIngredients = value;
    }

    public static User fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(User obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        reader = mapper.reader(User.class);
        writer = mapper.writerFor(User.class);
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
