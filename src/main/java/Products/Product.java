package Products;

import Properties.ISell;

public abstract class Product implements ISell {
    public String productCode;
    public double buyingPrice;
    public double sellingPrice;

    public Product(String productCode, double buyingPrice, double sellingPrice){
        this.productCode = productCode;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
    public double calculateMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }
}
