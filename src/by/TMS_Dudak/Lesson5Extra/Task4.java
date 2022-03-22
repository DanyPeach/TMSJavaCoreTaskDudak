package by.TMS_Dudak.Lesson5Extra;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int minValue=31;

        int[] a = new int[10];
        for(int i = 0; i< a.length; i++){
            a[i]= random.nextInt(1, 100);
            System.out.print(a[i] + " ");
            if(a[i]%2!=0 &&  minValue>a[i]){
                minValue=a[i];
            }
        }
        System.out.print("\n Минимальный нечетный элемент " + minValue);

    }
}
