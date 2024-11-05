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
            opt = Integer.parseInt((JOptionPane.showInputDialog("----- [MENU GESTIÓN DE PARTIDOS FÚTBOL CINCO]-----"
                    + "\n1- Gestión de Jugadores.\n"
                    + "2- Gestión de Equipos.\n"
                    + "3- Simulación de Partidos.\n"
                    + "4- Reportes.\n"
                    + "5- Salir del Sistema.\n")));
//Esto es un ejemplo tomado de la practica del profe hay que adaptarlo al proyecto
            switch (opt) {
                case 1: //Agregar Cliente
                    Gestion.AgregarCliente();
                    break;
                case 2: //Editar Cliente
                    Gestion.EditarCliente();
                    break;
                case 3: //Mostrar Cliente
                    Gestion.MostrarCliente();
                    break;
                case 4: //Solitar Pedido
                    Gestion.SolicitarPedido();

                    break;
                case 5: //Mostrar Pedido
                    Gestion.MostrarPedido();
                    break;
                case 6: //Salir
                    JOptionPane.showMessageDialog(null, "Gracias por usar el Sistema de Gestion de Clientes.");

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion del menu no valida.");
            }

        } while (opt != 6);
        
        
    }
    
}
