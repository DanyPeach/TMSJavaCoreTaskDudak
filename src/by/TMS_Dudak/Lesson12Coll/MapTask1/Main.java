package by.TMS_Dudak.Lesson12Coll.MapTask1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Daniil", 1);
        map.put("Nikita", 2);
        map.put("Jenny", 3);
        map.put("Nastya", 4);

        System.out.println(map);
    }
}
