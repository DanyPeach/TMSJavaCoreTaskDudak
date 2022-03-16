package by.TMS_Dudak.Lesson4;

public class Task5 {
    public static void main(String[] args) {
        double a = 1;
        double b = 2.54;
        double c = 0;

        for(double i = a; i<=20; i++ ){
            c = i * b;
            System.out.println(i +" сантиметров = " + c + " дюймов");
        }
    }
}
