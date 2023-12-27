/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author bhavi
 */
public class FactoryProvider {
    
    private static SessionFactory sessionFactory;
    
    public static SessionFactory getFactory()
    {
        try {
            
            if(sessionFactory==null)
            {
                sessionFactory = new Configuration().configure().buildSessionFactory();
            }
                   
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return sessionFactory;
        
    }
    
}
