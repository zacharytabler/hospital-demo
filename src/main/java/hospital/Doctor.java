package hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties {


    private String specialty;

public Doctor(String employeeNumber, String name, String specialty) {
    super(employeeNumber, name);
    this.specialty = specialty;
    }

    @Override
    public void careForPatient(Patient sickpatient) {
    sickpatient.increaseHealthLevel(10);



}

    @Override
    public void drawblood(Patient sickpatient) {
        sickpatient.decreaseBloodLevel(5);
    }

    @Override
    public int calculatePay() {
    return 90000;
    }
}
