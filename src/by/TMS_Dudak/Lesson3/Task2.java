package by.TMS_Dudak.Lesson3;

public class Task2 {
    public static void main(String[] args) {
        int firstSide = 10;
        int secondSide = 17;
        int thirdSide = 8;

        if(firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide
                                              && firstSide + thirdSide > secondSide){
            System.out.println("Треугольник существует");
        }else{
            System.out.println("Треугольника не существует");
        }
    }
}
