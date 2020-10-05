package Products.Accessories;

import Products.Product;

public class Accessory extends Product {
    private AccessoryType accessoryType;
    private String productDescription;

    public Accessory(String productCode, double buyingPrice, double sellingPrice, AccessoryType accessoryType, String productDescription){
      super(productCode, buyingPrice, sellingPrice);
      this.accessoryType = accessoryType;
      this.productDescription = productDescription;
    }

    public AccessoryType getAccessoryType() {
        return accessoryType;
    }

    public String getProductDescription() {
        return productDescription;
    }
}
