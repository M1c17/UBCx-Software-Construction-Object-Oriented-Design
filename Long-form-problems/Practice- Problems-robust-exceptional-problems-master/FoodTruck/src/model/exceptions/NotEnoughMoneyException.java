package model.exceptions;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() { }

    public NotEnoughMoneyException(String msg) {
        super("There is no enough money to buy ingredients"); }


}
