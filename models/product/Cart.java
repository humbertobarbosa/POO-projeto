package models.product;

import java.util.ArrayList;

public class Cart implements ICommand {
    
    private ArrayList<Product> items;
    private float finalPrice;
    
    public Cart(ArrayList<Product> items) {
        this.items = items;
    }

    public float calculateFinalPrice() {
        float sum = 0;

        for (Product cap : this.items) {
            sum += cap.getCurrentPrice();
        }

        return sum;
    }

    public void clearCart() {
        this.items.clear();
    }

    public void addItem(Product item) {
        this.items.add(item);
    }

    public void closeOrder() {
        this.finalPrice = this.calculateFinalPrice();
    }

    public void removeCap(int id) {
        for (Product cap : this.items) {
            if (id == cap.getId()) {
                this.items.remove(cap);
            }
        }
    }

    public void reduceCapAmount(int id) {
        for (Product cap : this.items) {
            if (id == cap.getId()) {
                this.items.remove(cap);
                break;
            }
        }
    }

    @Override
    public void execute() {
        this.closeOrder();
        this.clearCart();
    }

    public ArrayList<Product> getItems() {
        return items;
    }

    public float getFinalPrice() {
        return finalPrice;
    }

}
