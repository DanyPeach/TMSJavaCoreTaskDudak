package by.TMS_Dudak.Lesson6;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    String software;
    String hardware;

    void displayInfo(){
        System.out.printf("Processor: " + processor + ". Software: " +software+". Hardware: " +
                hardware);
    }

    Computer(String p, String s,String h){
        processor = p;
        software = s;
        hardware = h;
    }

    void turnOn(){
        Random random = new Random();
        int randomValue = random.nextInt(0, 1);
        Scanner scanner = new Scanner(System.in);

        int amountOfTurningOn = 0;

        while (amountOfTurningOn<2){
                System.out.print("\nВведите число (0 либо 1) для включения компьютера: ");
                int valueEnter = scanner.nextInt();
                if(randomValue == valueEnter){
                    System.out.println("Компьютер включен!");
                    amountOfTurningOn++;

                System.out.println("Хотите выключить компьютер? (yes/no)");
                String valueQuestion = scanner.next();
                String yes = "yes";
                String no = "no";
                if(valueQuestion.equals(yes)){
                    System.out.print("Введите число (0 либо 1) для выключения компьютера: ");
                    int valueExit = scanner.nextInt();
                    int randomExit = random.nextInt(0, 1);
                    if (valueExit == randomExit){
                        System.out.println("Работа компьютера завершена успешно");

                    }else{
                        System.out.println("Он взорвался хахаха");
                        break;
                    }
                }else if(valueQuestion.equals(no)){
                    break;
                }else{
                    System.out.println("Неверное значение для ответа");
                }
            }else{
                    System.out.println("Включение привело ко взрыву компьютера");
                }
        }if(amountOfTurningOn == 2){
            System.out.println("Компьютер Взорвался");
        }
    }
}
