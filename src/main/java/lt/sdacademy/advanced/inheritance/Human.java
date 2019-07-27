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

    public void printRace() {
        System.out.println(this.race);
    }
}
