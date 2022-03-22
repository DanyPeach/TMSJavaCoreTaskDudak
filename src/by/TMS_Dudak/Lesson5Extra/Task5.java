package by.TMS_Dudak.Lesson5Extra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = 0;
        while (true) {
            System.out.print("Введите число: ");
            a = scanner.nextInt();

            if (a < 3) {
                System.out.println("Неверное числовое значение");
            } else {
                break;
            }
        }

        int[] b = new int[a];

        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(0, 99);
        }

        int[] c = new int[a];
        for(int i = 0, j = 0; i< b.length; i++){
            if (i % 2 == 0) {
                c[j*2]=b[i];
                j++;
            }
        }

        System.out.print(Arrays.toString(b));
        System.out.print("\n");
        System.out.print(Arrays.toString(c));

    }
}
