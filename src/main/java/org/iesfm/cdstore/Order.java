package org.iesfm.cdstore;

import java.util.Objects;

public class Order {
    private int price;
    private int date;

    public Order(int price, int date) {
        this.price = price;
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return price == order.price &&
                date == order.date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, date);
    }
}
