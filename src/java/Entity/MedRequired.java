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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Rahul
 */
@Entity
@Table(name = "med_required")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedRequired.findAll", query = "SELECT m FROM MedRequired m"),
    @NamedQuery(name = "MedRequired.findByMid", query = "SELECT m FROM MedRequired m WHERE m.mid = :mid"),
    @NamedQuery(name = "MedRequired.findByMname", query = "SELECT m FROM MedRequired m WHERE m.mname = :mname"),
    @NamedQuery(name = "MedRequired.findByNid", query = "SELECT m FROM MedRequired m WHERE m.nid = :nid"),
    @NamedQuery(name = "MedRequired.findByNname", query = "SELECT m FROM MedRequired m WHERE m.nname = :nname"),
    @NamedQuery(name = "MedRequired.findByReqqty", query = "SELECT m FROM MedRequired m WHERE m.reqqty = :reqqty")})
public class MedRequired implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mid")
    private Integer mid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "mname")
    private String mname;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "mpic")
    private byte[] mpic;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nid")
    private int nid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nname")
    private String nname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "reqqty")
    private String reqqty;

    public MedRequired() {
    }

    public MedRequired(Integer mid) {
        this.mid = mid;
    }

    public MedRequired(Integer mid, String mname, byte[] mpic, int nid, String nname, String reqqty) {
        this.mid = mid;
        this.mname = mname;
        this.mpic = mpic;
        this.nid = nid;
        this.nname = nname;
        this.reqqty = reqqty;
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public byte[] getMpic() {
        return mpic;
    }

    public void setMpic(byte[] mpic) {
        this.mpic = mpic;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        this.nname = nname;
    }

    public String getReqqty() {
        return reqqty;
    }

    public void setReqqty(String reqqty) {
        this.reqqty = reqqty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mid != null ? mid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedRequired)) {
            return false;
        }
        MedRequired other = (MedRequired) object;
        if ((this.mid == null && other.mid != null) || (this.mid != null && !this.mid.equals(other.mid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.MedRequired[ mid=" + mid + " ]";
    }
    
}
