package by.TMS_Dudak.TaskPotiki.ExtraLittleTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
       MyThread myThread = new MyThread("Thread-0");
       MyThread myThread2 = new MyThread("Thread-1");

       myThread.thread.start();
       myThread2.thread.join();
       myThread2.thread.start();
    }
}
