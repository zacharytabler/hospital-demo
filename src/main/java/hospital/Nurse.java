package hospital;

public class Nurse extends HospitalEmployee implements  MedicalDuties{


    private String numberOfPatients;

    public Nurse(String employeeNumber, String name, String numberOfPatients) {
        super(employeeNumber, name);
        this.numberOfPatients = numberOfPatients;
    }

    @Override
    public void careForPatient(Patient sickpatient) {
        sickpatient.increaseHealthLevel(5);
    }

    @Override
    public void drawblood(Patient sickpatient) {
        sickpatient.decreaseBloodLevel(5);
    }

@Override
    public int calculatePay() {
        return 50000;
    }
}
