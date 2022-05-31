package by.TMS_Dudak.TaskPotiki.DzTask4;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Введите число, которое задаст размер массива: ");
        int a = scanner.nextInt();

        for(int i = 0; i<a; i++){
            int newNum = random.nextInt(0,11);
            list.add(newNum);
        }

        System.out.println(list);

        Thread thread1 = new Thread(ArrThread.minValue(list), "MinThread");
        Thread thread2 = new Thread(ArrThread.maxValue(list), "MaxThread");

        thread1.start();
        thread2.join();
        thread2.start();
    }
}
