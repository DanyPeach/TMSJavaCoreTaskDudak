package by.TMS_Dudak.HomeTaskOOP.Task9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product product1 = new Product("Elfbar", 4.5, 31.2);
        Product product2 = new Product("HQD", 4.9, 35.0);
        Product product3 = new Product("File", 3.6, 25.0);
        Product[] oneUseSig = {product1, product2, product3};

        Product product4 = new Product("GEEKVAPE", 5.0, 129.5);
        Product product5 = new Product("Voopoo", 4.3, 89.4);
        Product product6 = new Product("Drag", 4.7, 100.0);
        Product[] vape = {product4, product5, product6};

        Product product7 = new Product("MORS", 4.9, 24.5);
        Product product8 = new Product("Glitch Souse", 4.8, 21.5);
        Product product9 = new Product("MORS VIP", 5.0, 29.0);
        Product[] juice = {product7, product8, product9};

        Category categoryOneUse = new Category("Одноразовые электронные сигареты", oneUseSig);
        Category categoryVape = new Category("POD-системы", vape);
        Category categoryJuice = new Category("Жидкости", juice);

        Category[] categoryArr = {categoryOneUse, categoryVape, categoryJuice};



        Product[] basketCat1 = new Product[2];
        Product[] basketCat2 = new Product[2];
        Product[] basketCat3 = new Product[2];
        Basket basket = new Basket(basketCat1);

        do {
            System.out.println("Доступные каталоги: ");
            for(int i = 0, j = 1; i<categoryArr.length; i++, j++){
                System.out.println(j + ") "+ categoryArr[i].getName());
            }
            System.out.println("\nВыберите Каталог, который хотите открыть: ");
            int chosenCatalog = scanner.nextInt();
            switch (chosenCatalog) {
                case 1 -> {
                    categoryOneUse.categoryPrint();
                    System.out.println("Выберете товар: ");
                    int a = scanner.nextInt();
                    for (int j = 0, i = 0; j < oneUseSig.length; j++) {
                        if (a == j + 1) {
                            basketCat1[i] = oneUseSig[j];
                        }
                    }
                }
                case 2 -> {
                    categoryVape.categoryPrint();
                    System.out.println("Выберете товар: ");
                    int a = scanner.nextInt();
                    for (int j = 0, i = 0; j < oneUseSig.length; j++) {
                        if (a == j + 1) {
                            basketCat2[i] = vape[j];
                        }
                    }
                }
                case 3 -> {
                    categoryJuice.categoryPrint();
                    System.out.println("Выберете товар: ");
                    int a = scanner.nextInt();
                    for (int j = 0, i = 0; j < oneUseSig.length; j++) {
                        if (a == j + 1) {
                            basketCat3[i] = juice[j];
                        }
                    }
                }
            }
            System.out.println("Хотите прекратить шоппинг? (0 нет, 1 да)");
            int end = scanner.nextInt();
            if(end == 1){
                break;
            }
        }while (true);

        System.out.println("Ваша корзина: "  );
        for(Product i : basketCat1){
            System.out.println(i.getName() + " " +i.getPrice());
        }

    }
}
