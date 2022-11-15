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
@Table(name = "contactus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contactus.findAll", query = "SELECT c FROM Contactus c"),
    @NamedQuery(name = "Contactus.findByUid", query = "SELECT c FROM Contactus c WHERE c.uid = :uid"),
    @NamedQuery(name = "Contactus.findByUname", query = "SELECT c FROM Contactus c WHERE c.uname = :uname"),
    @NamedQuery(name = "Contactus.findByUemail", query = "SELECT c FROM Contactus c WHERE c.uemail = :uemail"),
    @NamedQuery(name = "Contactus.findByReason", query = "SELECT c FROM Contactus c WHERE c.reason = :reason")})
public class Contactus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "uid")
    private Integer uid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uname")
    private int uname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "uemail")
    private int uemail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reason")
    private int reason;

    public Contactus() {
    }

    public Contactus(Integer uid) {
        this.uid = uid;
    }

    public Contactus(Integer uid, int uname, int uemail, int reason) {
        this.uid = uid;
        this.uname = uname;
        this.uemail = uemail;
        this.reason = reason;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public int getUname() {
        return uname;
    }

    public void setUname(int uname) {
        this.uname = uname;
    }

    public int getUemail() {
        return uemail;
    }

    public void setUemail(int uemail) {
        this.uemail = uemail;
    }

    public int getReason() {
        return reason;
    }

    public void setReason(int reason) {
        this.reason = reason;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contactus)) {
            return false;
        }
        Contactus other = (Contactus) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Contactus[ uid=" + uid + " ]";
    }
    
}
