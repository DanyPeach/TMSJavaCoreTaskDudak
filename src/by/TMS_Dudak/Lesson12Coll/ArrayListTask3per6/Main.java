package by.TMS_Dudak.Lesson12Coll.ArrayListTask3per6;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        List<String> towns = new ArrayList<>();

        cities.add("Minks");
        cities.add("Grodno");
        cities.add("Gomel");
        cities.add("Mogilev");
        cities.add("Vitebsk");
        cities.add("Brest");

        System.out.println(ChangeItem.sortByName(cities));
        ChangeItem.copyToNewArr(cities, towns);
        System.out.println(towns);
    }
}
