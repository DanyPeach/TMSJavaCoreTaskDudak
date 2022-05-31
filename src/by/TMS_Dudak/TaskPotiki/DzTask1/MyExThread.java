package by.TMS_Dudak.TaskPotiki.DzTask1;

public class MyExThread extends Thread{
    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Symblol " + (i+1) );
        }

        //throw new RuntimeException();
    }
}
