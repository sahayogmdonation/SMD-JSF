/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "ngoreg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ngoreg.findAll", query = "SELECT n FROM Ngoreg n"),
    @NamedQuery(name = "Ngoreg.findByNid", query = "SELECT n FROM Ngoreg n WHERE n.nid = :nid"),
    @NamedQuery(name = "Ngoreg.findByNname", query = "SELECT n FROM Ngoreg n WHERE n.nname = :nname"),
    @NamedQuery(name = "Ngoreg.findByNemail", query = "SELECT n FROM Ngoreg n WHERE n.nemail = :nemail"),
    @NamedQuery(name = "Ngoreg.findByPass", query = "SELECT n FROM Ngoreg n WHERE n.pass = :pass"),
    @NamedQuery(name = "Ngoreg.findByCpass", query = "SELECT n FROM Ngoreg n WHERE n.cpass = :cpass"),
    @NamedQuery(name = "Ngoreg.findByContact", query = "SELECT n FROM Ngoreg n WHERE n.contact = :contact"),
    @NamedQuery(name = "Ngoreg.findByNdes", query = "SELECT n FROM Ngoreg n WHERE n.ndes = :ndes"),
    @NamedQuery(name = "Ngoreg.findByNlicence", query = "SELECT n FROM Ngoreg n WHERE n.nlicence = :nlicence"),
    @NamedQuery(name = "Ngoreg.findByNaddress", query = "SELECT n FROM Ngoreg n WHERE n.naddress = :naddress"),
    @NamedQuery(name = "Ngoreg.findByNsincedate", query = "SELECT n FROM Ngoreg n WHERE n.nsincedate = :nsincedate"),
    @NamedQuery(name = "Ngoreg.findByRegdate", query = "SELECT n FROM Ngoreg n WHERE n.regdate = :regdate")})
public class Ngoreg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "nid")
    private Integer nid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nname")
    private String nname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nemail")
    private String nemail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "pass")
    private String pass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "cpass")
    private String cpass;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contact")
    private int contact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ndes")
    private String ndes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nlicence")
    private String nlicence;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "npic")
    private byte[] npic;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "naddress")
    private String naddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nsincedate")
    @Temporal(TemporalType.DATE)
    private Date nsincedate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "regdate")
    @Temporal(TemporalType.DATE)
    private Date regdate;

    public Ngoreg() {
    }

    public Ngoreg(Integer nid) {
        this.nid = nid;
    }

    public Ngoreg(Integer nid, String nname, String nemail, String pass, String cpass, int contact, String ndes, String nlicence, byte[] npic, String naddress, Date nsincedate, Date regdate) {
        this.nid = nid;
        this.nname = nname;
        this.nemail = nemail;
        this.pass = pass;
        this.cpass = cpass;
        this.contact = contact;
        this.ndes = ndes;
        this.nlicence = nlicence;
        this.npic = npic;
        this.naddress = naddress;
        this.nsincedate = nsincedate;
        this.regdate = regdate;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getNemail() {
        return nemail;
    }

    public void setNemail(String nemail) {
        this.nemail = nemail;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpass() {
        return cpass;
    }

    public void setCpass(String cpass) {
        this.cpass = cpass;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getNdes() {
        return ndes;
    }

    public void setNdes(String ndes) {
        this.ndes = ndes;
    }

    public String getNlicence() {
        return nlicence;
    }

    public void setNlicence(String nlicence) {
        this.nlicence = nlicence;
    }

    public byte[] getNpic() {
        return npic;
    }

    public void setNpic(byte[] npic) {
        this.npic = npic;
    }

    public String getNaddress() {
        return naddress;
    }

    public void setNaddress(String naddress) {
        this.naddress = naddress;
    }

    public Date getNsincedate() {
        return nsincedate;
    }

    public void setNsincedate(Date nsincedate) {
        this.nsincedate = nsincedate;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nid != null ? nid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ngoreg)) {
            return false;
        }
        Ngoreg other = (Ngoreg) object;
        if ((this.nid == null && other.nid != null) || (this.nid != null && !this.nid.equals(other.nid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Ngoreg[ nid=" + nid + " ]";
    }
    
}
