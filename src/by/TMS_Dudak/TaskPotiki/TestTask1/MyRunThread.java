package by.TMS_Dudak.TaskPotiki.TestTask1;

import java.util.Random;

public class MyRunThread implements Runnable {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " плывет!");
        Random random = new Random();
        int a = random.nextInt(2000, 11000);
        try {
            Thread.sleep(a);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " остановился");
        }

        System.out.println(Thread.currentThread().getName() + " доплыл до конца!");
        long end = System.currentTimeMillis();
        System.out.println("Участник по имени: " + Thread.currentThread().getName() + " закончил заплыв за " + (end - start) / 1000
                + " секунд!");
    }
}
