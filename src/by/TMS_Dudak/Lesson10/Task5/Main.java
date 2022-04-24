package by.TMS_Dudak.Lesson10.Task5;

import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        print("Дудак Даниил", 9, "Мат АНализ");
        print("Екатерина Булгак", 10, "Англ");

    }

    private static void print(String fullname, int mark, String subject) {
        Formatter formater = new Formatter();
        formater.format("Студент    %s: получил %s по предмету %s",  fullname, mark, subject);
        System.out.println(formater);
    }
}
