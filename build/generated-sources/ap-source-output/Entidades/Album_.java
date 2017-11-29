package Entidades;

import Entidades.AlbumPK;
import Entidades.Artista;
import Entidades.Disquera;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-28T19:18:45")
@StaticMetamodel(Album.class)
public class Album_ { 

    public static volatile SingularAttribute<Album, Disquera> disquera;
    public static volatile SingularAttribute<Album, Artista> artista;
    public static volatile SingularAttribute<Album, Double> valor;
    public static volatile SingularAttribute<Album, AlbumPK> albumPK;
    public static volatile SingularAttribute<Album, String> nombrealbum;
    public static volatile SingularAttribute<Album, String> portada;
    public static volatile SingularAttribute<Album, String> anio;

}