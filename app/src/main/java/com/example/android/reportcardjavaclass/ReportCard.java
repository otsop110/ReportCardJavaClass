package com.example.android.reportcardjavaclass;

/**
 * Created by Tarja on January 8, 2017
 */
public class ReportCard {
    private String StudentName;
    private int CourseID;
    private double Grade;

    // default constructor
    public ReportCard(String studentName) {
        this.StudentName = studentName;

    }

    // Set grade for a course
    public void setCourseGrade(int courseID, double grade) {
        this.CourseID = courseID;
        this.Grade = grade;
    }

    // Getter for Student name
    public String getStudentName() {
        return StudentName;
    }
    //Getter for CourseID
    public int getCourseID() {
        return CourseID;
    }
    //Getter for Grade
    public double getGrade() {
        return Grade;
    }
    //Print to string

    @Override
    public String toString() {
        return "ReportCard{" +
                "StudentName='" + StudentName + '\'' +
                ", CourseID=" + CourseID +
                ", Grade=" + Grade +
                '}';
    }

}