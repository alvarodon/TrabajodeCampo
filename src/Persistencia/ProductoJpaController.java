/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Principal.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author treme
 */
public class ProductoJpaController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PF-1.2PU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Producto producto) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(producto);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Producto producto) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(producto);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(String id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Producto p = em.find(Producto.class, id);
            if (p != null) em.remove(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Producto findProducto(String id) {
        return getEntityManager().find(Producto.class, id);
    }

    public List<Producto> findProductoEntities() {
        return getEntityManager().createQuery("SELECT p FROM Producto p").getResultList();
    }
}
