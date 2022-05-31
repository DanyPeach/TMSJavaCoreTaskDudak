package by.TMS_Dudak.TaskPotiki.ExtraLittleTask;

import java.util.Locale;

public class MyThread implements Runnable {
    Thread thread;
    String name;

    public MyThread(String name) {
        thread = new Thread(this);
        this.name = name;
    }

    public synchronized static void Lol(){
        String a = "";
        if (Thread.currentThread().getName().equals("Thread-0")) {
            a = "\nЯ королева!";
        } else if (Thread.currentThread().getName().equals("Thread-1")) {
            a = "Лол";
        }
        char[] arr = a.toCharArray();

        for (var i : arr) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i);
        }
        System.out.println("\n" + Thread.currentThread().getName());
    }

    @Override
    public synchronized void run() {
       MyThread.Lol();
    }
}

