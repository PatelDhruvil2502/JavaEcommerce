
package com;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDAO {
    
    SessionFactory sessionFactory;

    public ProductDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    public boolean addProduct(Product product)
    {
        try{
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
            session.close();
            return true;
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Product> getAllProducts()
    {
        String q="from Product";
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(q);
        
        List<Product> list = query.list();
        session.close();
        return list;
    }
    
    public List<Product> getProductsByCategoryId(int cid)
    {
        String q="from Product as p where p.productCategory.categoryId =:x";
       
        Session session = sessionFactory.openSession();
        Query query = session.createQuery(q);
        query.setParameter("x", cid);
        
        List<Product> list = query.list();
        session.close();
        return list;
    }
    
    public Product getProductByProductId(int id)
    {
        Session session = sessionFactory.openSession();
        Product product= (Product)session.get(Product.class,id);
        session.close();
        return product;
    }
    
}
