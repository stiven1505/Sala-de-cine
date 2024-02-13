/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacine;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Salas {

    
    
    
    public String escogerSala() {

        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues1 = {"Sala 1", "Sala 2", "Sala 3",};
        String initialSelection1 = "Sala 1";
        Object sala = JOptionPane.showInputDialog(null, "Elija la Sala:",
                "OPCION", JOptionPane.QUESTION_MESSAGE, null, selectionValues1, initialSelection1);
        String opcion = (String) sala;

        return opcion;

    }
     public String[][] mostrarSala(String[][] y) {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {

                System.out.println("--------------Funcion Agregada-----------------");
                System.out.println("nombre pelicula: " + y[i][0]);
                System.out.println("Idioma: " + y[i][1]);
                System.out.println("Tipo de pelicula: " + y[i][2]);
                System.out.println("Duracion: " + y[i][3]);
                System.out.println("Horario: " + y[i][4]);
                System.out.println("Funcion en la " + y[i][5]);

            }
        }

        return y;

    }
     public String mostrarDisponibles35mm(String[][] x) {
        System.out.println("-------------------------------");
        System.out.println("Pelicula Disponibles Para La  Sala:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (x[i][2].equals("35mm")) {

                    System.out.println("Pelicula: " + x[i][0]);
                }
            }
        }
        return null;
    }
     public String mostrarDisponibles3D(String[][] x) {
        System.out.println("-------------------------------");
        System.out.println("Pelicula Disponibles Para La Sala Tres:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (x[i][2].equals("3D")) {

                    System.out.println("Pelicula: " + x[i][0]);
                }
            }
        }
        return null;
    }
     
     
}
