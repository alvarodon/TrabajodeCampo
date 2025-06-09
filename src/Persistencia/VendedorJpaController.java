/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Principal.Vendedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author treme
 */
public class VendedorJpaController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PF-1.2PU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Vendedor vendedor) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(vendedor);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Vendedor vendedor) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(vendedor);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(String id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Vendedor v = em.find(Vendedor.class, id);
            if (v != null) em.remove(v);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Vendedor findVendedor(String id) {
        return getEntityManager().find(Vendedor.class, id);
    }

    public List<Vendedor> findVendedorEntities() {
        return getEntityManager().createQuery("SELECT v FROM Vendedor v").getResultList();
    }
}
