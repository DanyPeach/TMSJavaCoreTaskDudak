package by.TMS_Dudak.Lesson5;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] a = new int[4];
        Random random = new Random();

        for(int i=0; i<4; i++){
            a[i]= random.nextInt(0,10);
            System.out.print(a[i] + " ");
            }
        if(a[0]<a[1] && a[1]<a[2] && a[2]<a[3]){
            System.out.println("Массив является строго возрастающей послежовательностью");
        }else{
            System.out.println("Массив не является строго возрастающей послежовательностью");
        }

    }
}
