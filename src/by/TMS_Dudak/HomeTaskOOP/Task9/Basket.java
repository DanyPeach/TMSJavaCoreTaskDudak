package by.TMS_Dudak.HomeTaskOOP.Task9;

import java.util.ArrayList;

public class Basket extends  Product {
    private Product[] products;

    public Basket() {

    }

    public Basket(Product[] products) {
        this.products = products;
    }

    public void showBasket(){
        System.out.println("Ваша корзина: "  );
        for(Product i : products){
            System.out.println(i.getName() + " " +i.getPrice());
        }
    }

    public void showPrice(){
        System.out.println("Вы пошопились как крутышки на сумму: ");
        double sum = 0;
        for(Product i : products){
            sum+=i.getPrice();
        }
        System.out.println(sum);
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
