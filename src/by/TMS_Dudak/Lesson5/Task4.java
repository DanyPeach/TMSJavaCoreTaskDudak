package by.TMS_Dudak.Lesson5;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[20];
        Random random = new Random();

        for(int i=0; i<20; i++){
            a[i]=random.nextInt(0, 20);
            System.out.print(a[i] + " ");
        }

        System.out.print("\n");
        for(int i=0; i<20; i++){
            a[i]=random.nextInt(0, 20);
            if(i%2!=0){
            a[i]=0;}
            System.out.print(a[i] + " ");}
        }
    }

