package by.TMS_Dudak.Lesson14.PlayGround;

public class Car {
    private CarType carType;
    private int price;

    public Car(CarType carType, int price) {
        this.carType = carType;
        this.price = price;
    }


    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
