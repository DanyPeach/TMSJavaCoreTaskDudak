package by.TMS_Dudak.Lesson5Extra;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        int sum = 0;
        double finaleValue = 0;
        int c = 0;

        for (int i = 0; i< a.length; i++){
            a[i] = random.nextInt(1, 20);
            if(i%2==0){
                sum+=a[i];
                c++;
            }
            System.out.print(a[i] + " ");
        }
        finaleValue=(double) sum/c;
        System.out.println("\n Среднее арифметическое элементов с четными индексами "+finaleValue);
    }
}
