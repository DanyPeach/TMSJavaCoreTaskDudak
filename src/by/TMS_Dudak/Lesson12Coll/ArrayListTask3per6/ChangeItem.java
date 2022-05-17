package by.TMS_Dudak.Lesson12Coll.ArrayListTask3per6;

import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.List;

public class ChangeItem {



    //TASK3
    public static void addToTheFirstPlace(String city, List<String> to){
        to.add(0, city);
    }

    //TASK4
    public static void findCity(int i, List<String> cities){
        System.out.println(cities.get(i));
    }

    //TASK 5
    public static void change(List<String> list){
        list.set(3, "Minskiii");
    }

    //TASK6
    public static void deleteThird(List<String> list){
        list.remove(3);
    }

    //TASK7
    public static void findItem(List<String> list, int i){
        if(list.contains(list.get(i))){
            System.out.println("Город " + list.get(i) + " есть в списке");
        }
    }

    //TASK8
    public static List<String> sortByName(List<String> list){
        Collections.sort(list);
        return list;
    }

    //TASK9
    public static void copyToNewArr(List<String> from, List<String> to){
        to.addAll(from);
    }

    //TASK11
    public static void reverseList(List<String> list){
        Collections.reverse(list);
    }

    //TASK12
    public static List<String> getPart(List<String> list, int i){
        list.subList(0, i);
        return list;
    }

    //TASK13
    public static boolean compareToArr(List<String> list1, List<String> list2){
        return list1.contains(list2);
    }


}
