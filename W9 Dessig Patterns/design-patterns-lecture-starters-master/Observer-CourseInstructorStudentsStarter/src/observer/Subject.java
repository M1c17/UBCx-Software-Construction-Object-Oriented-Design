package observer;

import model.LectureModule;

import java.util.ArrayList;
import java.util.List;

public class Subject {

  private List<LectureObserver> lectureObservers = new ArrayList<>();

  public void addObserver(LectureObserver lectureObserver) {
    if(!lectureObservers.contains(lectureObserver)) {
      lectureObservers.add(lectureObserver);
    }
  }

  public void notifyObservers(LectureModule lectureModule) {
    for(LectureObserver observer: lectureObservers){
      observer.update(lectureModule);
    }
  }



}
