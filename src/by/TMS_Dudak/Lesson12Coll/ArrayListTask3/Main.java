package by.TMS_Dudak.Lesson12Coll.ArrayListTask3;

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

        Method.addToTheFirstPlace("Pinsk", cities);
        System.out.println(cities);
    }
}
