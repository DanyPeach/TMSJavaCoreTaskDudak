package by.TMS_Dudak.Lesson11.HomeTask.Task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 280, 30000);
        Car car2 = new Car("BMW", 310, 45000);
        Car car3 = new Car("Geely", 250, 21000);

        Car[] carArr = {car1, car2, car3};

        for(Car i : carArr){
            try{
                i.getStarted();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
