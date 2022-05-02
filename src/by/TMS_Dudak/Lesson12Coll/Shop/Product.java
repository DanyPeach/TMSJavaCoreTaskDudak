package by.TMS_Dudak.Lesson12Coll.Shop;

import java.io.Serializable;
import java.util.Comparator;

public class Product extends Shop implements Comparable<Product>, Serializable {
    private String name;
    private int id;
    private int price;

    public Product() {
    }

    public Product(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Товар с индексом " + id  +
                ": Имя товара: " + name +
                ", цена товара: " + price +
                "\n";
    }


    @Override
    public int compareTo(Product o) {
        return this.id-o.id;
    }

    public static Comparator<Product> COMPARE_BY_PRICE = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getPrice()- o2.getPrice();
        }
    };
}
