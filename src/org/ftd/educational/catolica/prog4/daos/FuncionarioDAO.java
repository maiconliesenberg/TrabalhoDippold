/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ftd.educational.catolica.prog4.daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.ftd.educational.catolica.prog4.entities.Cliente;

/**
 *
 * @author maicon.liesenberg
 */
public class FuncionarioDAO extends FuncionarioJpaController{

    public FuncionarioDAO(EntityManagerFactory emf) {
        super(emf);
    }
    
    public Cliente findByName(String name) {
        EntityManager em = getEntityManager();
        try {
            return (Cliente) em.createNamedQuery("Funcionario.find.by.name")
                .setParameter("name", name)
                .getSingleResult();
        } finally {
            
        }        
    }    
    
    public Cliente findByCpf(String cpf) {
        EntityManager em = getEntityManager();
        try {
            return (Cliente) em.createNamedQuery("Funcionario.find.by.cpf")
                .setParameter("cpf", cpf)
                .getSingleResult();
        } finally {
            em.close();
        }        
    }
    
}
