package Principal;

import Principal.CarritoItem;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-22T01:54:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Carrito.class)
public class Carrito_ { 

    public static volatile SingularAttribute<Carrito, String> id;
    public static volatile ListAttribute<Carrito, CarritoItem> items;

}