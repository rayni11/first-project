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
        StaffMember.showSystemName();

        Lecturer lecturer1 = new Lecturer("Nimal Perera", "L001", "Computer Science", 3, 15000.0);
        Lecturer lecturer2 = new Lecturer("Sunil Fernando", "L002", "Mathematics", 2, 14000.0);
        LabAssistant assistant1 = new LabAssistant("Kamal Silva", "LA001", "Physics", 80, 500.0);

        lecturer1.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lecturer1.calculateMonthlyPayment());

        System.out.println();

        lecturer2.displayLecturerDetails();
        System.out.println("Monthly Payment: " + lecturer2.calculateMonthlyPayment());

        System.out.println();

        assistant1.displayLabAssistantDetails();
        System.out.println("Monthly Payment: " + assistant1.calculateMonthlyPayment());

        System.out.println();

        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
        System.out.println("Lecturer1 Bonus: " + UniversityPolicy.calculateBonus(lecturer1.calculateMonthlyPayment()));
        System.out.println("Lecturer2 Bonus: " + UniversityPolicy.calculateBonus(lecturer2.calculateMonthlyPayment()));
        System.out.println("Lab Assistant Bonus: " + UniversityPolicy.calculateBonus(assistant1.calculateMonthlyPayment()));

        System.out.println();

        System.out.println("Total Staff Created: " + StaffMember.getStaffCount());
    }
}

