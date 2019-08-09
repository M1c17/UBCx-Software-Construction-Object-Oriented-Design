package observer_patterns;

import java.util.LinkedList;

public class Subject {

  private LinkedList<Observer> observers = new LinkedList<>();

  public void addObserver(Observer b) {
    if(!observers.contains(b)){
      observers.add(b);
    }
  }

  public void notifyObservers(Subject Observable, double bid) {
    for(Observer observer: observers) {
      observer.update(Observable, bid);
    }
  }
}
