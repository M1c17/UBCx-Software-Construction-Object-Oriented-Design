package ui;

import exceptions.BrokeException;
import model.Animal;
import model.Keeper;
import model.Manager;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        System.out.println("Zoo is open for business!!");
        for (int i = 0; i < 3; i++) {
            animals.add(new Animal(true, false));
        }
        Keeper keeper = new Keeper(animals);
        Manager manager = new Manager(animals, keeper);
        try {
            manager.manage();
        } catch (BrokeException brokeException) {
            System.out.println("REDUCE COST!!!.");
        }

        finally {
            System.out.println("...profits");
        }
    }


}