package by.TMS_Dudak.Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапозон для чисел: ");
        int a = scanner.nextInt();
        System.out.println("Число записано, введите второе число: ");
        int b = scanner.nextInt();

        int value1 = random.nextInt((b-a)+a);//чтобы так не делать поставьте 17 джаву
        int value2 = random.nextInt(a, b);

        int maxValue = value1>value2?value1:value2;

        System.out.println("Число являющееся большим из списка( "+ value1 +" , "+ value2 +") является: " + maxValue);
    }
}
