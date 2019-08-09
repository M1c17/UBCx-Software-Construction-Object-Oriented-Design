package model;

public class Host extends FOHEmployee {

    private static final String PREFIX = "HOST - ";

    public Host(Dish dish) {
        super(dish);

    }

    public String getPrefix() { return PREFIX; }

}
