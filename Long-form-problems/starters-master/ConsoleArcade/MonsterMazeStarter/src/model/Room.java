package model;

import java.util.ArrayList;
import java.util.List;

public class Room extends Choice {

//    private List<Monster> monsters;
//    private List<Treasure> treasures;
//    private List<Room> rooms;
    private List<Choice> nextChoices;
    private int id;


    public Room(int id) {

        super( "Enter Room " + id + ".");
        this.id = id;
//        monsters = new ArrayList<>();
//        treasures = new ArrayList<>();
//        rooms = new ArrayList<>();
        nextChoices = new ArrayList<>();
        nextChoices.add(0, null);
    }

    //EFFECTS: prints all possible next choices
    public void printOutcome() {
        System.out.println("You are now in Room " + id + ".\n");
        System.out.println("You have the following options: ");

//        for (Monster m: monsters) {
//            System.out.print("\tOption " + counter + ": ");
//            m.printOptionMessage();
//            counter++;
//        }
//
//        for (Treasure t: treasures) {
//            System.out.print("\tOption " + counter + ": ");
//            t.printOptionMessage();
//            counter++;
//        }
//
//        for (Room r: rooms) {
//            System.out.print("\tOption " + counter + ": ");
//            r.printOptionMessage();
//            counter++;
//        }

        for (int i=1; i< nextChoices.size(); i++){
            System.out.print("\tOption " + i + ": ");
            nextChoices.get(i).printOptionMessage();
        }
    }

    //MODIFIES: this
    //EFFECTS: adds m to next possible monsters
//    public void addMonster(Monster m) {
//        monsters.add(m);
//    }
//
//    //MODIFIES: this
//    //EFFECTS: adds t to next possible treasures
//    public void addTreasure(Treasure t) {
//        treasures.add(t);
//    }
//
//    //MODIFIES: this
//    //EFFECTS: adds r to next possible rooms
//    public void addRoom(Room r) {
//        rooms.add(r);
//    }

    public void addChoice(Choice choice) {
        nextChoices.add(choice);
    }


    //getters for gameplay
//    public Monster getMonster(int i) { return monsters.get(i); }
//
//    public Treasure getTreasure(int i) {
//        return treasures.get(i);
//    }
//
//    public Room getRoom(int i) {
//        return rooms.get(i);
//    }

    public Choice getChoice(int i) { return nextChoices.get(i); }

//    public int getMonsterRange() {
//        return monsters.size();
//    }
//
//    public int getTreasureRange() {
//        return treasures.size();
//    }
//
//    public int getRoomRange() {
//        return rooms.size();
//    }

    public int getChoiceRange() {
        return nextChoices.size();
    }
}
