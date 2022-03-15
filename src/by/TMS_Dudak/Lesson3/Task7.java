package by.TMS_Dudak.Lesson3;

public class Task7 {
    public static void main(String[] args) {
        int amountOfProgrammers = 131;
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

        //if(amountOfProgrammers%10==5 || amountOfProgrammers%10==6 || amountOfProgrammers%10==7 ||
        //amountOfProgrammers%10==8 || amountOfProgrammers%10==9 ||
        //amountOfProgrammers%10==0 || amountOfProgrammers == 11 ||
        //amountOfProgrammers == 12 || amountOfProgrammers == 13 ||
        //amountOfProgrammers == 14){
        //InflectionEnding = "Программистов";
        //System.out.println(amountOfProgrammers + " " + InflectionEnding);
        //} else if(amountOfProgrammers==1){
        //InflectionEnding = "Программист";
        //System.out.println(amountOfProgrammers + " " + InflectionEnding);
        //} else{
            //InflectionEnding = "Программиста";
            //System.out.println(amountOfProgrammers + " " + InflectionEnding);

    }
}
