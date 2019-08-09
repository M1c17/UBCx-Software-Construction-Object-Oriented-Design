package ui;

import model.Lecture;
import model.Topic;
import model.Video;

public class Main {

    public static void main(String[] args) {
        Topic designPatterns = new Topic("Design patterns");
        Topic observer = new Topic("Observer");
        Topic composite = new Topic("Composite");
        designPatterns.addModule(observer);
        designPatterns.addModule(composite);

        Lecture patternsIntro = new Lecture("Intro to Patterns");
        Lecture observerIntro = new Lecture("Intro to Observer");
        designPatterns.addModule(patternsIntro);
        observer.addModule(observerIntro);

        Video compositeIntro = new Video("Lets compose!");
        composite.addModule(compositeIntro);


        designPatterns.display("  ");
    }


}