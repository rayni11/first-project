/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION01;

/**
 *
 * @author Raini
 */
public class StudentAverageCalculator {
    
    private int totalMarks;
    private int numberOfStudents;

    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    public int calculateAverage() {
        // no exception handling here - this is done in the test class
        return totalMarks / numberOfStudents;
    }
}

