package com.dev.testsanvioms;

public class Model {
    private String productImage;
    private String productName;
    private String productPrice;
    private String productCategory;

    public Model(String productImage, String productName, String productPrice, String productCategory) {
        this.productImage = productImage;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productCategory = productCategory;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}