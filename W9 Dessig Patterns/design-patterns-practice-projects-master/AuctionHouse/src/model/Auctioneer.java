package model;

import observer_patterns.Subject;

public class Auctioneer extends Subject {

  private String name;
  private double currentBid;

  public Auctioneer(String name) {
    this.name = name;
    currentBid = 0.0;

  }

  //getters
  public String getName() { return name; }
  public double getCurrentBid() { return currentBid; }

  //EFFECT: should consume a new bid. if the bid is smaller than the currentBid, the method should
  //print out " That bid isn't larger than the current bid! ". if the new bid is indeed larger than the
  // currentBid, then the currentBid should be reset to the new bid, and all observers should be notified.
  public void acceptBid(double newBid){
    if(newBid <= currentBid) {
      System.out.println(" That bid isn't larger than the current bid! ");
  } else {
      currentBid = newBid;
      System.out.println(" The highest bid is currently $: " + newBid);
      notifyObservers(currentBid);
    }
  }

  public void notifyObservers(double newBidAmt) {
    System.out.println("Notify observers the current has change");
    super.notifyObservers(this, newBidAmt);

  }
}
