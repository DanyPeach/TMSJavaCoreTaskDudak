package by.TMS_Dudak.TaskPotiki.DzTask4;

import javax.print.attribute.standard.RequestingUserName;
import java.util.ArrayList;

public class ArrThread{
    public static Runnable minValue(ArrayList<Integer> list){
        return () -> {
            int min = list.get(0);
            for (int i = 1; i< list.size(); i++){
                if(list.get(i)<min){
                    min = list.get(i);
                }
            }
            System.out.println("Минимальное число в массиве: " + min + " Выполнено в " + Thread.currentThread().getName());
        };
    }


    public static Runnable maxValue(ArrayList<Integer> list){
        return () -> {
            int max = list.get(0);
            for (int i = 1; i< list.size(); i++){
                if(list.get(i)>max){
                    max = list.get(i);
                }
            }
            System.out.println("Максимальное число в массиве: " + max + " Выполнено в " + Thread.currentThread().getName());
        };
    }
}
