package by.TMS_Dudak.Lesson15Stream.Task1;

import java.util.Comparator;

public class MyComparator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
