package Lab;

public class Product {

    private int productId;
    private String productName;
    private int productYear;
    private int quantity;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductYear() {
        return productYear;
    }

    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(int productId, String productName, int productYear, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.productYear = productYear;
        this.quantity = quantity;
    }
}
