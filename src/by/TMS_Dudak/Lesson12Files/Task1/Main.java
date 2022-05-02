package by.TMS_Dudak.Lesson12Files.Task1;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File(".\\Text.txt"); //создаем новый файл
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            //Плохой способ, смотреть Task1_remasterd в папке Lesson12Files



            // в try мы создаем bufferReader. Он в конструкторе приниает файл реадер, а файл реадер в своем конструткоре принимает файл.
            // Это поток вывода (FileReader) который читает по-символьно
            if(file.createNewFile()){  //проверка на созданный файл
                System.out.println("Файл мега создан");
            }

            String line = bufferedReader.readLine();
            StringBuilder stringBuilder = new StringBuilder(); //будем считывать в стрингбилдер

            while(line != null){
                stringBuilder.append(line).append("\n");
                line = bufferedReader.readLine();
            }

            String[] wordsArr = stringBuilder.toString().split("\n");
            for (String s : wordsArr) {
                if(s.equalsIgnoreCase(new StringBuilder().append(s).reverse().toString())){
                    try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(".\\OutPutText.txt"))) {
                        //
                        bufferedWriter.write(s + "\n");
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
