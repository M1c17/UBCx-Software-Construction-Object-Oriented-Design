package model;

/**
 * A coffee maker used to train baristas.
 *
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */

public class CoffeeMaker {

    private int timeSinceLastBrew;
    private int cupsRemaining;


    public CoffeeMaker(){
        timeSinceLastBrew = 0;
        cupsRemaining = 0;

    }

    // getters
    public int getTimeSinceLastBrew() { return timeSinceLastBrew; }
    public int getCupsRemaining() { return cupsRemaining; }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining() {
        if (cupsRemaining > 0) {
            return true;
        }
        return false;
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew(int time) {
        timeSinceLastBrew = time;
    }

    // REQUIRES: beans between 2.40 and 2.60 cups, water > 14.75 cups.
    // when water < 14.75 cups thrown a exception error:
    // when beans > 2.60 cups thrown a exception error:
    // when beans < 2.40 cups thrown a exception error:
    //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0
    public void brew(double beans, double water){
        System.out.println("Starting to brew.");

        if(water < 14.75) {

        }

        if(beans > 2.60) {

        }

        if(beans < 2.40) {

        }
        cupsRemaining = 20;
        timeSinceLastBrew = 0;

        System.out.println();
    }

    // REQUIRES: cups remaining > 0, time since last brew < 60
    // when cups 0 throw a exception error:
    // when time since last brew > 60 throw a exception error
    // MODIFIES: this
    // EFFECTS: subtracts one cup from cups remaining
    public void pourCoffee() {
        System.out.println("Starting Pouring Coffe");
        if (cupsRemaining == 0) {

        } else if (timeSinceLastBrew > 60) {

        } else {
            cupsRemaining -= 1;
            System.out.println("Pouring Coffe.");
        }
    }
}
