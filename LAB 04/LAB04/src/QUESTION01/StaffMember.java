/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION01;

/**
 *
 * @author Raini
 */
public abstract class StaffMember {
    private String fullName;
    private final String staffId;
    protected String department;

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
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

    // StaffMember is abstract because "staff" on its own is just a general idea -
    // every real object must be a concrete type like Lecturer or LabAssistant,
    // each of which calculates payment differently.
    public abstract double calculateMonthlyPayment();
}