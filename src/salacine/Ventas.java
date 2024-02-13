/*
 
            
            

        }

 */
package salacine;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static salacine.SalaCine.peliculas;

/**
 *
 * @author Usuario
 */
public class Ventas {

    public String escogerSala(Salas salas) {

        String f = salas.escogerSala();
        return f;
    }

    public String escogerHorario(Horario horario) {

        String f = horario.franjahoraria();
        return f;
    }

    public String[][] mostrarSalaUno(String[][] y) {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {

                System.out.println("--------------Funcion En La Sala 2D-----------------");
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

    public String[][] mostrarSalaDos(String[][] y) {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {

                System.out.println("--------------Funcion En La Sala 2D-----------------");
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

    public String[][] mostrarSalaTres(String[][] y) {

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {

                System.out.println("--------------Funcion En La Sala Tres 3D-----------------");
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

    public String escogerFila() {

        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues1 = {"A", "B", "C", "D", "E", "F", "G"};
        String initialSelection1 = "A";
        Object sala = JOptionPane.showInputDialog(null, "Elija La Fila:",
                "OPCION", JOptionPane.QUESTION_MESSAGE, null, selectionValues1, initialSelection1);
        String opcion = (String) sala;

        return opcion;

    }

    public String escogerColumna() {

        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues1 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
        String initialSelection1 = "0";
        Object sala = JOptionPane.showInputDialog(null, "Elija La columna:",
                "OPCION", JOptionPane.QUESTION_MESSAGE, null, selectionValues1, initialSelection1);
        String opcion = (String) sala;

        return opcion;

    }

    public String[][] sillas(String[][] x) {//8 filas y 12 columnas

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 12; j++) {

                x[i][j] = "[-]";

            }

        }

        return x;
    }

    public String[][] mostrarSala(String[][] x) {
        System.out.println("|----------------------------------------------------------------------------------------------------|");
        System.out.println("|                                       PANTALLA                                                     |");
        System.out.println("|----------------------------------------------------------------------------------------------------|");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 1; j++) {

                System.out.println( x[i][0] + x[i][1] + x[i][2] + x[i][3] + x[i][4] + x[i][5] + x[i][6] + x[i][7] + x[i][8] + x[i][9] + x[i][10] + x[i][11]);

            }
        }

        return x;
    }

    public int ventaTotal2D(String[][] x) {
        System.out.println("--------------------------------------------------Factura----------------------------------------------");
        int preferencia = 12000;
        int general=8000;
        int cont = 0;
        int cont1=0;
        
        
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 12; j++) {

                if (x[0][j].equals("[X]")) {
                    cont++;

                }
                if (x[1][j].equals("[X]")) {
                    cont++;
                }
                if (x[2][j].equals("[X]")) {
                    cont1++;
                }
                if (x[3][j].equals("[X]")) {
                    cont1++;
                }
                if (x[4][j].equals("[X]")) {
                    cont1++;
                }
                if (x[5][j].equals("[X]")) {
                    cont1++;
                }
                if (x[6][j].equals("[X]")) {
                    cont1++;
                }
               
                

            }
        }
        preferencia=cont*preferencia;
        general=cont1*general;
        int total=preferencia+general;
        
        
        
        System.out.println("Valor por sillas de preferencial: "+preferencia);  
        System.out.println("Valor por sillas de general: "+general);
        System.out.println("--------------------------------------------------");
        System.out.println("Valor Total a pagar:"+total);
        

        return preferencia;
    }
    public int ventaTotal3D(String[][] x) {
        System.out.println("--------------------------------------------------Factura----------------------------------------------");
        int preferencia = 12000;
        int general=10000;
        int cont = 0;
        int cont1=0;
        
        
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 12; j++) {

                if (x[0][j].equals("[X]")) {
                    cont++;

                }
                if (x[1][j].equals("[X]")) {
                    cont++;
                }
                if (x[2][j].equals("[X]")) {
                    cont1++;
                }
                if (x[3][j].equals("[X]")) {
                    cont1++;
                }
                if (x[4][j].equals("[X]")) {
                    cont1++;
                }
                if (x[5][j].equals("[X]")) {
                    cont1++;
                }
                if (x[6][j].equals("[X]")) {
                    cont1++;
                }
               
                

            }
        }
        preferencia=cont*preferencia;
        general=cont1*general;
        int total=preferencia+general;
        
        System.out.println("Valor por sillas de preferencial: "+preferencia);  
        System.out.println("Valor por sillas de general: "+general);
        System.out.println("--------------------------------------------------");
        System.out.println("Valor Total a pagar:"+total);
        

        return preferencia;
    }

}
