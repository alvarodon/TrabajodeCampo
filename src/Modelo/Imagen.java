/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author treme
 */
public class Imagen extends JLabel {
    private String ruta=""; //Poder modificar en las propias en Swing o seleccionar imagen a elección mediante set
        @Override
        protected void paintComponent(Graphics gg) {
            super.paintComponent(gg);
            Graphics2D g = (Graphics2D) gg;

        if (ruta != null && !ruta.isEmpty()) {
            ImageIcon imagen = null;

            // Intenta cargar como recurso desde el classpath
         URL recurso = getClass().getResource(ruta);
        if (recurso != null) {
            imagen = new ImageIcon(recurso);
            } else {
            // Si no es recurso, intenta como ruta absoluta
            java.io.File archivo = new java.io.File(ruta);
            if (archivo.exists()) {
                imagen = new ImageIcon(ruta);
            }
           }

        if (imagen != null) {
            g.drawImage(imagen.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        }
    }

    
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    
}
