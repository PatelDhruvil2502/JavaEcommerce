
package com;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CartItemDAO 
{
    SessionFactory sessionFactory;

    public CartItemDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public CartItem getCartItemByUuserIdAndProductId(int userid,int productid)
    {
        String hql = "FROM CartItem c WHERE c.cartItemUser.id = :userId AND c.cartItemProduct.id = :productId";
        
        Session session = sessionFactory.openSession();
        
        Query q = session.createQuery(hql);
        q.setParameter("productId", productid);
        q.setParameter("userId", userid);
        
        
        CartItem cartItem = (CartItem) q.uniqueResult();
        
        return cartItem;
    }
    
    public boolean addToCart(int userid,int productid)
    {
        


        String hql = "FROM CartItem c WHERE c.cartItemUser.id = :userId AND c.cartItemProduct.id = :productId";
        
        Session session = sessionFactory.openSession();
        
        Query q = session.createQuery(hql);
        q.setParameter("productId", productid);
        q.setParameter("userId", userid);
        
        
        CartItem cartItem = (CartItem) q.uniqueResult();
        
        if(cartItem==null)
        {
            cartItem = new CartItem();
            Users user = new UserDAO(sessionFactory).getUserByUserId(userid);
            Product product = new ProductDAO(sessionFactory).getProductByProductId(productid);
            cartItem.setCartItemProduct(product);
            cartItem.setCartItemUser(user);
            cartItem.setQuantity(1);
            session.beginTransaction();
            session.save(cartItem);
            session.getTransaction().commit();
            session.close();
            return true;
        }
        else
        {
            session.beginTransaction();
            
            cartItem.setQuantity(cartItem.getQuantity()+1);
            
            session.getTransaction().commit();
            session.close();
            return true;
        }
        
        
    }
    
    public List<CartItem> getCartItemByUserId(int userid)
    {
         String hql = "FROM CartItem c WHERE c.cartItemUser.id = :userId";
        
        Session session = sessionFactory.openSession();
        
        Query q = session.createQuery(hql);
        q.setParameter("userId", userid);
        
        List<CartItem> cartitemlist = q.list();
        
        return cartitemlist;
        
    }
}
