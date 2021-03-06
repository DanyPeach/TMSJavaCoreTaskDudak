package by.TMS_Dudak.HomeTaskOOP.Task6;

import by.TMS_Dudak.HomeTaskOOP.Task6.details.Engine;
import by.TMS_Dudak.HomeTaskOOP.Task6.professions.Driver;
import by.TMS_Dudak.HomeTaskOOP.Task6.professions.Person;
import by.TMS_Dudak.HomeTaskOOP.Task6.vehicles.Car;
import by.TMS_Dudak.HomeTaskOOP.Task6.vehicles.Lorry;
import by.TMS_Dudak.HomeTaskOOP.Task6.vehicles.Sportcar;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Daniil Dudak", 12);
        Driver driver2 = new Driver("22", "Male", "Dmitriy Poltoran", 2);
        Driver driver3 = new Driver("38", "Male", "Maxim Novikov",1);
        Person person1 = new Driver("23","Female","Maria Krupskai",0);
        Engine engine1 = new Engine("120", "344p");

        Car car1 = new Car("Volvo xc90", "e", 1200, driver1, engine1 );
        Car car2 = new Lorry("MAN","c2",3500, driver2,engine1,"500 kg");
        Car car3 = new Sportcar("BUGATTI", "sport", 800, driver3, engine1, "300 km/h");


        car1.printInfo();
        System.out.println("\n");
        car2.printInfo();
        System.out.println("\n");
        person1.noCarInfo();
        System.out.println("\n");
        car3.printInfo();


    }
}
