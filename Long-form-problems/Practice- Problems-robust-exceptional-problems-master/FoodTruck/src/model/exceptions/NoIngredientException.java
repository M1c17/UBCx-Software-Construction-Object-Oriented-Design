package model.exceptions;

public class NoIngredientException extends Exception {

  public NoIngredientException() {}

  public NoIngredientException(String message) {
    super("We dont have enough ingredients to cook");}
}
