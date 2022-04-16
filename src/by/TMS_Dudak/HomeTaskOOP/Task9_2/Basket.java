package by.TMS_Dudak.HomeTaskOOP.Task9_2;

import java.util.Arrays;

public class Basket {
    private Product[] products;

    public Basket() {
    }

    public Basket(Product[] products) {
        this.products = products;
    }

    public void baskerInfo(){
        System.out.println("В вашей корзине находятся следуюзие вещи!");
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "В вашей корзине находятся следующие товары: " +
                "" + Arrays.toString(products);
    }
}
