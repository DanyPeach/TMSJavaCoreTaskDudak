package by.TMS_Dudak.Lesson12Files.Task1_remastred;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        WriteFile writeFile = new WriteFile();
        ReadFile readFile = new ReadFile();
        Polindrom polindrom = new Polindrom();

        String inputPath = "C:\\Users\\user\\IdeaProjects\\TMSJavaCoreTaskDudak\\textsFiles\\PracTask1Data.txt";
        String outputPath = "C:\\Users\\user\\IdeaProjects\\TMSJavaCoreTaskDudak\\textsFiles\\PracTask1Result.txt";

        List<String> list = new ArrayList<>();

        list = readFile.bf(inputPath);
        list = polindrom.parse(list);
        writeFile.write(outputPath, list);
        System.out.println(list);
    }
}
