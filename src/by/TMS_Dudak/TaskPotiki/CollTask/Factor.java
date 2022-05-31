package by.TMS_Dudak.TaskPotiki.CollTask;

import java.util.Random;
import java.util.concurrent.Callable;

public class Factor implements Callable<Integer> {


    public Factor() {
    }

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        int a = random.nextInt(0,20);
        int factorial = 1;
        for(int i=1; i<=a; i++){
            factorial*=i;
        }
        return factorial;
    }
}
