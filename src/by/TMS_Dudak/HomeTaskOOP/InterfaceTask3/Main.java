package by.TMS_Dudak.HomeTaskOOP.InterfaceTask3;

public class Main {
    public static void main(String[] args) {
        Seasons season1 =  Seasons.WINTER;
        Seasons season2 =  Seasons.SPRING;
        Seasons season3 =  Seasons.SUMMER;
        Seasons season4 =  Seasons.AUTHEM;

        switch (season3){
            case WINTER -> System.out.println("Моя любимая пора года: Зима!" +" Средняя температура: " + season1.getTemperature()
                    + season1.getDescription("\nСамая холодная пора года"));
            case SPRING -> System.out.println("Моя любимая пора года: Весна!");
            case SUMMER -> System.out.println("Моя любимая пора года: Лето!" + " Средняя температура: " + season3.getTemperature()
                    +season3.getDescription("\nСамое теплое время года"));
            case AUTHEM -> System.out.println("Моя любимая пора года: Осень!");
        }

    }
}
