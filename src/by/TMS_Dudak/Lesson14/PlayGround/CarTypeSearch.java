package by.TMS_Dudak.Lesson14.PlayGround;

public class CarTypeSearch implements Searchable{
    @Override
    public boolean search(Car car) {
        return car.getCarType().equals(CarType.COMPACT);
    }
}
