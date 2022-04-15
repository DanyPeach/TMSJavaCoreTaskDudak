package by.TMS_Dudak.HomeTaskOOP.TaskNasled;

import java.util.Scanner;

public class CitizenAir extends Air{
    private int amountOfPassengers;
    private boolean richClass;

    public CitizenAir(int wings, int minRoad) {
        super(wings, minRoad);
    }

    public CitizenAir(String power, int speed, int weight, String mark, int wings, int minRoad, int amountOfPassengers, boolean richClass) {
        super(power, speed, weight, mark, wings, minRoad);
        this.amountOfPassengers=amountOfPassengers;
        this.richClass=richClass;
    }


    public void pasSpaceInfo(CitizenAir[] citizenAirs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество пассажиров: ");
        int a = scanner.nextInt();
        if(a<=amountOfPassengers){
            System.out.println("Самолет заполнен! Можно посадить еще: " + (amountOfPassengers-a)  + " пассажира(-ов)");
        }else{
            System.out.println("Слишком большое количесвто пассажиров!" + "\nСписок самолетов с большим количеством мест:");
            for(CitizenAir i : citizenAirs){
                if(i.amountOfPassengers > amountOfPassengers){
                    System.out.println("Марка Самолета: "+i.getMark() + "\nМощность самолета: " + i.getPower() + "\nНаличие бизнес-класса: "
                            + i.richClass + "\nКоличесвто пассажиров: " + i.amountOfPassengers +"\n");
                }
            }
    }
    }


    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public void setAmountOfPassengers(int amountOfPassengers) {
        this.amountOfPassengers = amountOfPassengers;
    }

    public boolean isRichClass() {
        return richClass;
    }

    public void setRichClass(boolean richClass) {
        this.richClass = richClass;
    }
}
