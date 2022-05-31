package by.TMS_Dudak.Lesson15Stream.Task2;

import by.TMS_Dudak.Lesson14.Task2.Predicate;

public class Bwork implements Testible{
    public Bwork() {
    }

    @Override
    public void test(int a) {

    }

    @Override
    public int defTest(int b) {
        return Testible.super.defTest(b);
    }

    static  int statTest(int b){
        b +=300;
        return b;
    }

    public static void main(String[] args) {
        Bwork bwork = new Bwork();
        bwork.defTest(4);

        Predicate<String[]> predicate = s -> s.length>5;
    }
}
