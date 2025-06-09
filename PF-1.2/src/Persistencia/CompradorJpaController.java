/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Principal.Comprador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author treme
 */
public class CompradorJpaController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PF-1.2PU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Comprador comprador) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(comprador);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Comprador comprador) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(comprador);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(String id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Comprador c = em.find(Comprador.class, id);
            if (c != null) em.remove(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Comprador findComprador(String id) {
        return getEntityManager().find(Comprador.class, id);
    }

    public List<Comprador> findCompradorEntities() {
        return getEntityManager().createQuery("SELECT c FROM Comprador c").getResultList();
    }
}
