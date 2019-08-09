package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {

    private String courseName;
    private Instructor instructor;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName){
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.getName() + " now is instructor of " + getCourseName());
        this.instructor = instructor;
    }

    public void addStudent(Student student) {
        if(!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
            System.out.println("The student: "+ student.getName() + " is succesfully added to" + getCourseName());
        }

    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return students.equals(course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    public void printEnrolled(){
        for (Student s : students){
            s.printRecord();
        }
    }
}