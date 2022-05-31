package by.TMS_Dudak.Lesson15Stream.Task2;

public interface Testible {
    void test(int a);

    default int defTest(int b){
        b += 100;
        privTest(b);
        return b;
    }

    private void privTest(int b){
        System.out.println(b);
    }

    static  int statTest(int b){
        b +=300;
        return b;
    }
}
