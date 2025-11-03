public class Cardiologist extends HealthProfessional {

    private String boardCertificationNumber;


    public Cardiologist() {
        super();
        this.boardCertificationNumber = "Not Certified";
    }


    public Cardiologist(int id, String name, String department, String boardCertificationNumber) {
        super(id, name, department);
        this.boardCertificationNumber = boardCertificationNumber;
    }


    @Override
    public void printDetails() {
        System.out.println("=== Cardiologist ===");
        super.printDetails();
        System.out.println("  Board Certification #: " + this.boardCertificationNumber);
        System.out.println("---------------------------");
    }


    public String getBoardCertificationNumber() { return boardCertificationNumber; }
    public void setBoardCertificationNumber(String boardCertificationNumber) {
        this.boardCertificationNumber = boardCertificationNumber;
    }
}