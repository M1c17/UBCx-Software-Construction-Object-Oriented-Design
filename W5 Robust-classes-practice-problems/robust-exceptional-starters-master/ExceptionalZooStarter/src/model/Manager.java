package model;

import exceptions.BrokeException;
import exceptions.DidntEat;
import exceptions.MessyException;

import java.util.List;

public class Manager {

    private final List<Animal> animalsToManage;
    private final Keeper keeper;

    public Manager(List<Animal> animals, Keeper keeper) {
        this.animalsToManage = animals;
        this.keeper = keeper;
    }

    public void manage() throws BrokeException {
        System.out.println("Manager is managing the keeper");
        try {
            keeper.feed();
        } catch (DidntEat didntEat) {
            System.out.println("Get the doctor !!!");
            throw new BrokeException();
        } catch (MessyException e) {
            System.out.println("Keeper your fired ");
        } finally {
            System.out.println("Manager says: Regardless of what happens");
        }
        System.out.println("And everything goes normal");
    }


}