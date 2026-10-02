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
}