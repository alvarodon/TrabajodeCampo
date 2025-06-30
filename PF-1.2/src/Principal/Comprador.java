/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author treme
 */
@Entity
public class Comprador extends Usuario{
    private double dinero;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    private Carrito carrito;
    public Comprador(){
        
    }
    public Comprador(double dinero, String id, String contrania, String nombre, String apellido1, String apellido2) {
        super(id, contrania, nombre, apellido1, apellido2);
        this.dinero = dinero;
    }
    public void agregarAlCarrito(Producto p, int cantidad){
        
    }
    public void quitarDelCarrito(Producto p){
        
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }
    
}
