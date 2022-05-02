package by.TMS_Dudak.Lesson12Files.Task1_remastred;

import java.util.ArrayList;
import java.util.List;

public class Polindrom {


    public List<String> parse(List<String> input){

        StringBuilder stringBuilder = new StringBuilder();
        List<String> result = new ArrayList<>();

        for(var item : input){
            stringBuilder.append(item);
            if(item.equals(stringBuilder.reverse().toString())){
                result.add(item);
            }
            stringBuilder.delete(0, stringBuilder.length());

        }
        return result;
    }
}
