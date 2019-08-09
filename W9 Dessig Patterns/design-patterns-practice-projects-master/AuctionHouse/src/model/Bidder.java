package model;

import observer_patterns.Observer;
import observer_patterns.Subject;

import java.util.Random;

public class Bidder implements Observer {

  private String name;
  private double personalBid;
  private double currentBid;
  private double maxBid;


  public Bidder(String name, double maxBid, Auctioneer auctioneer){
    this.name = name;
    personalBid = 0.0;
    currentBid = 0.0;
    this.maxBid = maxBid;
    auctioneer.addObserver(this);


  }

  //getters:
  public String getName() { return name; }
  public double getPersonalBid() { return personalBid; }
  public double getCurrentBid() { return currentBid; }
  public double getMaxBid() { return maxBid; }


  // EFFECTS: print out that this Bidder has been updated with the most recent high bid
  // Then, given that the most recent bid is less than this Bidder's maxBid, it should call the method
  // makeBid(double currentBid), if the current bid is equal to or greater then the maxBid, the method
  // should print out " I can't bid any higher!"
  @Override
  public void update(Subject auctioneer, Object arg) {
    this.currentBid = (double) arg;
    System.out.println("Update received for: " + name + " , current bit is at: $ " + currentBid);

    if(currentBid < maxBid) {
      makeBid(currentBid);
    }else {
      System.out.println(" I can't bid any higher!");
    }
  }

  //EFFECTS: This is a utility function which randomly generates a number from currentBid to maxBid
  //       * and sets it as this Bidder's personalBid
  public void makeBid(double currentBid) {
   Random rand = new Random();
   personalBid = (double) rand.nextInt((int) 10) + (currentBid +1);
    System.out.println(name + "'s bid is: $" + personalBid);

  }
}
