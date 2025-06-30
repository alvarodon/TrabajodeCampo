/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author treme
 */
public class Imagen extends JLabel {
    private String ruta = "";
    private byte[] imagenBytes = null;

    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;

        Image imagen = null;

        // Si hay byte[] primero
        if (imagenBytes != null) {
            imagen = new ImageIcon(imagenBytes).getImage();
        } else if (ruta != null && !ruta.isEmpty()) {
            URL recurso = getClass().getResource(ruta);
            if (recurso != null) {
                imagen = new ImageIcon(recurso).getImage();
            } else {
                File archivo = new File(ruta);
                if (archivo.exists()) {
                    imagen = new ImageIcon(ruta).getImage();
                }
            }
        }

        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
        this.imagenBytes = null; // Si viene ruta, se borra byte[]
        repaint();
    }

    public void setImagenBytes(byte[] imagenBytes) {
        this.imagenBytes = imagenBytes;
        this.ruta = null; // Si viene byte[], se borra ruta
        repaint();
    }

    public String getRuta() {
        return ruta;
    }

    public byte[] getImagenBytes() {
        return imagenBytes;
    }
}

