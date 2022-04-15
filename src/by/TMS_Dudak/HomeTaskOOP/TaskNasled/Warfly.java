package by.TMS_Dudak.HomeTaskOOP.TaskNasled;

import java.util.Scanner;

public class Warfly extends Air{
    private boolean ejection;
    private int rocketAmount;

    public Warfly(int wings, int minRoad) {
        super(wings, minRoad);
    }

    public Warfly(String power, int speed, int weight, String mark, int wings, int minRoad, boolean ejection, int rocketAmount) {
        super(power, speed, weight, mark, wings, minRoad);
        this.ejection=ejection;
        this.rocketAmount=rocketAmount;
    }

    public void battleReadyInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Стреляем? (0 - да, 1 - нет): ");
        int a = scanner.nextInt();
        if(a == 0){
            if (rocketAmount!=0){
                System.out.println("Стреляем!");
            }else{
                System.out.println("Потронов нет, сорьки(");
            }
        }
    }

    public void ejectionCheck(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Катапультируемся? (0 - да, 1 - нет): ");
        int a = scanner1.nextInt();
        if(a == 0){
            if (ejection == true){
                System.out.println("ПОЛЕТЕЛИИИИ!");
            }else{
                System.out.println("Увы, этой функции нет(");
            }
        }
    }

    public boolean isEjection() {
        return ejection;
    }

    public void setEjection(boolean ejection) {
        this.ejection = ejection;
    }

    public int getRocketAmount() {
        return rocketAmount;
    }

    public void setRocketAmount(int rocketAmount) {
        this.rocketAmount = rocketAmount;
    }
}
