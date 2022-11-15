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
@Table(name = "userreg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Userreg.findAll", query = "SELECT u FROM Userreg u"),
    @NamedQuery(name = "Userreg.findByUid", query = "SELECT u FROM Userreg u WHERE u.uid = :uid"),
    @NamedQuery(name = "Userreg.findByUname", query = "SELECT u FROM Userreg u WHERE u.uname = :uname"),
    @NamedQuery(name = "Userreg.findByUemail", query = "SELECT u FROM Userreg u WHERE u.uemail = :uemail"),
    @NamedQuery(name = "Userreg.findByPass", query = "SELECT u FROM Userreg u WHERE u.pass = :pass"),
    @NamedQuery(name = "Userreg.findByCpass", query = "SELECT u FROM Userreg u WHERE u.cpass = :cpass"),
    @NamedQuery(name = "Userreg.findByUcon", query = "SELECT u FROM Userreg u WHERE u.ucon = :ucon"),
    @NamedQuery(name = "Userreg.findByAbout", query = "SELECT u FROM Userreg u WHERE u.about = :about"),
    @NamedQuery(name = "Userreg.findByGender", query = "SELECT u FROM Userreg u WHERE u.gender = :gender"),
    @NamedQuery(name = "Userreg.findByRegdate", query = "SELECT u FROM Userreg u WHERE u.regdate = :regdate")})
public class Userreg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "uid")
    private Integer uid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "uname")
    private String uname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "uemail")
    private String uemail;
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
    @Size(min = 1, max = 100)
    @Column(name = "ucon")
    private String ucon;
    @Size(max = 200)
    @Column(name = "about")
    private String about;
    @Size(max = 10)
    @Column(name = "gender")
    private String gender;
    @Lob
    @Column(name = "upic")
    private byte[] upic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "regdate")
    @Temporal(TemporalType.DATE)
    private Date regdate;

    public Userreg() {
    }

    public Userreg(Integer uid) {
        this.uid = uid;
    }

    public Userreg(Integer uid, String uname, String uemail, String pass, String cpass, String ucon, Date regdate) {
        this.uid = uid;
        this.uname = uname;
        this.uemail = uemail;
        this.pass = pass;
        this.cpass = cpass;
        this.ucon = ucon;
        this.regdate = regdate;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
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

    public String getUcon() {
        return ucon;
    }

    public void setUcon(String ucon) {
        this.ucon = ucon;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public byte[] getUpic() {
        return upic;
    }

    public void setUpic(byte[] upic) {
        this.upic = upic;
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
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userreg)) {
            return false;
        }
        Userreg other = (Userreg) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Userreg[ uid=" + uid + " ]";
    }
    
}
