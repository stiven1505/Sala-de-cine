/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salacine;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Sillas {
    
    
     public String[][] ventasSillas(String[][] x,Ventas ventas) {

        int silla = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de de boletos a comprar:"));

       
        for (int i = 0; i < silla; i++) {

            String f = ventas.escogerFila();//letras
            String c = ventas.escogerColumna();//numeros
            
            if (f == "G" && c == "0" || f == "G" && c == "1" || 
                f == "G" && c == "10" || f == "G" && c == "11"||
                f == "F" && c == "0" || f == "F" && c == "1" || f == "F" && c == "10" || f == "F" && c == "11") {
                
                System.out.println("Esta silla no se encuentra disponible");
                
                
            } else {
                if (f.equals("A")) {
                    f = "6";
                }
                if (f.equals("B")) {
                    f = "5";
                }
                if (f.equals("C")) {
                    f = "4";
                }
                if (f.equals("D")) {
                    f = "3";
                }
                if (f.equals("E")) {
                    f = "2";
                }
                if (f.equals("F")) {
                    f = "1";
                }
                if (f.equals("G")) {
                    f = "0";
                }
                x[Integer.parseInt(f)][Integer.parseInt(c)] = "[X]";
            }
          
            
            
                       

            
            
            

        }

        return x;
    }
    
    
        
        
    }
    
    
    
    

