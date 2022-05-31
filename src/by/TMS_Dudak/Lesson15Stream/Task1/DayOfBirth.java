package by.TMS_Dudak.Lesson15Stream.Task1;

import java.time.LocalDate;

public class DayOfBirth {
    public static boolean isLeapYear(int age){
        return LocalDate.of(LocalDate.now().getYear()-age, 1, 1).isLeapYear();
    }
}
