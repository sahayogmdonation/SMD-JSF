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
@Table(name = "login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findById", query = "SELECT l FROM Login l WHERE l.id = :id"),
    @NamedQuery(name = "Login.findByName", query = "SELECT l FROM Login l WHERE l.name = :name"),
    @NamedQuery(name = "Login.findByEmail", query = "SELECT l FROM Login l WHERE l.email = :email"),
    @NamedQuery(name = "Login.findByPass", query = "SELECT l FROM Login l WHERE l.pass = :pass"),
    @NamedQuery(name = "Login.findByCpass", query = "SELECT l FROM Login l WHERE l.cpass = :cpass"),
    @NamedQuery(name = "Login.findByContact", query = "SELECT l FROM Login l WHERE l.contact = :contact"),
    @NamedQuery(name = "Login.findByDesc", query = "SELECT l FROM Login l WHERE l.desc = :desc"),
    @NamedQuery(name = "Login.findByGender", query = "SELECT l FROM Login l WHERE l.gender = :gender"),
    @NamedQuery(name = "Login.findByLicence", query = "SELECT l FROM Login l WHERE l.licence = :licence"),
    @NamedQuery(name = "Login.findByAddress", query = "SELECT l FROM Login l WHERE l.address = :address"),
    @NamedQuery(name = "Login.findBySincedate", query = "SELECT l FROM Login l WHERE l.sincedate = :sincedate"),
    @NamedQuery(name = "Login.findByRegdate", query = "SELECT l FROM Login l WHERE l.regdate = :regdate"),
    @NamedQuery(name = "Login.findByRoleid", query = "SELECT l FROM Login l WHERE l.roleid = :roleid"),
    @NamedQuery(name = "Login.findByRolename", query = "SELECT l FROM Login l WHERE l.rolename = :rolename")})
public class Login implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "name")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "email")
    private String email;
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
    @Size(min = 1, max = 500)
    @Column(name = "desc")
    private String desc;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "pic")
    private byte[] pic;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "licence")
    private String licence;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sincedate")
    @Temporal(TemporalType.DATE)
    private Date sincedate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "regdate")
    @Temporal(TemporalType.DATE)
    private Date regdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "roleid")
    private int roleid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "rolename")
    private String rolename;

    public Login() {
    }

    public Login(Integer id) {
        this.id = id;
    }

    public Login(Integer id, String name, String email, String pass, String cpass, int contact, String desc, byte[] pic, String gender, String licence, String address, Date sincedate, Date regdate, int roleid, String rolename) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
        this.cpass = cpass;
        this.contact = contact;
        this.desc = desc;
        this.pic = pic;
        this.gender = gender;
        this.licence = licence;
        this.address = address;
        this.sincedate = sincedate;
        this.regdate = regdate;
        this.roleid = roleid;
        this.rolename = rolename;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getSincedate() {
        return sincedate;
    }

    public void setSincedate(Date sincedate) {
        this.sincedate = sincedate;
    }

    public Date getRegdate() {
        return regdate;
    }

    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Login[ id=" + id + " ]";
    }
    
}
