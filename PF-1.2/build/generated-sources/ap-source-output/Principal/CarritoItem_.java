package Principal;

import Principal.Producto;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-22T01:54:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(CarritoItem.class)
public class CarritoItem_ { 

    public static volatile SingularAttribute<CarritoItem, Long> id;
    public static volatile SingularAttribute<CarritoItem, Producto> producto;
    public static volatile SingularAttribute<CarritoItem, Integer> cantidad;

}