package com.example.android.reportcardjavaclass;

/**
 * Created by Tarja on January 8, 2017
 */
public class ReportCard {
    private String studentName;
    private int courseID;
    private double grade;

    // default constructor
    public ReportCard(String studentName, int courseID, double grade) {
        this.studentName = studentName;
        this.courseID = courseID;
        this.grade = grade;
    }

    // Set grade for a course
    public void setCourseGrade(int courseID, double grade) {
        this.courseID = courseID;
        this.grade = grade;
    }

    // Getter for Student name
    public String getStudentName() {
        return studentName;
    }
    //Getter for CourseID
    public int getCourseID() {
        return courseID;
    }
    //Getter for Grade
    public double getGrade() {
        return grade;
    }
    //Print to string

    @Override
    public String toString() {
        return "ReportCard{" +
                "StudentName='" + studentName + '\'' +
                ", CourseID=" + courseID +
                ", Grade=" + grade +
                '}';
    }
}