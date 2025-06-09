/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author treme
 */
public class Pedido {
    private String id;
    private LocalDateTime fecha;
    private Comprador comprador;
    private ArrayList<CarritoItem>items=new ArrayList<>();
    private double total;
    public Pedido(){        
    }
    public Pedido(String id, LocalDateTime fecha, Comprador comprador, double total) {
        this.id = id;
        this.fecha = fecha;
        this.comprador = comprador;
        this.total = total;
    }
   public void Resumen(){
       
   } 
   public void calcularTotal(){
       
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public ArrayList<CarritoItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CarritoItem> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
   
}
