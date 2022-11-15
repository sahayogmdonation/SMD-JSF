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
@Table(name = "med_donater")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedDonater.findAll", query = "SELECT m FROM MedDonater m"),
    @NamedQuery(name = "MedDonater.findByUid", query = "SELECT m FROM MedDonater m WHERE m.uid = :uid"),
    @NamedQuery(name = "MedDonater.findByUname", query = "SELECT m FROM MedDonater m WHERE m.uname = :uname"),
    @NamedQuery(name = "MedDonater.findByUemail", query = "SELECT m FROM MedDonater m WHERE m.uemail = :uemail"),
    @NamedQuery(name = "MedDonater.findByMid", query = "SELECT m FROM MedDonater m WHERE m.mid = :mid"),
    @NamedQuery(name = "MedDonater.findByMname", query = "SELECT m FROM MedDonater m WHERE m.mname = :mname"),
    @NamedQuery(name = "MedDonater.findByMqty", query = "SELECT m FROM MedDonater m WHERE m.mqty = :mqty"),
    @NamedQuery(name = "MedDonater.findByMpic", query = "SELECT m FROM MedDonater m WHERE m.mpic = :mpic"),
    @NamedQuery(name = "MedDonater.findByUaddress", query = "SELECT m FROM MedDonater m WHERE m.uaddress = :uaddress"),
    @NamedQuery(name = "MedDonater.findByDonatedate", query = "SELECT m FROM MedDonater m WHERE m.donatedate = :donatedate"),
    @NamedQuery(name = "MedDonater.findByNid", query = "SELECT m FROM MedDonater m WHERE m.nid = :nid")})
public class MedDonater implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "uid")
    private Integer uid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "uname")
    private String uname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "uemail")
    private String uemail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mid")
    private int mid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "mname")
    private String mname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mqty")
    private int mqty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mpic")
    private int mpic;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "uaddress")
    private String uaddress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "donatedate")
    @Temporal(TemporalType.DATE)
    private Date donatedate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nid")
    private int nid;

    public MedDonater() {
    }

    public MedDonater(Integer uid) {
        this.uid = uid;
    }

    public MedDonater(Integer uid, String uname, String uemail, int mid, String mname, int mqty, int mpic, String uaddress, Date donatedate, int nid) {
        this.uid = uid;
        this.uname = uname;
        this.uemail = uemail;
        this.mid = mid;
        this.mname = mname;
        this.mqty = mqty;
        this.mpic = mpic;
        this.uaddress = uaddress;
        this.donatedate = donatedate;
        this.nid = nid;
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

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getMqty() {
        return mqty;
    }

    public void setMqty(int mqty) {
        this.mqty = mqty;
    }

    public int getMpic() {
        return mpic;
    }

    public void setMpic(int mpic) {
        this.mpic = mpic;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Date getDonatedate() {
        return donatedate;
    }

    public void setDonatedate(Date donatedate) {
        this.donatedate = donatedate;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
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
        if (!(object instanceof MedDonater)) {
            return false;
        }
        MedDonater other = (MedDonater) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.MedDonater[ uid=" + uid + " ]";
    }
    
}
