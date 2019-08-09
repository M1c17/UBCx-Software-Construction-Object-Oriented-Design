package exceptions;

public class NotEnoughBeansException extends BeansAmountException {

  public NotEnoughBeansException(double beans) {
    super(beans, "not enough beans");
  }
}
