public class HealthProfessional {

    private int id;
    private String name;
    private String department;


    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.department = "General";
    }


    public HealthProfessional(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }


    public void printDetails() {
        System.out.println("Health Professional Details:");
        System.out.println("  ID: " + this.id);
        System.out.println("  Name: " + this.name);
        System.out.println("  Department: " + this.department);
    }


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}