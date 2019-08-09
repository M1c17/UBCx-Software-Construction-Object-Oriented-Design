package model;

import exceptions.MessyException;
import exceptions.NotHungry;
import exceptions.AllergicException;

import java.util.List;

public class Keeper {

    List<Animal> animalsToFeed;

    public Keeper(List<Animal> animals) {
        animalsToFeed = animals;
    }

    public void feed() throws NotHungry, AllergicException, MessyException {
        System.out.println("Keeper is feeding the animals");
        for (Animal animal : animalsToFeed) {
            int eatenTimes = animal.eat();
            System.out.println("Animal has been fed "+ eatenTimes);
        }

        System.out.println("the stall is always dirty");
        throw new MessyException();
    }
}