package com.mycompany.sc.g2;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


*/

public class SC202G2 {
    
            
    public static void main(String[] args) {
         int opt;
        
        
        do {
            opt = Integer.parseInt((JOptionPane.showInputDialog("[ MENÚ GESTIÓN DE PARTIDOS FÚTBOL 5 ]"
                    + "\n1- Gestión de Jugadores.\n"
                    + "2- Gestión de Equipos.\n"
                    + "3- Simulación de Partidos.\n"
                    + "4- Reportes.\n"
                    + "5- Salir del Sistema.\n")));

            switch (opt) {
                case 1: //Agregar Cliente
                    Gestion.MenuGestionJ();
                    break;
                case 2: //Gestion de Equipos
                    Gestion.MenuGestionE();
                    break;
                case 3: //Simualcion de Partidos
                    Gestion.SimulacionPartidos();
                    break;
                case 4: //Reportes
                    Gestion.Reportes();

                    break;
                case 5: //Salir del Sistema
                    JOptionPane.showMessageDialog(null, "Gracias por usar el Sistema Partidos Fut 5.");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción del Menú No Válida.");
            }

        } while (opt != 5);
        
        
        
    }
    
}
