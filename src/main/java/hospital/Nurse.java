package hospital;

public class Nurse {
    private String employeeNumber;
    private String name;
    private String numberOfPatients;

    public Nurse(String employeeNumber, String name, String numberOfPatients) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.numberOfPatients = numberOfPatients;
    }

    public void careForPatient(Patient sickpatient) {
        sickpatient.increaseHealthLevel(10);
    }

    public void drawblood(Patient sickpatient) {
        sickpatient.decreaseBloodLevel(5);
    }


    public int calculatePay() {
        return 50000;
    }
}
