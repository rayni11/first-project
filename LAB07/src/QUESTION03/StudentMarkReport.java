/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION03;

/**
 *
 * @author Raini
 */

    public class StudentMarkReport {
    private String[] marks;

    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    public int getMarkAt(int index) {
        // no exception handling here - this is done in the test class
        String markText = marks[index];
        return Integer.parseInt(markText);
    }
}

