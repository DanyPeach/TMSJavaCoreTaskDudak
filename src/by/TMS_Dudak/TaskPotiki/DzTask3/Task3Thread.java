package by.TMS_Dudak.TaskPotiki.DzTask3;

public class Task3Thread extends Thread{
    private Method mb;

    public Task3Thread() {
    }

    public Task3Thread(Method mb) {
        this.mb = mb;
    }

    @Override
    public synchronized void run() {
        mb.inc();
    }
}
