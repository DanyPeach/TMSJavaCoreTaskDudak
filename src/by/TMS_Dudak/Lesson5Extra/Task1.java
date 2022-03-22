package by.TMS_Dudak.Lesson5Extra;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        ArrayList b = new ArrayList();


        for(int i = 0; i< a.length; i++){
            a[i]= random.nextInt(0, 20);
            if(a[i]%3==0){
                b.add(a[i]);
            }
        }

        System.out.print(Arrays.toString(a));
        System.out.print("\n");
        System.out.print(Arrays.toString(b.toArray()));
    }
}
