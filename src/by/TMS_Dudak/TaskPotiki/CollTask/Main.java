package by.TMS_Dudak.TaskPotiki.CollTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Factor factor = new Factor();
        FutureTask<Integer> task = new FutureTask<Integer>(factor);
        new Thread(task).start();
        System.out.println("Факториал: " + task.get());
    }
}
