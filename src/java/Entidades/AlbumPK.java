/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author archa
 */
@Embeddable
public class AlbumPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idalbum")
    private int idalbum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iddisquera")
    private int iddisquera;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idartista")
    private int idartista;

    public AlbumPK() {
    }

    public AlbumPK(int idalbum, int iddisquera, int idartista) {
        this.idalbum = idalbum;
        this.iddisquera = iddisquera;
        this.idartista = idartista;
    }

    public int getIdalbum() {
        return idalbum;
    }

    public void setIdalbum(int idalbum) {
        this.idalbum = idalbum;
    }

    public int getIddisquera() {
        return iddisquera;
    }

    public void setIddisquera(int iddisquera) {
        this.iddisquera = iddisquera;
    }

    public int getIdartista() {
        return idartista;
    }

    public void setIdartista(int idartista) {
        this.idartista = idartista;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idalbum;
        hash += (int) iddisquera;
        hash += (int) idartista;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlbumPK)) {
            return false;
        }
        AlbumPK other = (AlbumPK) object;
        if (this.idalbum != other.idalbum) {
            return false;
        }
        if (this.iddisquera != other.iddisquera) {
            return false;
        }
        if (this.idartista != other.idartista) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.AlbumPK[ idalbum=" + idalbum + ", iddisquera=" + iddisquera + ", idartista=" + idartista + " ]";
    }
    
}
