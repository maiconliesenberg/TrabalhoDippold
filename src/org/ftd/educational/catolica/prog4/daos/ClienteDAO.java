package org.ftd.educational.catolica.prog4.daos;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import org.ftd.educational.catolica.prog4.entities.Cliente;

/**
 *
 * @author ftdippold
 */
public class ClienteDAO extends ClienteJpaController {

    public ClienteDAO(EntityManagerFactory emf) {
        super(emf);
    }
    
    public Cliente findByName(String name) {
        EntityManager em = getEntityManager();
        try {
            return (Cliente) em.createNamedQuery("Cliente.find.by.name")
                .setParameter("name", name)
                .getSingleResult();
        } finally {
            
        }        
    }    
    
    public Cliente findByCpf(String cpf) {
        EntityManager em = getEntityManager();
        try {
            return (Cliente) em.createNamedQuery("Cliente.find.by.cpf")
                .setParameter("cpf", cpf)
                .getSingleResult();
        } finally {
            em.close();
        }        
    }     
    
    public List<Cliente> findByTipo(String id) {
        EntityManager em = getEntityManager();
        try {
            Query q = em.createNamedQuery("TipoCliente.findall.by.tipo");
            q.setParameter("id", id);
            return q.getResultList();
        } finally {
            em.close();
        }        
    }
    
}
