/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author treme
 */
@Entity
public class CarritoItem {
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // <--- Agrega esta línea
    private Long id;
    @ManyToOne
    private Producto producto;
    private int cantidad;
    public CarritoItem(){
        
    }
    public CarritoItem(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double Subtotal(){
        return producto.getPrecio()*cantidad;
    }
}
