package hospital;

public class Surgeon extends Doctor {

    private boolean inOperating;

    public Surgeon(String employeeNumber, String name, String specialty, boolean inOperating) {
    super(employeeNumber, name, specialty);
        this.inOperating = inOperating;
    }

    public int calculatePay() {
        return 120000;
    }
}

