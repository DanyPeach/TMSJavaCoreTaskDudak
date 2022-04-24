package by.TMS_Dudak.Lesson11.HomeTask.Task1;

public class MyExeption extends Exception{
    public MyExeption() {
    }

    public MyExeption(String message) {
        super(message);
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
}

