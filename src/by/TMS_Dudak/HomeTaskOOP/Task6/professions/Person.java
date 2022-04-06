package by.TMS_Dudak.HomeTaskOOP.Task6.professions;

import java.util.Objects;

public class Person{
    private String age;
    private String gender;

    public Person() {
    }

    public Person(String age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public String getAge(){
        this.age = Objects.requireNonNullElse(age, "Неизвестно");
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        this.gender = Objects.requireNonNullElse(gender, "Неизвестно");
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void noCarInfo(){
        System.out.println("У этого человека нет машины" + getAge() + " " + getGender());
    }
}