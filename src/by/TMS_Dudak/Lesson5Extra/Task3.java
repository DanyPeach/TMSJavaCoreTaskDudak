package by.TMS_Dudak.Lesson5Extra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[10];
        int sum = 0;
        int amount = 0;
        double avarage;
        System.out.print("Введите число, относительно которого будут выбираться элементы массива: ");
        int number = scanner.nextInt();

        for(int i=0; i< array.length; i++){
            array[i]=random.nextInt(0,20);
            System.out.print(array[i]+" ");
            if(array[i]>number){
                sum += array[i];
                amount++;
            }
        }
        avarage=(double) sum/amount;
        System.out.print("\n Среднее арифметическое эдементов массива, которые больше "+ number+" равно: "+ avarage);

    }
}
