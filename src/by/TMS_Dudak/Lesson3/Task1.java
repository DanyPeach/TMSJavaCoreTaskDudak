package by.TMS_Dudak.Lesson3;

public class Task1 {
    public static void main(String[] args) {
        int value = -34;
        String ValueType;

        if(value >= 0){
            ValueType = "Число " + value + " больше нуля и";

        } else {
            ValueType = "Число " + value + " меньше нуля и";
        }

        int count = 0;

        for(int i = value; i!=0; count++){
            i/=10;
        }

        if(value == 0){
            System.out.println(" состоит из одной цифры");
        }

        switch (count){
            case 1:{
                System.out.println(ValueType + " состоит из одной цифры ");
                break;
            }
            case 2:{
                System.out.println(ValueType + " состоит из двух цифр ");
                break;
            }
            case 3:{
                System.out.println(ValueType + " состоит из трех цифр ");
                break;
            }
        }


    }
}
