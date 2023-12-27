package com;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CategoryDAO {

    SessionFactory sessionFactory;

    public CategoryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public int addCategory(Category category) {
        try {

            Session session = sessionFactory.openSession();
            session.beginTransaction();

            int catid = (int) session.save(category);

            session.getTransaction().commit();
            session.close();

            return catid;

        } catch (Exception e) {

            e.printStackTrace();
            return -1;
        }
    }

    public List<Category> getAllCategory() {
        Session session = sessionFactory.openSession();
        String q = "from Category";
        Query query = session.createQuery(q);
        List<Category> list = query.list();
        return list;

    }

    public Category getCategoryById(int categoryid) {
        
        Category categoty = null;

        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            categoty = (Category) session.get(Category.class, categoryid);
            session.getTransaction();
            session.close();
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return categoty;
    }

}
