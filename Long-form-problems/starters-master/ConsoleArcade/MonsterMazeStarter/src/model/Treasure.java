package model;

public class Treasure extends Choice {

    private int prize;
    private String optionMessage;

    public Treasure(int prize) {
        super("Claim your treasure!");
        this.prize = prize;
    }

    //EFFECTS: prints the result of choosing this choice
    @Override
    public void printOutcome() {
        System.out.println("Your prize is " + prize + " spendibees.");
    }


}
