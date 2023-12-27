package com;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class WishListItemDAO {

    SessionFactory sessionFactory;

    public WishListItemDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<WishListItem> getWishListItemByUserId(int userid) {
        String hql = "FROM WishListItem w WHERE w.wishListItemuser.id = :userId";

        Session session = sessionFactory.openSession();

        Query q = session.createQuery(hql);
        q.setParameter("userId", userid);

        List<WishListItem> wishListItemlist = q.list();

        return wishListItemlist;

    }

    public boolean addToWistlist(int uid, int pid) {
        String hql = "FROM WishListItem w WHERE w.wishListItemuser.id = :userId AND w.wishListItemProduct.id = :productId";

        Session session = sessionFactory.openSession();

        Query q = session.createQuery(hql);
        q.setParameter("productId", pid);
        q.setParameter("userId", uid);

        Product product = (Product) session.get(Product.class, pid);
        Users user = (Users) session.get(Users.class, uid);

        WishListItem wishListItem = (WishListItem) q.uniqueResult();

        session.close();

        if (wishListItem == null) {
            wishListItem = new WishListItem();
            wishListItem.setWishListItemProduct(product);
            wishListItem.setWishListItemuser(user);
            Session session2 = sessionFactory.openSession();
            session2.beginTransaction();
            session2.save(wishListItem);
            session2.getTransaction().commit();
            session2.close();
            return true;
        }
        return false;
    }

    public boolean removeFromWishList(int uid, int pid) {
        String hql = "FROM WishListItem w WHERE w.wishListItemuser.id = :userId AND w.wishListItemProduct.id = :productId";

        Session session = sessionFactory.openSession();

        Query q = session.createQuery(hql);
        q.setParameter("productId", pid);
        q.setParameter("userId", uid);

        Product product = (Product) session.get(Product.class, pid);
        Users user = (Users) session.get(Users.class, uid);

        WishListItem wishListItem = (WishListItem) q.uniqueResult();

        session.close();

        if (wishListItem != null) {

            Session session2 = sessionFactory.openSession();
            session2.beginTransaction();
            session2.delete(wishListItem);
            session2.getTransaction().commit();
            session.close();
            return true;
        }
        return false;
    }
}
