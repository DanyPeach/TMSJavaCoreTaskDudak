package by.TMS_Dudak.Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива ");
        int a = scanner.nextInt();

        int[] b = new int[a];

        for(int i=0; i< b.length; i++){
            b[i]=random.nextInt(0,15);
            System.out.print(b[i]+ " ");
        }

        int sumHalfArrLeft = 0;
        int sumHalfArrRight = 0;
        for(int i=0; i< b.length/2; i++){
            sumHalfArrLeft += b[i];
        }

        for(int i = b.length - 1;i> b.length/2; i--){
            sumHalfArrRight += b[i];
        }
         if(sumHalfArrRight>sumHalfArrLeft){
             System.out.println("\n Сумма элементов массива правой части ("+ sumHalfArrRight+ ") больше левой (" + sumHalfArrLeft + ")");
         }else if(sumHalfArrLeft>sumHalfArrRight){
             System.out.println("\n Сумма элементов массива левой части ("+ sumHalfArrLeft+ ") больше правой (" + sumHalfArrRight +")");
         }else{
             System.out.println("\n Суммы элементов массива правой и левой частей равны");
         }



    }
}
