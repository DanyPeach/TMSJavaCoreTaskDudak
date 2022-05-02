package by.TMS_Dudak.Lesson12Files.Lecture;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;


        try {
            File file = new File(".\\newTxtFile.txt");
            if(!file.exists()){
                throw new FileNotFoundException();
            }
          fileIn = new FileReader("file.txt");
          fileOut = new FileWriter("copied_file.txt");

          int a;
          while((a=fileIn.read()) !=-1){
              fileOut.write(a);
          }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileIn !=null){
                fileIn.close();
            }
            if(fileOut!=null){
                fileOut.close();
            }
        }
    }
}
