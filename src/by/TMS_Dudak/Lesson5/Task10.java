package by.TMS_Dudak.Lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

//Работа с ArrayList http://developer.alexanderklimov.ru/android/java/arraylist.php#intro

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите число: ");
        int a = scanner.nextInt();

        if(a<3){
            System.out.println("Неверное числовое значение");
            System.exit(0);
        }

        int[] b = new int[a];
        ArrayList c = new ArrayList();

        for(int i = 0; i< b.length; i++){
            b[i]= random.nextInt(0, a);

            if(b[i]%2==0) {
                c.add(b[i]);
            }
        }
        System.out.print(Arrays.toString(b));
        System.out.print("\n");
        System.out.print(Arrays.toString(c.toArray()));

    }
}
