package by.TMS_Dudak.HomeTaskOOP.Task9_2;

public class Catalog {
    private String name;
    private Product[] products;

    public Catalog() {
    }

    public Catalog(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
