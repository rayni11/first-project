/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab04;

/**
 *
 * @author Raini
 */
public class LAB04 {

    
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Nimal Perera", "L001", "Computer Science", 3, 15000.0);

        lecturer1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lecturer1.calculateMonthlyPayment());
    }
    }
