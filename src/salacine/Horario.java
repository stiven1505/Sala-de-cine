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
public class Horario {

    public String franjahoraria() {

        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues1 = {"14:00-16:30", "16:30-19:00", "19:00-21:00"};
        String initialSelection1 = "14:00-16:30";
        Object horario = JOptionPane.showInputDialog(null, "Elija el horario:",
                "OPCION", JOptionPane.QUESTION_MESSAGE, null, selectionValues1, initialSelection1);
        String opcion = (String) horario;

        return opcion;
    }

}
