package by.TMS_Dudak.Lesson11.HomeTask.Task1;

import java.util.Random;

public class Car {
    private String mark;
    private int speed;
    private int price;


    public Car() {
        this.mark="None";
        this.speed=120;
        this.price=10000;
    }

    public Car(String mark, int speed, int price) {
        this.mark = mark;
        this.speed = speed;
        this.price = price;
    }

    public void getStarted (){
        Random random = new Random();
        try {
            int randomNumber = random.nextInt(0, 21);
            if(randomNumber%2==0){
                throw new MyExeption("Машина не завелась", randomNumber);
            }else{
                System.out.println("Машина завелась и готова двигаться!");
            }
        }catch (MyExeption e){
            System.out.println(e.toString());
        }
    }



    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
