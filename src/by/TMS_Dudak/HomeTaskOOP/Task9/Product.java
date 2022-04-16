package by.TMS_Dudak.HomeTaskOOP.Task9;

public class Product {
    private String name;
    private double rating;
    private double price;

    public Product(){

    }

    public Product(String name, double rating, double price) {
        this.name = name;
        this.rating = rating;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
