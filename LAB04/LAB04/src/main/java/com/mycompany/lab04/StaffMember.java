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

    // changeDepartment(...) is useful because it controls HOW the department can be
    // changed (validating the input first), instead of letting outside code overwrite
    // the field directly and possibly set it to something invalid like an empty string.
    public void changeDepartment(String newDepartment) {
        if (!newDepartment.isEmpty()) {
            this.department = newDepartment;
        }
    }

    public final void showCommonNotice() {
        System.out.println("Notice: All staff must submit attendance records monthly.");
    }

    public abstract double calculateMonthlyPayment();
}