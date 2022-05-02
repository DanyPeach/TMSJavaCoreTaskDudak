package by.TMS_Dudak.Lesson12Files.Task1_remastred;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {
    public List<String> bf(String input) throws IOException {
        Path path = Paths.get(input);
        List<String> list = new ArrayList<>();

        try(Stream<String> lineStream = Files.newBufferedReader(path).lines()){
            list = lineStream.collect(Collectors.toList());

        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }
}
