package com.example.android.reportcardjavaclass;

/**
 * Created by Tarja on January 8, 2017
 */
public class ReportCard {
    private String mStudentName;
    private int mCourseID;
    private double mGrade;

    // default constructor
    public ReportCard(String studentName) {
        mStudentName = studentName;
    }
    // Method to set grade to the course
    public void setCourseGrade(int courseID, double grade) {
        mCourseID = courseID;
        mGrade = grade;
    }
    // Getter for Student name
    public String getStudentName() {
        return mStudentName;
    }
    //Getter for CourseID
    public int getCourseID() {
        return mCourseID;
    }
    //Getter for Grade
    public double getGrade() {
        return mGrade;
    }
    //Print to string
    public String toString() {
        return "Report card of: " + getStudentName() + "\nCourse: " + getCourseID() + "\nGrade: " + getGrade();
    }
}