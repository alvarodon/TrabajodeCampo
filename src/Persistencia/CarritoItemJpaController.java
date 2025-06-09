/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Principal.CarritoItem;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author treme
 */
public class CarritoItemJpaController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PF-1.2PU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(CarritoItem item) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(item);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(CarritoItem item) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(item);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(Long id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            CarritoItem i = em.find(CarritoItem.class, id);
            if (i != null) em.remove(i);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public CarritoItem findCarritoItem(Long id) {
        return getEntityManager().find(CarritoItem.class, id);
    }

    public List<CarritoItem> findCarritoItemEntities() {
        return getEntityManager().createQuery("SELECT i FROM CarritoItem i").getResultList();
    }
}

