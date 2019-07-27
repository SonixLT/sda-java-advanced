package lt.sdacademy.advanced.encapsulation;

import java.math.BigDecimal;

public class Dog {

    private String name;
    private int age;
    private boolean gender;
    private String race;
    private BigDecimal weight;

    public Dog(boolean gender, String race) {
        this("", 0, gender, race, new BigDecimal(0));
    }

    public Dog(String name, int age, boolean gender, String race, BigDecimal weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        if (weight == null || new BigDecimal(0).compareTo(weight) >= 0) {
            return;
        }
        this.weight = weight;
    }
}
