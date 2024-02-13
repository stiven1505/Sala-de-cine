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
public class SalaCine {

    public static String global;
    static String peliculas[][] = null;
    

    static String funcionSalaUnoUno[][] = null;
    static String funcionSalaUnoDos[][] = null;
    static String funcionSalaUnoTres[][] = null;

    static String funcionSalaDosUno[][] = null;
    static String funcionSalaDosDos[][] = null;
    static String funcionSalaDosTres[][] = null;

    static String funcionSalaTresUno[][] = null;
    static String funcionSalaTresDos[][] = null;
    static String funcionSalaTresTres[][] = null;

    static String sillas[][] = null;

    static int y;

    public static void main(String[] args) {

        do {

            JDialog.setDefaultLookAndFeelDecorated(true);
            Object[] selectionValues = {"Creacion de pelicula", "Asignacion de funciones", "Menu de ventas", "Salir"};
            String initialSelection = "Creacion de pelicula";
            Object menu = JOptionPane.showInputDialog(null, "Elija la opcion:",
                    "OPCION", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
            global = (String) menu;

            Pelicula peli = new Pelicula();
            Funcion fu = new Funcion();
            Salas sala = new Salas();
            Horario horario = new Horario();
            Ventas ventas = new Ventas();
            Sillas silla = new Sillas();

            if (global == "Creacion de pelicula") {
                y = (Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de peliculas agregar:")));
                peli.setNumPelicula(y);

                peliculas = peli.definir(peliculas);
                
                peli.ingresarPelicula(peliculas);
         
            }

            if (global == "Asignacion de funciones") {

                funcionSalaUnoUno = new String[y][6];
                funcionSalaUnoDos = new String[y][6];
                funcionSalaUnoTres = new String[y][6];

                funcionSalaDosUno = new String[y][6];
                funcionSalaDosDos = new String[y][6];
                funcionSalaDosTres = new String[y][6];

                funcionSalaTresUno = new String[y][6];
                funcionSalaTresDos = new String[y][6];
                funcionSalaTresTres = new String[y][6];

                fu.carteleraGeneral(peli, peliculas);
                
                String s = sala.escogerSala();

                String h = horario.franjahoraria();

                fu.setHorario(h);
                fu.setSala(s);

                if (s.equals("Sala 1")) {

                    sala.mostrarDisponibles35mm(peliculas);
                    fu.setOpcion(JOptionPane.showInputDialog(null, "Ingrese el nombre de la pelicula"));
                    if (h.equals("14:00-16:30")) {
                        funcionSalaUnoUno = fu.Sala(peliculas);
                        sala.mostrarSala(funcionSalaUnoUno);
                    } else if (h.equals("16:30-19:00")) {
                        funcionSalaUnoDos = fu.Sala(peliculas);
                        sala.mostrarSala(funcionSalaUnoDos);
                    } else if (h.equals("19:00-21:00")) {
                        funcionSalaUnoTres = fu.Sala(peliculas);
                        sala.mostrarSala(funcionSalaUnoTres);

                    }

                }

                if (s.equals("Sala 2")) {
                    sala.mostrarDisponibles35mm(peliculas);

                    fu.setOpcion(JOptionPane.showInputDialog(null, "Ingrese el nombre de la pelicula"));
                    if (h.equals("14:00-16:30")) {
                        funcionSalaDosUno = fu.Sala(peliculas);
                        sala.mostrarSala(funcionSalaDosUno);
                    } else if (h.equals("16:30-19:00")) {
                        funcionSalaDosDos = fu.Sala(peliculas);
                        sala.mostrarSala(funcionSalaDosDos);
                    } else if (h.equals("19:00-21:00")) {
                        funcionSalaDosTres = fu.Sala(peliculas);
                        sala.mostrarSala(funcionSalaDosTres);
                    }
                    if (s.equals("Sala 3")) {

                        sala.mostrarDisponibles3D(peliculas);

                        fu.setOpcion(JOptionPane.showInputDialog(null, "Ingrese el nombre de la pelicula"));
                        if (h.equals("14:00-16:30")) {
                            funcionSalaTresUno = fu.Sala(peliculas);
                            sala.mostrarSala(funcionSalaTresUno);

                        } else if (h.equals("16:30-19:00")) {
                            funcionSalaTresDos = fu.Sala(peliculas);
                            sala.mostrarSala(funcionSalaTresDos);
                        } else if (h.equals("19:00-21:00")) {
                            funcionSalaTresDos = fu.Sala(peliculas);
                            sala.mostrarSala(funcionSalaTresTres);
                        }
                    }
                }
            }

            if (global == "Menu de ventas") {

                sillas = new String[7][12];

               

                String f = ventas.escogerSala(sala);
                String g = ventas.escogerHorario(horario);

                if (f.equals("Sala 1")) {
                    
                    if (g.equals("14:00-16:30")) {
                        ventas.mostrarSalaUno(funcionSalaUnoUno);
                        ventas.sillas(sillas);
                        silla.ventasSillas(sillas, ventas);
                        ventas.mostrarSala(sillas);
                         ventas.ventaTotal2D(sillas);
                    }
                    if (g.equals("16:30-19:00")) {
                        ventas.mostrarSalaUno(funcionSalaUnoDos);
                        ventas.sillas(sillas);
                        silla.ventasSillas(sillas, ventas);
                        ventas.mostrarSala(sillas);
                         ventas.ventaTotal2D(sillas);
                    }
                    if (g.equals("19:00-21:00")) {
                        ventas.mostrarSalaUno(funcionSalaUnoTres);
                        ventas.sillas(sillas);
                        silla.ventasSillas(sillas, ventas);
                        ventas.mostrarSala(sillas);
                         ventas.ventaTotal2D(sillas);
                    }
                }
                if (f.equals("Sala 2")) {
                    if (g.equals("14:00-16:30")) {
                        ventas.mostrarSalaDos(funcionSalaDosUno);
                       ventas.sillas(sillas);
                        silla.ventasSillas(sillas, ventas);
                        ventas.mostrarSala(sillas);
                         ventas.ventaTotal2D(sillas);
                    }
                    if (g.equals("16:30-19:00")) {
                        ventas.mostrarSalaDos(funcionSalaDosDos);
                        ventas.sillas(sillas);
                        silla.ventasSillas(sillas, ventas);
                        ventas.mostrarSala(sillas);
                         ventas.ventaTotal2D(sillas);
                    }
                    if (g.equals("19:00-21:00")) {
                        ventas.mostrarSalaDos(funcionSalaDosTres);
                        ventas.sillas(sillas);
                        silla.ventasSillas(sillas, ventas);
                        ventas.mostrarSala(sillas);
                         ventas.ventaTotal2D(sillas);
                    }
                }
                if (f.equals("Sala 3")) {
                    if (g.equals("14:00-16:30")) {
                        ventas.mostrarSalaTres(funcionSalaTresUno);
                        ventas.sillas(sillas);
                        silla.ventasSillas(sillas, ventas);
                        ventas.mostrarSala(sillas);
                         ventas.ventaTotal3D(sillas);
                    }
                    if (g.equals("16:30-19:00")) {
                        ventas.mostrarSalaTres(funcionSalaTresDos);
                        ventas.sillas(sillas);
                        silla.ventasSillas(sillas, ventas);
                        ventas.mostrarSala(sillas);
                         ventas.ventaTotal3D(sillas);
                    }
                    if (g.equals("19:00-21:00")) {
                        ventas.mostrarSalaTres(funcionSalaTresTres);
                        ventas.sillas(sillas);
                        silla.ventasSillas(sillas, ventas);
                        ventas.mostrarSala(sillas);
                         ventas.ventaTotal3D(sillas);
                    }
                }

            }

        } while (global != "Salir");

    }

}
