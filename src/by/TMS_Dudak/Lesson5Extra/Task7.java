package by.TMS_Dudak.Lesson5Extra;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int count=0;
        System.out.print("Введите число: ");
        int b = scanner.nextInt();
        int[] a = new int[20];
        for (int i=0; i<a.length; i++){
            a[i]= random.nextInt(0,5);
            System.out.print(a[i] + " ");
            if(a[i]==b){
                count++;
            }
        }

        System.out.println("\nКоличесиво повторений числа "+b+" равно: " + count);

    }
}
