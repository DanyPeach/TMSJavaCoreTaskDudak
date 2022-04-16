package by.TMS_Dudak.HomeTaskOOP.Task9;

import java.util.ArrayList;

public class Basket extends  Product {
    private Product[] products;

    public Basket() {

    }

    public Basket(Product[] products) {
        this.products = products;
    }



    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
