package org.ftd.educational.catolica.prog4.daos;

import javax.persistence.EntityManagerFactory;

public class FornecedorDAO extends FornecedorJpaController {

    public FornecedorDAO(EntityManagerFactory emf) {
        super(emf);
    }
    
}
