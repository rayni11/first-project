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
        UniversityPolicy.showPolicyHeader();
        System.out.println();

        Lecturer lecturer1 = new Lecturer("Nimal Perera", "L001", "Computer Science", 3, 15000.0);
        Lecturer lecturer2 = new Lecturer("Sunil Fernando", "L002", "Mathematics", 2, 14000.0);
        LabAssistant assistant1 = new LabAssistant("Kamal Silva", "LA001", "Physics", 80, 500.0);

        lecturer1.changeDepartment("Software Engineering");

        lecturer1.displayLecturerDetails();
        lecturer2.displayLecturerDetails();
        assistant1.displayLabAssistantDetails();

        System.out.println();

        double payment1 = lecturer1.calculateMonthlyPayment();
        double payment2 = lecturer2.calculateMonthlyPayment();
        double payment3 = assistant1.calculateMonthlyPayment();

        System.out.println("Lecturer1 Payment: " + payment1);
        System.out.println("Lecturer2 Payment: " + payment2);
        System.out.println("Lab Assistant Payment: " + payment3);

        double totalPayment = payment1 + payment2 + payment3;
        System.out.println("Total Monthly Payment: " + totalPayment);

        System.out.println("Total Staff Created: " + StaffMember.getStaffCount());

        System.out.println();

        lecturer1.showCommonNotice();
        lecturer2.showCommonNotice();
        assistant1.showCommonNotice();
    }
}