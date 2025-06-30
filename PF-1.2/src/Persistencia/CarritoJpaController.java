/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Principal.Carrito;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author treme
 */
public class CarritoJpaController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PF-1.2PU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Carrito carrito) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(carrito);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Carrito carrito) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(carrito);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(Long id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Carrito c = em.find(Carrito.class, id);
            if (c != null) em.remove(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Carrito findCarrito(Long id) {
        return getEntityManager().find(Carrito.class, id);
    }

    public List<Carrito> findCarritoEntities() {
        return getEntityManager().createQuery("SELECT c FROM Carrito c").getResultList();
    }
}