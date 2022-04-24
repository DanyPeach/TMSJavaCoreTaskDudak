package by.TMS_Dudak.Lesson11.HomeTask.Task1Cloud;

public class WrongPasswordException extends Exception{
    public String pasMesEx = "Неверный формат пароля";

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message, String pasMesEx) {
        super(message);
        this.pasMesEx=pasMesEx;
    }
}
