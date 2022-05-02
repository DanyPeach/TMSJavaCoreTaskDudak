package by.TMS_Dudak.Lesson12Files.Task1_remastred;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class WriteFile {
    public void write(String output, List<String> list){
        Path path = Paths.get(output);
        try{
            Files.write(path, list);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
