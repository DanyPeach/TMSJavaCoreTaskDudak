package by.TMS_Dudak.Lesson10.Task6;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Daniil", 2500);
        Employee employee2 = new Employee("Klim", 3500);
        Employee employee3 = new Employee("Polina", 1800);
        Employee employee4 = new Employee("Natya", 3800);

        Employee[] employees = {employee1, employee2, employee3, employee4};
        for(int i=0; i<employees.length; i++){
            Report.generateReport(employees);
        }
    }

}
