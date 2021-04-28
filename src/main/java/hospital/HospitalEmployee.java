package hospital;

public abstract class HospitalEmployee {
    protected String employeeNumber;
    protected String name;

    public HospitalEmployee(String employeeNumber, String name) {
        this.employeeNumber = employeeNumber;
        this.name = name;
    }

    public abstract int calculatePay();
}
