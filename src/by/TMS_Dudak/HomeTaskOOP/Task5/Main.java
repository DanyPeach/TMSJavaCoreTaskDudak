package by.TMS_Dudak.HomeTaskOOP.Task5;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Aspirant("Кек");
        Student student2 = new Student("Dmitri", "Poltoran", 10, 5.0);
        Student aspirant1 = new Aspirant("Polina", "Legusheva", 10,4.5, "Науч Раб");


        System.out.println("Степендия сутдента(-ки): " + student2.getFirstName() + " " +
                student2.getLastName() + " со средним баллом " + student2.getAverageMark() +
                " равняется: " + student2.getScholarship());

        System.out.println("Степендия асмпиранта(-ки): " + aspirant1.getFirstName() + " " +
                aspirant1.getLastName() + " со средним баллом " + aspirant1.getAverageMark() +
                " равняется: " + aspirant1.getScholarship());
    }
}
