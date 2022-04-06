package by.TMS_Dudak.HomeTaskOOP.Task6.professions;

public class Driver extends Person{
    private String fullName;
    private int yearsOfDrive;

    public Driver() {
    }

    public Driver(String fullName, int yearsOfDrive){
        this.fullName=fullName;
        this.yearsOfDrive=yearsOfDrive;
    }

    public Driver(String age, String gender, String fullName, int yearsOfDrive) {
        super(age, gender);
        this.fullName = fullName;
        this.yearsOfDrive = yearsOfDrive;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearsOfDrive() {
        return yearsOfDrive;
    }

    public void setYearsOfDrive(int yearsOfDrive) {
        this.yearsOfDrive = yearsOfDrive;
    }
}