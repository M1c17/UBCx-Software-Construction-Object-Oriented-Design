package model;

import exceptions.NotHungry;
import exceptions.AllergicException;


public class Animal {

    private boolean isHungry = true;
    private boolean isAllergic = false;
    private int eaten = 0;

    public Animal(boolean hungry, boolean allergic) {
        isHungry = hungry;
        isAllergic = allergic;
    }

    public int eat() throws NotHungry, AllergicException {
        int initialEaten = eaten;
        if(!isHungry) {
            System.out.println("Animal is not hungry");
            throw new NotHungry();
        }

        if(isAllergic) {
            System.out.println("Animal is allergic");
            throw new AllergicException();
        }

        System.out.println("Animal is eating");
        isHungry = false;
        eaten++;
        assert(!isHungry && eaten > initialEaten);
        return eaten;
    }

    // getters
    public boolean isHungry() { return isHungry; }


}