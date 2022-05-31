package by.TMS_Dudak.Lesson16.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String check = "255.255.255.16";
        Pattern pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}\\.\\d{2}");
        Matcher matcher = pattern.matcher(check);
        System.out.println(matcher.matches());
    }
}
