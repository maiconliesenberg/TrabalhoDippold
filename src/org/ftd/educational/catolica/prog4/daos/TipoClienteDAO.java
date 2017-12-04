package org.ftd.educational.catolica.prog4.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.ftd.educational.catolica.prog4.entities.TipoCliente;

public class TipoClienteDAO extends TipoClienteJpaController {

    public TipoClienteDAO(EntityManagerFactory emf) {
        super(emf);
    }
    
    public TipoCliente findByName(String name) {
        EntityManager em = getEntityManager();
        try {
            return (TipoCliente) em.createNamedQuery("TipoCliente.find.by.name")
                .setParameter("name", name)
                .getSingleResult();
        } finally {
            em.close();
        }        
    }   
    
}
