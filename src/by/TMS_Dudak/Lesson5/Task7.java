package by.TMS_Dudak.Lesson5;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] a = new int[12];
        int maxValue = -1;
        int index = 0;
        Random random = new Random();

        for(int i = 0; i<a.length; i++){
            a[i]= random.nextInt(0, 15);
            System.out.print(a[i]+ " ");
            if(maxValue<=a[i]){
                maxValue=a[i];
                index=i;
            }
        }

        System.out.println("\n Максимальный элемент в массиве: "+maxValue);
        System.out.println("Индекс последнего вхождения  макс. элемента в массив: "+ index);


    }
}
