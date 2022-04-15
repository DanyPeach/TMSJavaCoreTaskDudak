package by.TMS_Dudak.HomeTaskOOP.TaskNasled;

import java.util.Scanner;

public class Car extends Ground{
    Scanner scanner = new Scanner(System.in);
    private String body;
    private int passengers;


    public Car(int amountOfWeels, int oilCount) {
        super(amountOfWeels, oilCount);
    }

    public Car(String power, int speed, int weight, String mark, int amountOfWeels, int oilCount, String body, int passengers) {
        super(power, speed, weight, mark, amountOfWeels, oilCount);
        this.body=body;
        this.passengers=passengers;
    }

    public void getInfo(){
        System.out.println("Марка машины: " + getMark() +
                "\nМаксимальная скорость: " + getSpeed() +
                "\nВес машины: " + getWeight()+
                "\nМощность в лош. с" + getPower()+
                "\nКоличесвто колес: " + getAmountOfWeels()+
                "\nРасход топлива: " + getOilCount()+
                "\nЦвет кузова: " + body+
                "\nКоличество мест: " +passengers);
    }

    public void getRashodnik(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время движения автомабиля(в часах): ");
        int time = scanner.nextInt();
        int path = time*getSpeed();
        int oil = getOilCount() * time;
        System.out.println("За время " + time +" часа(-ов), автомобиль " + getMark() + " проехал " + path + " километров " +
                "с максимальной скоростью " + getSpeed() +
                " и израсходавало " + oil + " литров");

    }
}
