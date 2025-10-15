package com.example.project;

public class Student {
    // INSTANCE VARIABLES (private)
    // first name (String)
    // last name (String)
    // graduation year (int)
    // sum of test scores (double).. should initialize at 0.0
    // test score count (int) ..should initialize at 0
    // highest test score (double).. should initialize at 0.0

    private String firstName;
    private String lastName;
    private int graduationYear;
    private double testScoreSum = 0.0;
    private int testScoreCount = 0;
    private double highestTestScore = 0.0;
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        //implement code here!
        this.firstName = firstName;
        this.lastName = lastName;
        this.graduationYear = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        //implement code here!
        return this.firstName;
    }
 
    // returns lastName
    public String getLastName() {
        //implement code here!
        return this.lastName;
    }
 
    public double getHighestTestScore() {
        //implement code here!
        return this.highestTestScore; //random double number
    }

    public int getTestScoreCount(){
        //implement code here!
        return this.testScoreCount;
    }

    public int getGradYear(){
        //implement code here!
        return this.graduationYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        //implement code here!
        this.graduationYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!
        this.testScoreCount ++;
        this.testScoreSum += newTestScore;
        if (newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        return averageTestScore() >= 65;
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        return this.testScoreSum/this.testScoreCount; //random double number
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 