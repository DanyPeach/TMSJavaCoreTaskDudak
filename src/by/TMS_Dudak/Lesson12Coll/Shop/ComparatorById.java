package by.TMS_Dudak.Lesson12Coll.Shop;


import java.io.IOException;
import java.util.Collections;

public class ComparatorById {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Product product1 = new Product("MORPHE Brush", 1, 400);
        Product product2 = new Product("Anastasia Beverly Hills kit", 2, 220);
        Product product3 = new Product("Fignia kakayato", 3, 200);
        Product product4 = new Product("Rell juice", 4, 230);

        Shop.addProduct(product1);
        Shop.addProduct(product2);
        Shop.addProduct(product3);
        Shop.addProduct(product4);
        System.out.println(Shop.showShop());
        //Shop.deleteProduct();
        Shop.changeProduct();
        System.out.println(Shop.showShop());
        System.out.println("Отстортированный список в порядке добавления\n "+Shop.sortById() + "\n");
        System.out.println("Отстортированный список по цене\n "+Shop.sortByPrice() + "\n");

    }
}
