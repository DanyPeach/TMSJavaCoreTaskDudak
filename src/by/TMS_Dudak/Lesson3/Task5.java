package by.TMS_Dudak.Lesson3;

public class Task5 {
    public static void main(String[] args) {
        int a = 17;
        int b = -77;
        int c = 0;

        int positiveValue = 0;
        int negativeValue = 0;

        if(a>0){
            positiveValue++;
        } if(b>0){
            positiveValue++;
        } if (c>0){
            positiveValue++;
        }

        if(a<0){
            negativeValue++;
        } if(b<0){
            negativeValue++;
        } if (c<0){
            negativeValue++;
        }

        System.out.println("Количесвто положительных чисел: " + positiveValue);
        System.out.println("Количесвто отрицательных чисел: " + negativeValue);
    }
}
