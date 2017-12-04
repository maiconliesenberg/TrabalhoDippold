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
 * @author Fabio Tavares Dippold
 * @version 2017-08-21
 */
@Entity
@NamedQueries({
    @NamedQuery(
        name = "User.authenticate",
        query = "SELECT o FROM User o WHERE o.login = :login AND o.passwd = :passwd")
})
public class User implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false, length = 45)
    private String name;
    
    @Column(unique = true, nullable = false, length = 45)
    private String login;
    
    @Column(nullable = false, length = 45)
    private String passwd;

    @Override
    public String toString() {
        return this.getId() + " - " + this.getName();
    }
    
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    
    
}
