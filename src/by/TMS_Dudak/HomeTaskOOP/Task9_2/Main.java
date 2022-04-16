package by.TMS_Dudak.HomeTaskOOP.Task9_2;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("ElfBar", 23.5, 4.5);
        Product product2 = new Product("HQD", 25.9, 5.0);
        Product product3 = new Product("DeepVape", 40.0, 4.9);
        Product[] productsArr = {product1, product2, product3};

        Basket basket = new Basket(new Product[]{product2, product3});

        Catalog catalog = new Catalog("One Use Vape", productsArr);

        User user = new User("Daniil", "1223", basket);

        System.out.println(catalog);
        System.out.println(basket);
        System.out.println(user);
    }
}
