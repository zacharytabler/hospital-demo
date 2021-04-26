package hospital;

public class Patient {

    private int healthLevel;
    private int bloodLevel;

    public int getHealthLevel() {
        return healthLevel;
    }

    //default contstructor for patient object
        public Patient() {
            healthLevel = 10; //default patient health level
            bloodLevel = 20;
        }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }

    public int getBloodLevel() {
        return bloodLevel;
    }

    public void decreaseBloodLevel(int bloodDecreaseAmount) {
        bloodLevel -= bloodDecreaseAmount;
    }
}
