package by.TMS_Dudak.Lesson10.Task6;

public class Employee {
    String fullName;
    int salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
