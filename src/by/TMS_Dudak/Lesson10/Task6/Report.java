package by.TMS_Dudak.Lesson10.Task6;

public class Report {


    public static void generateReport(Employee[] e, String fullName, int cash){
        System.out.printf("Зарплата %s составляет %s", fullName, cash);
    }

    public static void generateReport(Employee[] employees) {
        System.out.printf("Зарплата" + employees );
    }
}
