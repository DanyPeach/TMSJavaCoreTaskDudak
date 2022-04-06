package by.TMS_Dudak.HomeTaskOOP.Task6.vehicles;

import by.TMS_Dudak.HomeTaskOOP.Task6.details.Engine;
import by.TMS_Dudak.HomeTaskOOP.Task6.professions.Driver;

public class Sportcar extends Car{
    private String maxSpeed;

    public Sportcar(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Sportcar(String mark, String clas, int weight, Driver driver, Engine engine, String maxSpeed) {
        super(mark, clas, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Максимальная скорость" + maxSpeed);
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
