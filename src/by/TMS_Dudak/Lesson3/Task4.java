package by.TMS_Dudak.Lesson3;

public class Task4 {
    public static void main(String[] args) {
        int a = 98;
        int b = -76;
        int c = 67;

        int positiveValue = 0;

        if(a>0){
            positiveValue++;
        } if(b>0){
            positiveValue++;
        } if (c>0){
            positiveValue++;
        }

        System.out.println("Количесвто положительных чисел: " + positiveValue);

    }
}
