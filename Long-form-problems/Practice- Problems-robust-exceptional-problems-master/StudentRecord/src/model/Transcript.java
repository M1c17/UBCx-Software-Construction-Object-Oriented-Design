package model;

import exceptions.CourseFullException;
import exceptions.GPATooLowException;
import exceptions.MissingPrereqException;
import exceptions.NoCoursesTakenException;

import java.util.LinkedList;
import java.util.List;

public class Transcript {

    private String name;
    private int year;
    private int id;
    private List<Course> currentCourses;
    private List<PastCourse> pastCourses;

    public Transcript(String studentName, int academicYear, int studentID) {
        name = studentName;
        year = academicYear;
        id = studentID;
        currentCourses = new LinkedList<>();
        pastCourses = new LinkedList<>();

    }

    // getters
    public String getName() { return name; }
    public int getAcademicYear() { return year; }
    public int getId() { return id; }
    public List<Course> getCurrentCourses() { return currentCourses; }
    public List<PastCourse> getPastCourses() { return pastCourses; }

    //helper function for compute cGPA
    public double percentToGPA(double pcnt) {
        return (pcnt/20) -1;
    }

    // EFFECTS: computes cGPA
    //          if the list of past courses is empty, throws NoCoursesTakenException
    public double computeGPA() throws NoCoursesTakenException {
        //          HINTS:
        //          use the following formula to convert into a GPA
        //          GPA (4.0 scale) = (total percentage/20) - 1
        //          **Do you need a helper method?**

        if(this.pastCourses.isEmpty()) {
            throw new NoCoursesTakenException("There is no Courses taken");
        }else {
            double totalGrade = 0;
            for (PastCourse pc : pastCourses) {
                totalGrade += pc.getGrade();
            }
            return percentToGPA(totalGrade /pastCourses.size());
        }
    }

    // EFFECTS: promotes the student represented by the transcript
    //          to the next academic year if GPA is over 2.6 on a 4.0 scale, and return true
    //          else return false with no change to the year field
    //          if GPA is not over 2.6 on a 4.0 scale, throws GPATooLowException
    //          if no courses have been taken, throws NoCoursesTakenException
    public boolean promoteStudent() throws GPATooLowException, NoCoursesTakenException {

        try {
            double thisGPA = this.computeGPA();
            if (thisGPA <= 2.6) {
                throw new GPATooLowException(getName() + " Cannot be promoted the GPA is over promedio");
            } else {
                this.year++;
            }
        }catch (NoCoursesTakenException e) {
            System.out.println(e.getMessage());
            throw e;
             }
        return false;
    }

    // MODIFIES: this
    // EFFECTS: adds the given course to the list of past courses and returns true,
    //          unless pastCourses contains given course, then does not add and returns false
    public boolean addToPastCourses(Course c, double grade) {

        PastCourse pastcourse = new PastCourse(c, grade);

        if(!pastCourses.contains(pastcourse)) {
            pastCourses.add(pastcourse);
            return true;
        }
        return false;
    }

    // MODIFIES: this
    // EFFECTS: adds a course (c) into the record
    //          if the transcript is missing prerequisites, throws a MissingPrereqException
    //          if the course has no space for more students to register, throws a CourseFullException
    public void addCourse(Course course) throws MissingPrereqException, CourseFullException {

      if(pastCourses.isEmpty() && !course.getPrereq().isEmpty()) {
          throw new MissingPrereqException("The student does not have enough prerequisites");
      }else if(course.isCourseFull()) {
          throw new CourseFullException("The course is full");
      }else if(course.getPrereq().isEmpty()) {
          currentCourses.add(course);
          course.addStudent();
      }else{
          for (Course c : course.getPrereq()) {
              if(!pastCourses.contains(c)) {
                  throw new MissingPrereqException("The student:" + getName() + "does not have the neccesary prerequisites");
              }
          }
          currentCourses.add(course);
          course.addStudent();
      }
        // You have to realize that there are a number of cases that your code needs to consider. What if the course
        // you wish to add has no prerequisites? What if the course you want to add is already full?
        // Careful consideration of these cases will lead to code that is correct.
    }
}
