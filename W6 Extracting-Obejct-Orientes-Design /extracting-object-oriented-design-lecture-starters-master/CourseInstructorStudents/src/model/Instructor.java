package model;

import java.util.ArrayList;
import java.util.List;

public class Instructor {

    private final String name;

    private List<Course> courses = new ArrayList<>();

    public Instructor(String name) {
        this.name = name;
    }

    public void addCourse(Course c) {
        if (!courses.contains(c)) {
            c.addInstructor(this);
            System.out.println(c.getCourseName() + " is succefullly added to Instructor courses");
        }
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getName () {
        return name;
    }
}


