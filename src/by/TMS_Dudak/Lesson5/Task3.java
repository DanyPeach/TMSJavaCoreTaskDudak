package by.TMS_Dudak.Lesson5;

import java.util.LinkedList;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int b = 0;
        Random random = new Random();

        for(int i=0; i< a.length; i++){
            a[i]=random.nextInt(1, 99);
            System.out.print(a[i] + " ");
           if(a[i]%2==0){
               b++;
           }
        }

        System.out.println("\n"+"Количесвто четных элементов массива: "+ b);

    }
}
