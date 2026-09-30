import java.util.HashMap; 
import java.util.Map;

public class ShoppingCart {

    private Map<String, Double> items = new HashMap<>();  

    public void addItem(String item, double price) {
        items.put(item, price);
    }

    public double calculateTotalPrice() {
        double total = 0;

        for (double price : items.values()) {
            total += price;
       }
       return total;
    }
}