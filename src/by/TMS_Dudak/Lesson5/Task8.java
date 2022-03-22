package by.TMS_Dudak.Lesson5;

import javax.lang.model.type.NullType;
import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        double[] c = new double[10];
        Random random = new Random();

        for(int i = 0; i<a.length; i++){
            a[i]= random.nextInt(0,9);
            b[i]= random.nextInt(0, 9);
            if(b[i]==0){
                b[i]=1;
            }
            c[i]=(double) a[i]/b[i];
        }

        System.out.print(Arrays.toString(a));
        System.out.print("\n");
        System.out.print(Arrays.toString(b));
        System.out.print("\n");
        System.out.print(Arrays.toString(c));

    }
}
