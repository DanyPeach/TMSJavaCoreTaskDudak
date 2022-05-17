package by.TMS_Dudak.Lesson12Coll.LinkedListTasks;

import java.util.LinkedList;
import java.util.List;

public class LinkedMethods {
    //Task1
    public static void addToTheLastPlace(LinkedList<String> list, String lastStr){
        list.addLast(lastStr);
        System.out.println(list);
    }

    //Task2
    public static void showAllItems(LinkedList<String> list){
        for(var i : list){
            System.out.println(i);
        }
    }

    //Task3
    public static void showFrom(LinkedList<String> list, int i){
        for(int j=0; j+i< list.size(); j++){
            System.out.println(list.get(j+i));
        }
    }
}
