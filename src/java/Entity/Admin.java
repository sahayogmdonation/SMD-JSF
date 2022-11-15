/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByAid", query = "SELECT a FROM Admin a WHERE a.aid = :aid"),
    @NamedQuery(name = "Admin.findByAname", query = "SELECT a FROM Admin a WHERE a.aname = :aname"),
    @NamedQuery(name = "Admin.findByAemail", query = "SELECT a FROM Admin a WHERE a.aemail = :aemail"),
    @NamedQuery(name = "Admin.findByPass", query = "SELECT a FROM Admin a WHERE a.pass = :pass")})
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "aid")
    private Integer aid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aname")
    private int aname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aemail")
    private int aemail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pass")
    private int pass;

    public Admin() {
    }

    public Admin(Integer aid) {
        this.aid = aid;
    }

    public Admin(Integer aid, int aname, int aemail, int pass) {
        this.aid = aid;
        this.aname = aname;
        this.aemail = aemail;
        this.pass = pass;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public int getAname() {
        return aname;
    }

    public void setAname(int aname) {
        this.aname = aname;
    }

    public int getAemail() {
        return aemail;
    }

    public void setAemail(int aemail) {
        this.aemail = aemail;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aid != null ? aid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.aid == null && other.aid != null) || (this.aid != null && !this.aid.equals(other.aid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Admin[ aid=" + aid + " ]";
    }
    
}
