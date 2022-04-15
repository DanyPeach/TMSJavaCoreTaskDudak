package by.TMS_Dudak.Lesson10;

import java.util.Locale;

public class Task1 {
    public static void main(String[] args) {
        String string = new String("I like Java!!!");
        System.out.println(string);
        System.out.println(string.charAt(13));//выводим последний символ
        System.out.println(string.endsWith("!!!")); //проверяем, являются ли !!! окончанием нашего стринга
        System.out.println(string.startsWith("I like"));//проверяем, является ли I like началом строки
        System.out.println(string.contains("Java"));//проверяет содержит ли строка  Java
        System.out.println(string.indexOf("Java"));
        System.out.println(string.replace("a", "o"));
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        System.out.println(string.substring(0, 14));

    }

}
