/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author archa
 */
@Entity
@Table(name = "album")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Album.findAll", query = "SELECT a FROM Album a")
    , @NamedQuery(name = "Album.findByIdalbum", query = "SELECT a FROM Album a WHERE a.albumPK.idalbum = :idalbum")
    , @NamedQuery(name = "Album.findByNombrealbum", query = "SELECT a FROM Album a WHERE a.nombrealbum = :nombrealbum")
    , @NamedQuery(name = "Album.findByAnio", query = "SELECT a FROM Album a WHERE a.anio = :anio")
    , @NamedQuery(name = "Album.findByValor", query = "SELECT a FROM Album a WHERE a.valor = :valor")
    , @NamedQuery(name = "Album.findByIddisquera", query = "SELECT a FROM Album a WHERE a.albumPK.iddisquera = :iddisquera")
    , @NamedQuery(name = "Album.findByIdartista", query = "SELECT a FROM Album a WHERE a.albumPK.idartista = :idartista")
    , @NamedQuery(name = "Album.findByPortada", query = "SELECT a FROM Album a WHERE a.portada = :portada")})
public class Album implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlbumPK albumPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nombrealbum")
    private String nombrealbum;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "anio")
    private String anio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "valor")
    private double valor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "portada")
    private String portada;
    @JoinColumn(name = "idartista", referencedColumnName = "idartista", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Artista artista;
    @JoinColumn(name = "iddisquera", referencedColumnName = "iddisquera", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Disquera disquera;

    public Album() {
    }

    public Album(AlbumPK albumPK) {
        this.albumPK = albumPK;
    }

    public Album(AlbumPK albumPK, String nombrealbum, String anio, double valor, String portada) {
        this.albumPK = albumPK;
        this.nombrealbum = nombrealbum;
        this.anio = anio;
        this.valor = valor;
        this.portada = portada;
    }

    public Album(int idalbum, int iddisquera, int idartista) {
        this.albumPK = new AlbumPK(idalbum, iddisquera, idartista);
    }

    public AlbumPK getAlbumPK() {
        return albumPK;
    }

    public void setAlbumPK(AlbumPK albumPK) {
        this.albumPK = albumPK;
    }

    public String getNombrealbum() {
        return nombrealbum;
    }

    public void setNombrealbum(String nombrealbum) {
        this.nombrealbum = nombrealbum;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Disquera getDisquera() {
        return disquera;
    }

    public void setDisquera(Disquera disquera) {
        this.disquera = disquera;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (albumPK != null ? albumPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Album)) {
            return false;
        }
        Album other = (Album) object;
        if ((this.albumPK == null && other.albumPK != null) || (this.albumPK != null && !this.albumPK.equals(other.albumPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Album[ albumPK=" + albumPK + " ]";
    }
    
}
