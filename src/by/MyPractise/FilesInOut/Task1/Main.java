package by.MyPractise.FilesInOut.Task1;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            System.out.print("Введите имя файла с его расширением: ");
            BufferedReader name = new BufferedReader(new InputStreamReader(System.in));

            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\user\\IdeaProjects" +
                    "\\TMSJavaCoreTaskDudak\\textsFiles\\" + name.readLine());

            int max = 0;
            while(fileInputStream.available()>0){
                int data = fileInputStream.read();
                if(data>max){
                    max=data;
                }
            }

            fileInputStream.close();
            System.out.println(max);
    }catch (FileNotFoundException e){
            System.err.println("Файл ненайден");
        }
    }
}
