package by.TMS_Dudak.Lesson12Files.Practice1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Writer {

    private File path;
    private File pathFrom;

    Writer() {

    }

    public Writer(File path, File pathFrom) {
        this.path = path;
        this.pathFrom=pathFrom;
    }

    public  void Bw() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        bufferedWriter.write(String.valueOf(path));
        bufferedWriter.close();
    }

    public static void fileCoping(File from, File to) throws IOException {
        Files.copy(from.toPath(), to.toPath());
    }
}
