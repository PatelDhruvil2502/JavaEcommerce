
package com;

//import javax.persistence.Query;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class UserDAO {
    
    private SessionFactory sessionFactory;

    public UserDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public Users getUserByEmailAndPassword(String email,String password)
    {
        Users user=null;
        
        //fetching user record
        String query = "from Users where userEmail =:e and userPassword =:p";
        Session session = sessionFactory.openSession();
        Query q = session.createQuery(query);
        q.setParameter("e", email);
        q.setParameter("p", password);
        
        user = (Users)q.uniqueResult();
        
        session.close();
                
        
        return user;
    }
    
    public List<Users> getAllUsers()
    {
        List<Users> userlist=null;
        
        //fetching user record
        String query = "from Users";
        Session session = sessionFactory.openSession();
        Query q = session.createQuery(query);
        
        
        userlist = q.list();
        
        session.close();
        return userlist;
    }
    
    public Users getUserByUserId(int id)
    {
        Session session = sessionFactory.openSession();
        Users user = (Users)session.get(Users.class,id);
        session.close();
        return user;
    }
    
}
