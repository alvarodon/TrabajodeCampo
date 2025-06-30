package Principal;

import Principal.Carrito;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-06-22T01:54:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Comprador.class)
public class Comprador_ extends Usuario_ {

    public static volatile SingularAttribute<Comprador, Double> dinero;
    public static volatile SingularAttribute<Comprador, Carrito> carrito;

}