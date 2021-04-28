package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {
    Surgeon undertest = new Surgeon("1", "name", "Specialty", true);
    Patient sickpatient = new Patient();

    @Test
    public void shouldBeAbleToIncreaseHealthLevelOfPatientFrom10To20WhenProvidingCare() {
        undertest.careForPatient(sickpatient);
        int patientHealthLevel = sickpatient.getHealthLevel();
        assertEquals(20, patientHealthLevel);
    }

    @Test
    public void shouldBeAbleToDecreaseBloodLevelFrom20To15WhenDrawingBlood() {
        undertest.drawblood(sickpatient);
        int patientBloodLevel = sickpatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);

    }

        @Test
        public void shouldExpectASalaryOf120k () {
            int salary = undertest.calculatePay();
            assertEquals(120000, salary);
        }
    }
