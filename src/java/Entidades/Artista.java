/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author archa
 */
@Entity
@Table(name = "artista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artista.findAll", query = "SELECT a FROM Artista a")
    , @NamedQuery(name = "Artista.findByIdartista", query = "SELECT a FROM Artista a WHERE a.idartista = :idartista")
    , @NamedQuery(name = "Artista.findByNombreartista", query = "SELECT a FROM Artista a WHERE a.nombreartista = :nombreartista")
    , @NamedQuery(name = "Artista.findByApellidoartista", query = "SELECT a FROM Artista a WHERE a.apellidoartista = :apellidoartista")
    , @NamedQuery(name = "Artista.findByNacionalidad", query = "SELECT a FROM Artista a WHERE a.nacionalidad = :nacionalidad")
    , @NamedQuery(name = "Artista.findByFechanac", query = "SELECT a FROM Artista a WHERE a.fechanac = :fechanac")})
public class Artista implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idartista")
    private Integer idartista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombreartista")
    private String nombreartista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "apellidoartista")
    private String apellidoartista;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechanac")
    @Temporal(TemporalType.DATE)
    private Date fechanac;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "artista")
    private Collection<Album> albumCollection;

    public Artista() {
    }

    public Artista(Integer idartista) {
        this.idartista = idartista;
    }

    public Artista(Integer idartista, String nombreartista, String apellidoartista, String nacionalidad, Date fechanac) {
        this.idartista = idartista;
        this.nombreartista = nombreartista;
        this.apellidoartista = apellidoartista;
        this.nacionalidad = nacionalidad;
        this.fechanac = fechanac;
    }

    public Integer getIdartista() {
        return idartista;
    }

    public void setIdartista(Integer idartista) {
        this.idartista = idartista;
    }

    public String getNombreartista() {
        return nombreartista;
    }

    public void setNombreartista(String nombreartista) {
        this.nombreartista = nombreartista;
    }

    public String getApellidoartista() {
        return apellidoartista;
    }

    public void setApellidoartista(String apellidoartista) {
        this.apellidoartista = apellidoartista;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
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
        hash += (idartista != null ? idartista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artista)) {
            return false;
        }
        Artista other = (Artista) object;
        if ((this.idartista == null && other.idartista != null) || (this.idartista != null && !this.idartista.equals(other.idartista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombreartista.toString()+" "+apellidoartista.toString();
    }
    
}
