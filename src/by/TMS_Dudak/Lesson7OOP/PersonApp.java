package by.TMS_Dudak.Lesson7OOP;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person("Daniil Dudak", 19);

        person.move();
        person.talk();

        person1.talk();
        person1.move();
    }
}
