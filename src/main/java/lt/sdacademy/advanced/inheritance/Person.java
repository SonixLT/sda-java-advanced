package lt.sdacademy.advanced.inheritance;

import lt.sdacademy.advanced.inheritance.Human;

public class Person extends Human {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.setGender(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", gender='" + this.isGender() + '\'' +
            '}';
    }
}
