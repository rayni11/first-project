/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUESTION03;

/**
 *
 * @author Raini
 */
public class Appointment {
    
    private String patientName;
    private String appointmentType;
    private String patientCategory;
    private double baseFee;

    public Appointment(String patientName, String appointmentType, String patientCategory, double baseFee) {
        this.patientName = patientName;
        this.appointmentType = appointmentType;
        this.patientCategory = patientCategory;
        this.baseFee = baseFee;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public double calculateFinalFee() {
        double fee = baseFee;

        if (appointmentType.equals("Specialist")) {
            fee = fee + 1500;
        } else if (appointmentType.equals("Online")) {
            fee = fee - 500;
        }
        // General: no change

        if (patientCategory.equals("Child")) {
            fee = fee - 300;
        } else if (patientCategory.equals("Senior")) {
            fee = fee - 500;
        }
        // Adult: no change

        return fee;
    }

    public String getAppointmentMessage() {
        return appointmentType + " appointment selected";
    }
}
    

