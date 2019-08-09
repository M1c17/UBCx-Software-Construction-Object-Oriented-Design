package exceptions;

public class TooManyBeansException extends BeansAmountException {

  public TooManyBeansException(double beans) {
    super(beans, " too many beans ");
  }
}
