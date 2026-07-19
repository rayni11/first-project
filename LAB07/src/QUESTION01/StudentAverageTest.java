/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION01;

/**
 *
 * @author Raini
 */
public class StudentAverageTest {
   
    public static void main(String[] args) {
        StudentAverageCalculator calculator = new StudentAverageCalculator(450, 0);

        try {
            int average = calculator.calculateAverage();
            System.out.println("Average: " + average);
        }
        catch (ArithmeticException e) {
            // occurs because dividing an integer by zero (0 students) is not allowed
            System.out.println("Error: Number of students cannot be zero.");
        }
        finally {
            System.out.println("Average calculation completed.");
        }

        System.out.println("Program continues...");
    }
}
    

