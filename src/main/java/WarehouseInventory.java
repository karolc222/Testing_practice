import java.util.ArrayList;
import java.util.List;

public class WarehouseInventory {

    List<Product> productInventory = new ArrayList<>(); 

    public Product addProductToLocation(int locationId, String productName) {
        //generates an automatic productId
        Product product = new Product();
        product.productName = productName;
        product.locationId  = locationId;
        product.productId = productInventory.size();
        product.itemQuantity = 1;

        productInventory.add(product);

        return product;
    }

    //loop through to match locationId++
    public int getTotalNumberAtLocation(int locationId) {
        int count = 0;
        for (Product product : productInventory) {
            //the location is stored inside the product
            int location = product.getLocationId();
            if (location == locationId) {
                count++;
            }
        }
        return count;
    }

    public int getItemAmount(int productId, int locationId) {
        productInventory.get(productId);
        return 0; //productId().itemQuantity;
    }

    //public setMaxCapacityAtLocation() {}

}

