package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NurseTest {

    Nurse underTest = new Nurse ("1", "name", "3");
    Patient sickpatient = new Patient();

    @Test
    public void shouldBeAbleToIncreaseHealthLevelOfPatientFrom10To15WhenProvidingCare(){
        underTest.careForPatient(sickpatient);
        int patientHealthLevel = sickpatient.getHealthLevel();
        assertEquals(15, patientHealthLevel);
    }

        @Test
        public void shouldBeAbleToDecreaseBloodLevelFrom20To15WhenDrawingBlood(){
            underTest.drawblood(sickpatient);
            int patientBloodLevel = sickpatient.getBloodLevel();
            assertEquals(15, patientBloodLevel);
    }

    @Test
    public void shouldExpectASalaryOf90k() {
        int salary = underTest.calculatePay();
        assertEquals(50000, salary);
    }

}
