/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04;

/**
 *
 * @author Raini
 */
public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "Sample University of Technology";
    public static final double BONUS_RATE = 0.05;

    public static void showPolicyHeader() {
        System.out.println("===== University Payment Policy =====");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }

    // UniversityPolicy is final because the university's payment rules must stay fixed
    // and consistent for everyone - allowing subclasses could let some staff types
    // override or bypass the official policy.
}
    

