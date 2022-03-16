package by.TMS_Dudak.Lesson4;

public class Task1 {
    public static void main(String[] args) {
        int distance = 10;
        int day = 1;

        while(day<7){
            distance+=0.1*distance;
            day++;
        }

        System.out.println("За " + day + " дней спортсмен пробежал " + distance + " километров");
    }
}
