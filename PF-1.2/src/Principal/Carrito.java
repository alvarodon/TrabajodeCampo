/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author treme
 */
@Entity
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "carrito_id")
    private List<CarritoItem> items;
    public Carrito(){
        this.id = UUID.randomUUID().toString();
        this.items = items=new ArrayList<>();
    }
    public void agregarItem(Producto p, int cantidad){
        
    }
    public void quitarItem(Producto p){
        
    }
    public void calcularTotal(){
        
    }

    public List<CarritoItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CarritoItem> items) {
        this.items = items;
    }
    
}
