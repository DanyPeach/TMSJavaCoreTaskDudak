package by.TMS_Dudak.HomeTaskOOP.TaskNasled;

import java.util.Scanner;

public class Cargo extends Ground{
    private int loadCapacity;
    private Cargo[] cargoArr;

    public Cargo(int amountOfWeels, int oilCount) {
        super(amountOfWeels, oilCount);
    }

    public Cargo(String power, int speed, int weight, String mark, int amountOfWeels, int oilCount, int loadCapacity) {
        super(power, speed, weight, mark, amountOfWeels, oilCount);
        this.loadCapacity=loadCapacity;
    }

    public void getInfo(){
        System.out.println("Марка машины: " + getMark() +
                "\nМаксимальная скорость: " + getSpeed() +
                "\nВес машины: " + getWeight()+
                "\nМощность в лош. с" + getPower()+
                "\nКоличесвто колес: " + getAmountOfWeels()+
                "\nРасход топлива: " + getOilCount()+
                "\nГрузоподъемность в кг: " + loadCapacity);
    }

    public void checkMas(Cargo[] cargoArr){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите массу груза, который хотите загрузить: ");
        int a = scanner.nextInt();
        if(a<=loadCapacity){
            System.out.println("Грузовик загружен! Можно загрузить еще: " + (loadCapacity-a)  + " кг из " + loadCapacity + "кг");
        }else{
            System.out.println("Слишком тяжелый груз, выбирете грузовик побольше!" + "\nСписок грузовиков с большей грузоподъемностью:");
            for(Cargo i : cargoArr){
                if(i.loadCapacity > loadCapacity){
                    System.out.println("Марка Грузовика: "+i.getMark() + "\nМощность грузовика: " + i.getPower() + "\nРасход топлива: "
                    + i.getOilCount() + "\nГрузоподъемность: " + i.loadCapacity +"\n");
                }
            }
        }
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
