package model;

public class PastCourse {
  private double grade;
  private Course course;

  public PastCourse(Course course, double grade) {
    this.grade = grade;
    this.course = course;
  }

  public double getGrade() { return this.grade; }
}
