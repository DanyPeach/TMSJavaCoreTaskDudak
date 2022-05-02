package by.TMS_Dudak.Lesson12Coll.ArrayListTask4;

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

        Methods.findCity(2, cities);
    }
}
