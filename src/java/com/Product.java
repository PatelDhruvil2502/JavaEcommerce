
package com;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    @Column(length=3000)
    private String productDesc;
    private int productPrice;
    private int productQuantity;
    private int productDiscount;
    private String productPic;
    private double productRating;
    private int productSoldCount;
    private String productColor;

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public Set<WishListItem> getWishListItem() {
        return wishListItem;
    }

    public void setWishListItem(Set<WishListItem> wishListItem) {
        this.wishListItem = wishListItem;
    }
    private String productBrand;
    private int shippingCost;

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Set<CartItem> getCartItem() {
        return cartItem;
    }

    public void setCartItem(Set<CartItem> cartItem) {
        this.cartItem = cartItem;
    }

   
    
   

    @ManyToOne
    private Category productCategory;
    
    @OneToMany(mappedBy="cartItemProduct")
    private Set<CartItem> cartItem;
    
    @OneToMany(mappedBy="wishListItemProduct")
    private Set<WishListItem> wishListItem;
    
    
    public Product() {
    }

    public Product(int productId, String productName, String productDesc, int productPrice, int productDiscount, int productQuantity, Category productCategory) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
        this.productDiscount = productDiscount;
        this.productQuantity = productQuantity;
        this.productCategory = productCategory;
    }

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

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(int productDiscount) {
        this.productDiscount = productDiscount;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Category getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(Category productCategory) {
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc + ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + ", productDiscount=" + productDiscount + ", productCategory=" + productCategory + '}';
    }
    
    
     public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }
    
    public int getDiscountedPrice()
    {
        int temp = (int)((this.productDiscount/100.0)*this.productPrice);
        return this.productPrice-temp;
    }
    
    public double getProductRating() {
        return productRating;
    }

    public void setProductRating(double productRating) {
        this.productRating = productRating;
    }

    public int getProductSoldCount() {
        return productSoldCount;
    }

    public void setProductSoldCount(int productSoldCount) {
        this.productSoldCount = productSoldCount;
    }

    
    
}
