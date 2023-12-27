
package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CartItem {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cartItemId;
    
    @ManyToOne
    private Users cartItemUser;
    
     
    @ManyToOne
    private Product cartItemProduct;
    
    private int quantity;

   
    

    public CartItem() {
    }

    public CartItem(int cartItemId, Users cartItemUser, Product cartItemProduct) {
        this.cartItemId = cartItemId;
        this.cartItemUser = cartItemUser;
        this.cartItemProduct = cartItemProduct;
    }

    public int getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(int cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Users getCartItemUser() {
        return cartItemUser;
    }

    public void setCartItemUser(Users cartItemUser) {
        this.cartItemUser = cartItemUser;
    }

    public Product getCartItemProduct() {
        return cartItemProduct;
    }

    public void setCartItemProduct(Product cartItemProduct) {
        this.cartItemProduct = cartItemProduct;
    }

   
     public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    
    
}
