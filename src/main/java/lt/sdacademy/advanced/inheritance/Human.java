package lt.sdacademy.advanced.inheritance;

public class Human extends Being {

    private boolean gender;
    protected String race;

    @Override
    public void printInfo() {
        System.out.println("Human: " + gender);
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getInformation() {
        return "Gender: " + gender + ", race: " + race;
    }

    public String getInformation(String format) {
        return String.format(format, gender, race);
    }

    public void printNumber(Integer n) {
        System.out.println("integer " + n);
    }

    public void printNumber(Number n) {
        System.out.println("number " + n);
    }

    public void printRace() {
        System.out.println(this.race);
    }
}
