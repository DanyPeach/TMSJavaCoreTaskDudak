package by.TMS_Dudak.TaskPotiki.DzTask3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Method method = new Method();

        for(int i=0; i<3; i++){
            Thread thread = new Thread(new Task3Thread(method));
            thread.setName("Thread-" + i);
            thread.start();
            thread.join();
        }
    }
}
