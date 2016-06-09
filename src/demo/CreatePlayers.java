/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author prasanga
 */
public class CreatePlayers {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceDemoPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Player p1 = new Player();
        p1.setId(5);
        p1.setFirstname("Prabod");
        p1.setJerseynumber(30);
        p1.setLastname("Prasanga");
        p1.setLastspokenwords("I an inthe best form");
        em.persist(p1);
        
        Player p2 = new Player();
        p2.setId(6);
        p2.setFirstname("Sandun");
        p2.setJerseynumber(40);
        p2.setLastname("Madusanka");
        p2.setLastspokenwords("I will be back");
        em.persist(p2);
        
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
}
