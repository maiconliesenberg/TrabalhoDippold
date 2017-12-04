package org.ftd.educational.catolica.prog4.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author ftdippold
 */
@Entity
@NamedQueries({
            @NamedQuery(name="Cliente.find.by.name",
                    query="SELECT o FROM Cliente o WHERE o.name =:name"),
            @NamedQuery(name="Cliente.find.by.cpf",
                    query="SELECT o FROM Cliente o WHERE o.cpf =:cpf"),
            @NamedQuery(name="Cliente.findall.by.tipo",
                    query="SELECT o FROM Cliente o WHERE o.tipoClienteid =:id")
})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false, length = 45)
    private String name;
    
    @Column(unique = true, nullable = false, length = 15)
    private String cpf;    
    
    @Column(unique = false, nullable = false, length = 15)
    private Long tipoClienteid = 1L;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Long getTipoClienteid() {
        return tipoClienteid;
    }

    public void setTipoClienteid(Long tipoClienteid) {
        this.tipoClienteid = tipoClienteid;
    }    
    
}
