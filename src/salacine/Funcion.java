/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacine;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Funcion{
     String horario;
    String sala;
    String opcion;

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
    
    
    public String [][]carteleraGeneral(Pelicula pelicula,String[][]x){
        
         return pelicula.mostrarPeliculas(x);
    }
    
    

    public String[][] Sala(String[][] x) {

        String[][] y;
        y = new String[x.length][6];

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                
                if(sala.equals("Sala 1")){
                    
                 if(x[i][0].equals(opcion)&&x[i][2].equals("35mm")){
                    
                y[i][0] = x[i][0];
                y[i][1] = x[i][1];
                y[i][2] = x[i][2];
                y[i][3] = x[i][3];
                y[i][4] = horario;
                y[i][5] = sala;
                    
                }
                else{
                    System.out.println("Esta pelicula no esta disponible");
                }
                }
                else if(sala.equals("Sala 2")){
                    
                    if(x[i][0].equals(opcion)&&x[i][2].equals("35mm")){
                    
                y[i][0] = x[i][0];
                y[i][1] = x[i][1];
                y[i][2] = x[i][2];
                y[i][3] = x[i][3];
                y[i][4] = horario;
                y[i][5] = sala;
                    
                }
                else{
                    System.out.println("Esta pelicula no esta disponible");
                }
                    
                }
                else  if(sala.equals("Sala 3")){
                    
                    if(x[i][0].equals(opcion)&&x[i][2].equals("3D")){
                    
                y[i][0] = x[i][0];
                y[i][1] = x[i][1];
                y[i][2] = x[i][2];
                y[i][3] = x[i][3];
                y[i][4] = horario;
                y[i][5] = sala;
                    
                }
                else{
                    System.out.println("Esta pelicula no esta disponible");
                }
                    
                }
                
               
               
                

            }
        }

        return y;

    }
    
    

        
        
     


    
}
