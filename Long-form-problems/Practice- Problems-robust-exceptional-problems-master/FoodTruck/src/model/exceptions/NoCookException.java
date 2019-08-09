package model.exceptions;

public class NoCookException extends Exception {

  public NoCookException(){ }

  public NoCookException(String message) {
    super ("The kitchen its no ready to cook");}
}
