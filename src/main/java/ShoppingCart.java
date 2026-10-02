import java.util.HashMap; 
import java.util.Map;

public class ShoppingCart {
    //map that stores items from the cart
    private Map<String, Double> items = new HashMap<>();  
    private double discount;
    public double finalPrice;
    public double total;

    //METHOD 1
    public void addItem(String item, double price) {
        items.put(item, price);
    }

    //METHOD 2
    public double calculateTotalPrice() {
        double total = 0;

        for (double price : items.values()) {
            total += price;
       }
       return total;
    }

    //METHOD 3
    public void applyDiscount(double discount) {
        //takes discount parameter and store it in this object's discount field
        this.discount = discount;

        double finalPrice = total - discount;

        return finalPrice;


        

    }
}