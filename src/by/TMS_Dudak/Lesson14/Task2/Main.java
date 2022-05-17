package by.TMS_Dudak.Lesson14.Task2;

import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String o = scanner.next();
        Predicate<String> predicate = Objects::nonNull;
        System.out.println(predicate.test(o));

    }

}
