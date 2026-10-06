import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WarehouseInventoryTest {

    @Test
    @DisplayName("add product to a specific location")
    void addProduct_whenGivenALocationId() {
        //arrange
        WarehouseInventory inventory = new WarehouseInventory();
        //product creation is implicit

        //act
        Product result = inventory.addProductToLocation(1, "Slipknot");
        //assert
        assertEquals("Slipknot", result.productName);
        assertEquals(1, result.locationId);



    }
    
    @Test
    @DisplayName("returns total number of products at a specific location")
    void getTotalNumber_AtLocationId() {
        
        WarehouseInventory inventory = new WarehouseInventory();
        inventory.addProductToLocation(5,"Slipknot");
        inventory.addProductToLocation(5,"Bad Omens");
        inventory.addProductToLocation(5,"Tool");
        int result = inventory.getTotalNumberAtLocation(5);
        assertEquals(3, result);
    }

    @Test
    @DisplayName("returns total amount of product by productId and locationId")
    void getItemAmount_byProductId() {

        WarehouseInventory inventory = new WarehouseInventory();
        inventory.addProductToLocation(1, "The editors");
        inventory.addProductToLocation(2, "Ghost");
        inventory.addProductToLocation(3, "Bad Omens");
        inventory.addProductToLocation(2, "Ghost");

        int result = inventory.getTotalNumberAtLocation(02);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("tests is the max capacity has been reached")
    void getsMaxAmount_whenGivenANewProduct() {
        

    }
}
