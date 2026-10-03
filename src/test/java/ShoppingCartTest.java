import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {
    @Test
    @DisplayName("add an item and its price to the cart")

    void addNewItem() {

        ShoppingCart cart = new ShoppingCart();

        cart.addItem("honey", 3.30);
        double result = cart.calculateTotalPrice(); 

        assertEquals(3.30, result);
    }

    @Test
    @DisplayName("apply a discount to the cart")
    void applyDiscountToTotalPrice() {
        //arrange
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("honey", 10.00);

        //act
        double result = cart.applyDiscount(0.20);

        //assert
        assertEquals(8.00, result);
    }

    @Test //total on EMPTY LIST 
    @DisplayName("calculate the total when the cart is empty")
    void calculateTotal_whenShoppingCartEmpty_returnsZero() {

        ShoppingCart cart = new ShoppingCart();
        double total = 0;

        double result = cart.calculateTotalPrice();

        assertEquals(0, result);
    }


    @Test // discount on EMPTY LIST 
    @DisplayName("apply discount to an empty list")
    void applyDiscount_emptyList_returnsZero() {

        ShoppingCart cart = new ShoppingCart();
        double total = 0;

        double result = cart.applyDiscount(0.10);
        assertEquals(0, result);
    }
}