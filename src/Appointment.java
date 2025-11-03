public class Appointment {

    private String patientName;
    private String patientPhone;
    private String preferredTime;
    private HealthProfessional selectedDoctor;


    public Appointment() {
        this.patientName = "Unknown";
        this.patientPhone = "No phone";
        this.preferredTime = "Not specified";
        this.selectedDoctor = null;
    }


    public Appointment(String patientName, String patientPhone, String preferredTime, HealthProfessional selectedDoctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.preferredTime = preferredTime;
        this.selectedDoctor = selectedDoctor;
    }


    public void printAppointmentDetails() {
        System.out.println("=== Appointment Details ===");
        System.out.println("Patient: " + this.patientName);
        System.out.println("Phone: " + this.patientPhone);
        System.out.println("Time: " + this.preferredTime);
        if (this.selectedDoctor != null) {
            System.out.println("Doctor: " + this.selectedDoctor.getName());
        } else {
            System.out.println("Doctor: Not assigned");
        }
        System.out.println("---------------------------");
    }


    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(String preferredTime) {
        this.preferredTime = preferredTime;
    }

    public HealthProfessional getSelectedDoctor() {
        return selectedDoctor;
    }

    public void setSelectedDoctor(HealthProfessional selectedDoctor) {
        this.selectedDoctor = selectedDoctor;
    }
}