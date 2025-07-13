/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhostSystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestor;

import Persistencia.CarritoItemJpaController;
import Persistencia.CarritoJpaController;
import Persistencia.CompradorJpaController;
import Persistencia.ProductoJpaController;
import Persistencia.VendedorJpaController;
import Principal.Carrito;
import Principal.CarritoItem;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author treme
 */


public class Gestor {
    public static CompradorJpaController compradores = new CompradorJpaController();
    public static VendedorJpaController vendedores = new VendedorJpaController();
    public static ProductoJpaController productos = new ProductoJpaController();
    public static CarritoJpaController carritos=new CarritoJpaController();
    public static CarritoItemJpaController carritositems=new CarritoItemJpaController();
    public static List<CarritoItem> itemstemp=new ArrayList<>();
    public static Carrito carritotemp=new Carrito();
}

