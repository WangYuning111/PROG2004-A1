public class GeneralPractitioner extends HealthProfessional {

    private boolean isFamilyDoctor;


    public GeneralPractitioner() {
        super();
        this.isFamilyDoctor = false;
    }


    public GeneralPractitioner(int id, String name, String department, boolean isFamilyDoctor) {
        super(id, name, department);
        this.isFamilyDoctor = isFamilyDoctor;
    }


    @Override
    public void printDetails() {
        System.out.println("=== General Practitioner ===");
        super.printDetails();
        System.out.println("  Family Doctor: " + (this.isFamilyDoctor ? "Yes" : "No"));
        System.out.println("---------------------------");
    }


    public boolean isFamilyDoctor() { return isFamilyDoctor; }
    public void setFamilyDoctor(boolean familyDoctor) { isFamilyDoctor = familyDoctor; }
}