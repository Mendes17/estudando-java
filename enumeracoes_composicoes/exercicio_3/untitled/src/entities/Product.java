package entities;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private String name;
    private Double price;
    private List<Product> rItem= new ArrayList<>();

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Product> getrItem() {
        return rItem;
    }

    public void setrItem(List<Product> rItem) {
        this.rItem = rItem;
    }

    public void addItem(Product rItem) {
        this.rItem.add(rItem);
    }

    public void removeItem(Product rItem) {
        this.rItem.remove(rItem);
    }
}
