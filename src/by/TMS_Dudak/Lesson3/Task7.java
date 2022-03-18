package by.TMS_Dudak.Lesson3;

public class Task7 {
    public static void main(String[] args) {
        int amountOfProgrammers = 0;
        String InflectionEnding;

        if (amountOfProgrammers % 10 == 1 && amountOfProgrammers%100!=11){
            InflectionEnding = "Программист";
            System.out.println(amountOfProgrammers + " " + InflectionEnding);
        } else if (amountOfProgrammers%10>=2 && amountOfProgrammers%10<=4 && amountOfProgrammers%100<10){
            InflectionEnding = "Программиста";
            System.out.println(amountOfProgrammers + " " + InflectionEnding);
        }  else{
            InflectionEnding = "Программистов";
            System.out.println(amountOfProgrammers + " " + InflectionEnding);
        }
    }
}
