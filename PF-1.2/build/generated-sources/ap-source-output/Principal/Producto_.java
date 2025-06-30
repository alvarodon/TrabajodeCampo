package Principal;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-22T01:54:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, String> marca;
    public static volatile SingularAttribute<Producto, Double> precio;
    public static volatile SingularAttribute<Producto, byte[]> imagen;
    public static volatile SingularAttribute<Producto, String> id;
    public static volatile SingularAttribute<Producto, Integer> stock;
    public static volatile SingularAttribute<Producto, String> nombre;

}