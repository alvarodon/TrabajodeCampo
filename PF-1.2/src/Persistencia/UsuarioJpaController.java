/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Principal.Usuario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author treme
 */
public class UsuarioJpaController {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PF-1.2PU");

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void edit(Usuario usuario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void destroy(String id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Usuario u = em.find(Usuario.class, id);
            if (u != null) em.remove(u);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Usuario findUsuario(String id) {
        return getEntityManager().find(Usuario.class, id);
    }

    public List<Usuario> findUsuarioEntities() {
        return getEntityManager().createQuery("SELECT u FROM Usuario u").getResultList();
    }
}