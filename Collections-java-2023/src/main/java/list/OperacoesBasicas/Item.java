package main.java.list.OperacoesBasicas;

public class Item {
    private String productName;
    private double productPrice;
    private int productQuantity;

    public Item(String productName, double productPrice, int productQuantity){
        this.productName = productName;
        this.productPrice= productPrice;
        this.productQuantity = productQuantity;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductInfo() {
        String productInfo = (productName + productPrice + productQuantity);
        return productInfo;
    }

    @Override
    public String toString() {
        return "Produto: " + productName + '\'' +
                "Preço: " + productPrice +
                "Quantia: " + productQuantity;
    }
}
