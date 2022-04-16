package by.TMS_Dudak.HomeTaskOOP.Task9;

public class Category extends Product{
    private String name;
    private Product[] productsArr;

    public Category(String name, Product[] productsArr) {
        this.name = name;
        this.productsArr = productsArr;
    }

    public Category() {
    }

    public void categoryPrint(){
        System.out.println(name + "\n");
        for(Product i : productsArr){
            System.out.println("Название: " + i.getName() + "\n" +
                    "Цена: " + i.getPrice() + "\n" +
                    "Рейтинг товара: " + i.getRating() + "\n");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProductsArr() {
        return productsArr;
    }

    public void setProductsArr(Product[] productsArr) {
        this.productsArr = productsArr;
    }
}
