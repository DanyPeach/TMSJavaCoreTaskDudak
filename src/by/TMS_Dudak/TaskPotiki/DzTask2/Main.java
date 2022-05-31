package by.TMS_Dudak.TaskPotiki.DzTask2;

import by.TMS_Dudak.TaskPotiki.TestTask1.MyRunThread;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new by.TMS_Dudak.TaskPotiki.DzTask2.MyRunThread(), "Поток 1");
        Thread thread2 = new Thread(new by.TMS_Dudak.TaskPotiki.DzTask2.MyRunThread(), "Поток 2");
        Thread thread3 = new Thread(new by.TMS_Dudak.TaskPotiki.DzTask2.MyRunThread(), "Поток 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
