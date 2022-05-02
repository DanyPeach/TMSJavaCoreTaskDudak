package by.TMS_Dudak.Lesson12Coll.ArrayListTask2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Minks");
        cities.add("Grodno");
        cities.add("Gomel");
        cities.add("Mogilev");
        cities.add("Vitebsk");
        cities.add("Brest");

        for(var i : cities){
            System.out.println(i);
        }
    }
}
