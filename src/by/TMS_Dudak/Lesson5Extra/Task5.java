package by.TMS_Dudak.Lesson5Extra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //«Сожмите» массив, выбросив из него каждый второй элемент

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива: ");
        int a = scanner.nextInt();
        int[] array = new int[a];

        int count = 0;

        for(int i = 0; i<array.length; i++){
            array[i]=random.nextInt(0,98);
            System.out.print(array[i]+ " ");
            if(i%2==0){
                array[i]=0;
                count++;
            }
        }

        System.out.print("\n");

        int[] newArr = new int[count];
        for(int i=0, j=1; i<array.length; i++){
            System.out.print(newArr[j] + " 0 ");
            if(i%2==0){
                newArr[j]=array[i];
            }

        }



    }
}
