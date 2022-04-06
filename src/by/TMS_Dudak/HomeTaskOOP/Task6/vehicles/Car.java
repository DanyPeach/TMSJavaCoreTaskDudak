package by.TMS_Dudak.HomeTaskOOP.Task6.vehicles;

import by.TMS_Dudak.HomeTaskOOP.Task6.details.Engine;
import by.TMS_Dudak.HomeTaskOOP.Task6.professions.Driver;
import by.TMS_Dudak.HomeTaskOOP.Task6.professions.Person;

public class Car {
    private String mark;
    private String clas;
    private int weight;
    private Driver driver;
    private Engine engine;


    public Car(){

    }

    public Car(String mark, String clas, int weight, Driver driver, Engine engine) {
        this.mark = mark;
        this.clas = clas;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворачиваем направо");
    }

    public void turnLeft(){
        System.out.println("Поворачиваем налево");
    }

    public void printInfo(){
        System.out.println("Марка машины: " + mark + "\nВладелец машины: "
                + driver.getFullName() + "\nВозраст владельца машины: " + driver.getAge() +
                "\nГендерная индификация водителя: "+ driver.getGender() + "\nКласс машины: " + clas + "\nВес машины: " +
                weight + "\nМотор машины: " + engine.getPower() + " " + engine.getPerformance());
    }
}