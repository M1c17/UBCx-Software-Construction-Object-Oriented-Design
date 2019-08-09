package model;

import java.util.ArrayList;
import java.util.List;

public class Dish {

    private List<String> ingredients;
    private String name;
    private String recipe;
    private String description;


    public Dish(String name){
        this.name = name;
        this.ingredients = new ArrayList<>();
        recipe = "";
        description = "";
    }

    public Dish(String name, String description, List<String> ingredients, String recipe){
        this.description = description;
        this.ingredients = ingredients;
        this.recipe = recipe;
    }

    //getters
    public String getDescription() { return description; }
    public String getRecipe() { return recipe; }
    public String getName() { return name; }
    public List<String> getIngredients() { return ingredients; }

    //setters
    public void setIngredients(List<String> ingredients) { this.ingredients = ingredients; }
    public void setName(String name) { this.name = name; }
    public void setRecipe(String recipe) { this.recipe = recipe; }
    public void setDescription(String description) { this.description = description; }





}
