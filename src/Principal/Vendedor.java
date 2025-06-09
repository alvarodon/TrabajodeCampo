/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author treme
 */
@Entity
public class Vendedor extends Usuario{
    @OneToMany(cascade = CascadeType.ALL)
    private List<Producto> productos;
    public Vendedor(){
        
    }
    public Vendedor(String id, String contrania, String nombre, String apellido1, String apellido2) {
        super(id, contrania, nombre, apellido1, apellido2);
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    public void eliminarProducto(Producto p){
        productos.remove(p);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
}
