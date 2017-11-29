/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author archa
 */
@Entity
@Table(name = "disquera")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disquera.findAll", query = "SELECT d FROM Disquera d")
    , @NamedQuery(name = "Disquera.findByIddisquera", query = "SELECT d FROM Disquera d WHERE d.iddisquera = :iddisquera")
    , @NamedQuery(name = "Disquera.findByNomdisquera", query = "SELECT d FROM Disquera d WHERE d.nomdisquera = :nomdisquera")})
public class Disquera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddisquera")
    private Integer iddisquera;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nomdisquera")
    private String nomdisquera;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "disquera")
    private Collection<Album> albumCollection;

    public Disquera() {
    }

    public Disquera(Integer iddisquera) {
        this.iddisquera = iddisquera;
    }

    public Disquera(Integer iddisquera, String nomdisquera) {
        this.iddisquera = iddisquera;
        this.nomdisquera = nomdisquera;
    }

    public Integer getIddisquera() {
        return iddisquera;
    }

    public void setIddisquera(Integer iddisquera) {
        this.iddisquera = iddisquera;
    }

    public String getNomdisquera() {
        return nomdisquera;
    }

    public void setNomdisquera(String nomdisquera) {
        this.nomdisquera = nomdisquera;
    }

    @XmlTransient
    public Collection<Album> getAlbumCollection() {
        return albumCollection;
    }

    public void setAlbumCollection(Collection<Album> albumCollection) {
        this.albumCollection = albumCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddisquera != null ? iddisquera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disquera)) {
            return false;
        }
        Disquera other = (Disquera) object;
        if ((this.iddisquera == null && other.iddisquera != null) || (this.iddisquera != null && !this.iddisquera.equals(other.iddisquera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nomdisquera.toString() ;
    }
    
}
