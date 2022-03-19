package by.TMS_Dudak.Lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];

        Random random = new Random();
        for(int i=0; i<5; i++){
            a[i]= random.nextInt(0, 15);
            b[i]= random.nextInt(0,15);

        }
        System.out.print(Arrays.toString(a));
        System.out.print("\n");
        System.out.print(Arrays.toString(b));

        double sumA = 0;
        double sumB = 0;
        for(int i=0; i<5; i++){
            sumA+=a[i];
            sumB+=b[i];
        }

        sumA/=a.length;
        sumB/=b.length;
        System.out.print("\n");

        if(sumA==sumB){
            System.out.println("Среднее арифметическое массивов совпадает: " + sumA);
        }else{
            double maxValue = sumA>sumB?sumA:sumB;
            System.out.println("Большее среднее значение: " + maxValue);
        }
    }
}
