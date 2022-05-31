package by.TMS_Dudak.TaskPotiki.TestTask1;

public class Main {
    public static void main(String[] args) throws Exception {
        //поток созданный первым способом
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        //вывод текущего потока
//        System.out.println(Thread.currentThread().getName());
//
//        //поток через интрфейс
//        MyRunThread myRunThread = new MyRunThread();
//        Thread thread2 = new Thread(myRunThread);
//        thread2.start();

//        new MyThread().start();
//        new MyThread().start();
//        new MyThread().start();
//        new MyThread().start();

        Thread thread1 = new Thread(new MyRunThread(), "Даник");
        Thread thread2 = new Thread(new MyRunThread(), "Настя");
        Thread thread3 = new Thread(new MyRunThread(), "Влад");
        Thread thread4 = new Thread(new MyRunThread(), "Полина");

        System.out.println(thread1.getName() + " начал заплыв!");
        thread1.start();

        System.out.println(thread2.getName() + " начал заплыв!");
        thread2.start();

        System.out.println(thread3.getName() + " начал заплыв!");
        thread3.start();

        System.out.println(thread4.getName() + " начал заплыв!");
        thread4.start();
    }


}
