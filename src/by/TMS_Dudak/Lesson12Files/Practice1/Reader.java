package by.TMS_Dudak.Lesson12Files.Practice1;

import java.io.*;

public class Reader {
    private File path;

    public Reader() {
    }

    public Reader(File path) {
        this.path = path;
    }

    public void bR() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String c;

        while((c=bufferedReader.readLine())!=null){
            System.out.println(c);
        }

        String line = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder(); //будем считывать в стрингбилдер

        while(line != null){
            stringBuilder.append(line).append("\n");
            line = bufferedReader.readLine();
        }
    }
}

