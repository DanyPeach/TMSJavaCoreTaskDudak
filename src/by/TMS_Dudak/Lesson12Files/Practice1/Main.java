package by.TMS_Dudak.Lesson12Files.Practice1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\TMSJavaCoreTaskDudak\\Pracrice1.txt");
        File fileCopied = new File("C:\\Users\\user\\IdeaProjects\\TMSJavaCoreTaskDudak\\Practice1copied.txt");
        Reader reader = new Reader(file);
        Writer writer = new Writer(fileCopied, file);

        writer.Bw();
        reader.bR();



    }
}
