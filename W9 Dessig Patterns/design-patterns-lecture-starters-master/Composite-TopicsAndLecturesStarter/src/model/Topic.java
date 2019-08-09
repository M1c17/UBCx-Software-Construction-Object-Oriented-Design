package model;

import java.util.ArrayList;
import java.util.List;

public class Topic extends Module{

    private String name;
    private List<Module> modules = new ArrayList<>();
//    private List<Lecture> lectures = new ArrayList<>();
//    private List<Topic> topics = new ArrayList<>();
//    private List<Video> videos = new ArrayList<>();


    public Topic (String name) {
        this.name = name;
    }

    public void addModule(Module m) {
        modules.add(m);
    }
//    public void addTopic(Topic t) {
//        topics.add(t);
//    }
//
//    public void addLecture(Lecture lecture) {
//        lectures.add(lecture);
//    }
//
//    public void addVideo(Video video) {
//        videos.add(video);
//    }

    public void display(String indentLevel) {
        System.out.println(indentLevel + name);
//        for(Lecture l: lectures) {
//            l.display(indentLevel + indentLevel);
//        }
//
//        for(Topic t: topics) {
//            t.display(indentLevel + indentLevel);
//        }
//
//        for(Video v: videos) {
//            v.display(indentLevel + indentLevel);
//        }
        for(Module m : modules) {
            m.display(indentLevel + indentLevel);
        }

    }


}