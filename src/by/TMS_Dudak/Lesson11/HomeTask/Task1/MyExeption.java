package by.TMS_Dudak.Lesson11.HomeTask.Task1;

public class MyExeption extends Exception{
    private int a;
    public MyExeption() {
    }

    public MyExeption(String message, int a) {
        super(message);
        this.a=a;
    }

    public MyExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public MyExeption(Throwable cause) {
        super(cause);
    }

    public MyExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Машина не завелась. Причина:{" +
                "a=" + a +
                '}';
    }
}

