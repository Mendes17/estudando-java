package entities;

public class OrderItems {

    private Product product;
    private Integer quantity;
    private Double price;

    public OrderItems(){}

    public OrderItems(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal() {
        return price * quantity;
    }

    public String toString() {
        return product.getName()   + ", $" + String.format("%.2f", price) + ", Quantity: " + quantity + ", Subtotal: " + String.format("%.2f", subTotal());
    }

}
