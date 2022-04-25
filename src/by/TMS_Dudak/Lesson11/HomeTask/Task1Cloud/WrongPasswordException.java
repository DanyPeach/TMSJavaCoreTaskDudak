package by.TMS_Dudak.Lesson11.HomeTask.Task1Cloud;

public class WrongPasswordException extends Exception{
    public WrongPasswordException() {
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
