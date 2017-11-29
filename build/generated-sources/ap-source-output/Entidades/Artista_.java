package Entidades;

import Entidades.Album;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-28T19:18:45")
@StaticMetamodel(Artista.class)
public class Artista_ { 

    public static volatile SingularAttribute<Artista, Date> fechanac;
    public static volatile CollectionAttribute<Artista, Album> albumCollection;
    public static volatile SingularAttribute<Artista, String> nombreartista;
    public static volatile SingularAttribute<Artista, String> apellidoartista;
    public static volatile SingularAttribute<Artista, Integer> idartista;
    public static volatile SingularAttribute<Artista, String> nacionalidad;

}