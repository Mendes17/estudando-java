package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date moment;
    private OrderStatus status;

    private List<OrderItems> items = new ArrayList<>();
    Client c = new Client();
    Product p = new Product();

    public Order() {}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.c = client;
        this.p = p;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItems> getItems() {
        return items;
    }

    public void addItem(OrderItems item) {
        items.add(item);
    }

    public void removeItem(OrderItems item) {
        items.remove(item);
    }

    public Double total() {
        Double total = 0.0;
        for (OrderItems item : items) {
            total += item.subTotal();
        }
        return total;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf2.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + c.getName() + " " + sdf.format(c.getBirthDate()) + " - " + c.getEmail() + "\n");
        sb.append("Order items:\n");
        for (OrderItems item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: " + total() + "\n");
        return sb.toString();
    }

}
