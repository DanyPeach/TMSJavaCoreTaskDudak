package by.TMS_Dudak.Lesson12Coll.Shop;

import java.util.*;

public class Shop{
    static List<Product> products = new ArrayList<>();

    public Shop() {
    }



    public static void addProduct(Product newProduct){
        if(newProduct.getId()> products.size()) {
            products.add(newProduct);
        }else{
            System.out.println("Невозможно добавить продукт: " + newProduct.toString());
        }
    }

    public static void deleteProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите индекст товара, который хотите удалить из списка: ");
        int delete = scanner.nextInt();
        Iterator<Product> iterator = products.iterator();
        while(iterator.hasNext()){
            int delProduct = iterator.next().getId();
            if(delProduct == delete){
                iterator.remove();
            }
        }
    }

    public static void changeProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекст товара, который хотите изменить: ");
        int edit = scanner.nextInt();
        for (Product value : products) {
            int editProduct = value.getId();
            if (editProduct == edit) {
                System.out.print("Введите новое имя продукта: ");
                value.setName(scanner.next());
                System.out.print("Введите новую цену продукта: ");
                value.setPrice(scanner.nextInt());
            }
        }
    }

    public static List<Product> showShop(){
        return products;
    }

    public static List<Product> sortById(){
        Collections.reverse(products);
        return products;
    }

    public static List<Product> sortByPrice(){
        products.sort(Product.COMPARE_BY_PRICE);
        return products;
    }
}
