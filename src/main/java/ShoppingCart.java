import java.util.HashMap; 
import java.util.Map;

public class ShoppingCart {
    //map that stores items from the cart
    public final Map<String, Double> items = new HashMap<>();
    public double discount;
    public double total;
    public double finalPrice;

    //METHOD 1
    public void addItem(String item, double price) {
        if (price < 0) {
                throw new IllegalArgumentException();
        }
        items.put(item, price);
    }

    //METHOD 2
    public double calculateTotalPrice() {
        for (double price : items.values()) {
            double remainingAmount = Double.MAX_VALUE - total;

            if (price > remainingAmount) {
                throw new ArithmeticException(); 
                }
                total += price;
            }
            return total;
        }

    //METHOD 3
    public double applyDiscount(double discount) {
        //takes discount parameter and store it in this object's discount field
        this.discount = discount;

        total = calculateTotalPrice();

        double discountAmount = total * discount;
        double finalPrice = total - discountAmount;
        return finalPrice;
    }
}