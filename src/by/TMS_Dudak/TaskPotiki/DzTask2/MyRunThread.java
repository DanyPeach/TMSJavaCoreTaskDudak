package by.TMS_Dudak.TaskPotiki.DzTask2;

public class MyRunThread implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<=100; i++){
            if(i%10==0){
                System.out.println(i + " от потока " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(200);
//                if(Thread.currentThread().getState().equals(Thread.State.TIMED_WAITING)){
//                    System.out.println("поток уснул");
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
