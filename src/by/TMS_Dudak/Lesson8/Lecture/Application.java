package by.TMS_Dudak.Lesson8.Lecture;

import by.TMS_Dudak.HomeTaskOOP.Task2.Person;

public class Application extends Entity{
    private int height;
    private int age;
    private String name;
    private String lastName;

    public Application(){

    }

    public Application(int age, int height, String name){
        this.age = age;
        this.height = height;
        this.name = name;

    }

    public Application(int id, String name){
        super(id);
        this.name = name;
    }

}
