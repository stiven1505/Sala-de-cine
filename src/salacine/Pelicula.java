/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacine;

import javax.swing.JOptionPane;
import javax.swing.JDialog;

/**
 *
 * @author Usuario
 */
public class Pelicula {
     int numPelicula;

    public int getNumPelicula() {
        return numPelicula;
    }

    public void setNumPelicula(int numPelicula) {
        this.numPelicula = numPelicula;
    }

    public Pelicula() {

    }

    public String[][] definir(String[][] x) {
       
        
        x = new String[numPelicula][4];

        return x;

    }

    public String[][] ingresarPelicula(String[][] x) {
                                
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < 1; j++) {
                x[i][0] = JOptionPane.showInputDialog(null, "Ingrese el nombre de la pelicula");
                x[i][1] = JOptionPane.showInputDialog(null, "Ingrese el idioma: ");
                x[i][2] = JOptionPane.showInputDialog(null, "Ingrese el tipo 35mm o 3D: ");
                x[i][3] = JOptionPane.showInputDialog(null, "Ingrese la duracion: ");
            }
        }

        return x;

    }

    public String[][] mostrarPeliculas(String[][] x) {

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println("--------------------------------------------------Cartelera-----------------------------------------------------");
                System.out.println("Nombre de la pelicula:"+x[i][0]+" "+"Idioma: "+x[i][1]+" "+"Tipo de pelicula: "+x[i][2]+" "+"Duracion: "+x[i][3]);
                 

            }
        }

        return x;
    }

}
