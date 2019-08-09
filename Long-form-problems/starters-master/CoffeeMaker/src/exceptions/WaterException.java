package exceptions;

//This exception will be thrown when there is not enough supplied to the machine.
public class WaterException extends Exception{

  private double amtwaterincups;

  public WaterException(double amtwaterincups) {
    super(amtwaterincups + "it need more water");
    this.amtwaterincups = amtwaterincups;

  }

  public double getAmtwaterincups() { return amtwaterincups; }
}
