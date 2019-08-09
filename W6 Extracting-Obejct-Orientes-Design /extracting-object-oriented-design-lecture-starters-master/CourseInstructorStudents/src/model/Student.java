package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Student implements Teachable {

    private String name;
    private int id;
    private List<Course> courses = new ArrayList<>();

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void addCourse(Course c) {
        if(!courses.contains(c)) {
            courses.add(c);
            c.addStudent(this);
            System.out.println(c.getCourseName() + " is succefullly added to the courses of " + getName() );
        }

    }
    public String getName() {
        return name;
    }

    public void printRecord() {
        System.out.println(id + ":" + name);
    }


}