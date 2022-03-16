package by.TMS_Dudak.Lesson4;

public class Task3 {
    public static void main(String[] args) {
        int a = 1;

        for(int i = a; i<=256; i*=2){
            System.out.println(i);
            a = i;
            a += a;
        }

        System.out.println("Сумма 1, 2, 4, 8 ... 256 равна " + a );
    }
}
