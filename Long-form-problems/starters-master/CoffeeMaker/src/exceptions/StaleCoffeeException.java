package exceptions;

// This exception will be thrown when someone tries to pour the coffee,
// but it has been sitting for too long and is now stale.
public class StaleCoffeeException extends Exception{

  private int timeSinceLastBrew;


}
