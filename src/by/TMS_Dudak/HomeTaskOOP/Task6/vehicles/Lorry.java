package by.TMS_Dudak.HomeTaskOOP.Task6.vehicles;

import by.TMS_Dudak.HomeTaskOOP.Task6.details.Engine;
import by.TMS_Dudak.HomeTaskOOP.Task6.professions.Driver;
import by.TMS_Dudak.HomeTaskOOP.Task6.professions.Person;

public class Lorry extends Car{
    private String loadCapacity;

    public Lorry(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Lorry(String mark, String clas, int weight, Driver driver, Engine engine, String loadCapacity) {
        super(mark, clas, weight, driver, engine);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Грузоподъемность: " + loadCapacity);
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
