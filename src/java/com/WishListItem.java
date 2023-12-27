/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author bhavi
 */
@Entity
public class WishListItem 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wishListItemId;

    public int getWishListItemId() {
        return wishListItemId;
    }

    public void setWishListItemId(int wishListItemId) {
        this.wishListItemId = wishListItemId;
    }

    public Users getWishListItemuser() {
        return wishListItemuser;
    }

    public void setWishListItemuser(Users wishListItemuser) {
        this.wishListItemuser = wishListItemuser;
    }

    public Product getWishListItemProduct() {
        return wishListItemProduct;
    }

    public void setWishListItemProduct(Product wishListItemProduct) {
        this.wishListItemProduct = wishListItemProduct;
    }
    
    @ManyToOne
    private Users wishListItemuser;
    
     
    @ManyToOne
    private Product wishListItemProduct;
}
