import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ShoppingCartTest {
    @Test //NORMAL case
    @DisplayName("add an item and its price to the cart")
    void addNewItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("honey", 3.30);
        double result = cart.calculateTotalPrice(); 
        assertEquals(3.30, result);
    }

    @Test //NORMAL case
    @DisplayName("apply a discount to the cart")
    void applyDiscountToTotalPrice() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("honey", 10.00);
        double result = cart.applyDiscount(0.20);
        assertEquals(8.00, result);
    }

    @Test //total on EMPTY LIST 
    @DisplayName("calculate the total when the cart is empty")
    void calculateTotal_whenShoppingCartEmpty_returnsZero() {
        ShoppingCart cart = new ShoppingCart();
        double result = cart.calculateTotalPrice();
        assertEquals(0, result);
    }

    @Test // discount on EMPTY LIST 
    @DisplayName("apply discount to an empty cart")
    void applyDiscount_emptyList_returnsZero() {
        ShoppingCart cart = new ShoppingCart();
        double result = cart.applyDiscount(0.10);
        assertEquals(0, result);
    }

    @Test //negative price EXCEPTION
    @DisplayName(" forbid an item with a negative price to be added")
    void whenNegativePriceAdded_throwsException() {
        ShoppingCart cart = new ShoppingCart();
        assertThrows(IllegalArgumentException.class,
            () -> cart.addItem("RedBull", -1.75));
    }

    @Test //arithmetic EXCEPTION
    @DisplayName("prevents a total that is bigger than the double max value")
    void returnsArithmeticException_whenTheTotalIsBiggerThanDoubleMaxValue() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Ice cream", Double.MAX_VALUE);
        cart.addItem("Cake", Double.MAX_VALUE);

        assertThrows(ArithmeticException.class, 
            () -> cart.calculateTotalPrice());
    }
}