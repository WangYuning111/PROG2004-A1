import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {


        System.out.println("Part 3 - Using classes and objects:");
        System.out.println("Creating health professionals...\n");


        GeneralPractitioner gp1 = new GeneralPractitioner(101, "Dr. Alice Smith", "Family Medicine", true);
        GeneralPractitioner gp2 = new GeneralPractitioner(102, "Dr. Bob Johnson", "Primary Care", false);
        GeneralPractitioner gp3 = new GeneralPractitioner(103, "Dr. Charlie Brown", "Community Health", true);


        Cardiologist card1 = new Cardiologist(201, "Dr. David Wilson", "Cardiology", "CARD-12345");
        Cardiologist card2 = new Cardiologist(202, "Dr. Eva Davis", "Cardiovascular Surgery", "CARD-67890");


        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        card1.printDetails();
        card2.printDetails();

        System.out.println("-------------------------------------------------------------------");


        System.out.println("Part 5 - Appointment Collection Management");


        ArrayList<Appointment> appointments = new ArrayList<>();


        System.out.println("\nCreating appointments...");
        createAppointment(appointments, "John Smith", "0412345678", "10:00", gp1);
        createAppointment(appointments, "Mary Johnson", "0423456789", "14:30", gp2);
        createAppointment(appointments, "Robert Brown", "0434567890", "11:15", card1);
        createAppointment(appointments, "Lisa Davis", "0445678901", "15:45", card2);


        System.out.println("\nPrinting all existing appointments:");
        printExistingAppointments(appointments);


        System.out.println("\nCancelling appointment for phone: 0423456789");
        cancelBooking(appointments, "0423456789");


        System.out.println("\nUpdated appointments after cancellation:");
        printExistingAppointments(appointments);

        System.out.println("");
    }


    public static void createAppointment(ArrayList<Appointment> appointments,
                                         String patientName, String patientPhone,
                                         String preferredTime, HealthProfessional doctor) {

        if (patientName == null || patientPhone == null || preferredTime == null || doctor == null) {
            System.out.println("Error: All appointment information must be provided.");
            return;
        }


        Appointment newAppointment = new Appointment(patientName, patientPhone, preferredTime, doctor);
        appointments.add(newAppointment);
        System.out.println("Appointment created for: " + patientName + " with " + doctor.getName());
    }


    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            System.out.println("Total appointments: " + appointments.size());
            for (int i = 0; i < appointments.size(); i++) {
                System.out.print("Appointment " + (i + 1) + " - ");
                appointments.get(i).printAppointmentDetails();
            }
        }
    }


    public static void cancelBooking(ArrayList<Appointment> appointments, String patientPhone) {
        boolean found = false;


        for (int i = 0; i < appointments.size(); i++) {
            Appointment appointment = appointments.get(i);
            if (appointment.getPatientPhone().equals(patientPhone)) {
                System.out.println("Cancelling appointment for: " + appointment.getPatientName());
                appointments.remove(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No appointment found for phone: " + patientPhone);
        }
    }
}