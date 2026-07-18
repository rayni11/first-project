/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab04;

/**
 *
 * @author Raini
 */
public abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;

    // staffCount is static because it tracks a total shared across ALL staff objects,
    // not something that belongs to one individual object.
    private static int staffCount = 0;

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++;
    }

    public String getFullName() {
        return fullName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getDepartment() {
        return department;
    }

    public final void displayBasicDetails() {
        System.out.println("Name: " + fullName);
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }

    public static void showSystemName() {
        System.out.println("Campus Staff Payment System");
    }

    public static int getStaffCount() {
        return staffCount;
    }

    // StaffMember is abstract because "staff" on its own is just a general idea -
    // every real object must be a concrete type like Lecturer or LabAssistant,
    // each of which calculates payment differently.
    public abstract double calculateMonthlyPayment();
}