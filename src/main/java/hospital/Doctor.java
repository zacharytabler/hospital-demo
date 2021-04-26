package hospital;

public class Doctor {


private String employeeNumber;
private String name;
private String specialty;

public Doctor(String employeeNumber, String name, String specialty) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.specialty = specialty;
    }

    public void careForPatient(Patient sickpatient) {
    sickpatient.increaseHealthLevel(10);



}

    public void drawblood(Patient sickpatient) {
        sickpatient.decreaseBloodLevel(5);
    }

    public int calculatePay() {
    return 90000;
    }
}
