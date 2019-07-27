package lt.sdacademy.advanced.inheritance;

public class Human extends Being {

    private boolean gender;

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
}
