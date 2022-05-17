package by.TMS_Dudak.Lesson14.PlayGround;

public class CarPriceSearch implements Searchable{
    @Override
    public boolean search(Car car) {
        return car.getPrice()>50000;
    }
}
