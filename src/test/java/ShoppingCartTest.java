import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    @Test
    @DisplayName("add an item and its price to the cart")

    void addNewItem() {

        ShoppingCart newCart = new ShoppingCart();

        newCart.addItem("honey", 3.30);
        double result = newCart.calculateTotalPrice(); 

        assertEquals(3.30, result);
    }


    @Test
    @DisplayName("apply a discount to the cart")

    void applyDiscountToTotalPrice() {

        ShoppingCart cart = new ShoppingCart();

        cart.addItem("honey", 10.00);
        cart.applyDiscount(0.20);

        double result = cart.calculateTotalPrice();

        assertEquals(8.00, result);
    }
}