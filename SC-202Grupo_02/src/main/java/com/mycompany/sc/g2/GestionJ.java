package com.mycompany.sc.g2;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


 */
public class GestionJ {

    // || ATRIBUTOS ||
/*
los 30 nombres
*/
    private static Jugador jugador1;
    private static Jugador jugador2;
    private static Jugador jugador3;
    private static Jugador jugador4;
    private static Jugador jugador5;
    private static Jugador jugador6;
    private static Jugador jugador7;
    private static Jugador jugador8;
    private static Jugador jugador9;
    private static Jugador jugador10;
    private static Jugador jugador11;
    private static Jugador jugador12;
    private static Jugador jugador13;
    private static Jugador jugador14;
    private static Jugador jugador15;
    private static Jugador jugador16;
    private static Jugador jugador17;
    private static Jugador jugador18;
    private static Jugador jugador19;
    private static Jugador jugador20;
    private static Jugador jugador21;
    private static Jugador jugador22;
    private static Jugador jugador23;
    private static Jugador jugador24;
    private static Jugador jugador25;
    private static Jugador jugador26;
    private static Jugador jugador27;
    private static Jugador jugador28;
    private static Jugador jugador29;
    private static Jugador jugador30;
    private static Jugador jugador31;
    private static Jugador jugador32;
    private static Jugador jugador33;
    private static Jugador jugador34;
    private static Jugador jugador35;
    private static Jugador jugador36;
    private static Jugador jugador37;
    private static Jugador jugador38;
    private static Jugador jugador39;
    private static Jugador jugador40;
    private static Jugador jugador41;
    private static Jugador jugador42;
    private static Jugador jugador43;
    private static Jugador jugador44;
    private static Jugador jugador45;
    private static Jugador jugador46;
    private static Jugador jugador47;
    private static Jugador jugador48;
    private static Jugador jugador49;
    private static Jugador jugador50;
    private static Jugador jugador51;
    private static Jugador jugador52;
    private static Jugador jugador53;
    private static Jugador jugador54;
    private static Jugador jugador55;
    private static Jugador jugador56;
    private static Jugador jugador57;
    private static Jugador jugador58;
    private static Jugador jugador59;
    private static Jugador jugador60;
    private static Jugador jugador61;
    private static Jugador jugador62;
    private static Jugador jugador63;
    private static Jugador jugador64;
    private static Jugador jugador65;
    private static Jugador jugador66;
    private static Jugador jugador67;
    private static Jugador jugador68;
    private static Jugador jugador69;
    private static Jugador jugador70;

    // || MÉTODOS PARA EL MENÚ ||
    
    
    public static void MostrarJugador() {
        hdhdhdg

    }

    public static void AgregarJugador() {
        if (Jugador.cantidadJugador == 70) {
            JOptionPane.showMessageDialog(null, "Este Sistema solo puede gestionar 70 Jugadores.");
            return;

        }
        String nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre del Jugador #" + (Jugador.cantidadJugador + 1) + ": ");
        
        switch (Jugador.cantidadJugador) {
            case 0:
                jugador1 = new Jugador("Alessandro Calero", 10, Estado.titular);

                break;
            case 1:
                jugador2 = new Jugador("Carlos Gómez", 11, Estado.suplente);

                break;
            case 2:
                jugador3 = new Jugador("David Matínez", 12, Estado.titular);

                break;
            case 3:
                jugador4 = new Jugador("Juan Rodríguez", 13, Estado.suplente);

                break;
                
            case 4:
                jugador5 = new Jugador("Andrés Sánchez", 14, Estado.suplente);

                break;
            case 5:
                jugador6 = new Jugador("Luis López", 15, Estado.libre);

                break;
            case 6:
                jugador7 = new Jugador("José Fernández", 16, Estado.suplente);

                break;
            case 7:
                jugador8 = new Jugador("Josue González", 17, Estado.titular);

                break;
            case 8:
                jugador9 = new Jugador("Miguel Díaz", 18, Estado.libre);

                break;
            case 9:
                jugador10 = new Jugador("Javier Herrera", 19, Estado.libre);

                break;
                
            case 10:
                jugador11 = new Jugador("Jonathan García", 20, Estado.titular);

                break;
            case 11:
                jugador12 = new Jugador("Antonio Jiménez", 21, Estado.suplente);

                break;
            case 12:
                jugador13 = new Jugador("Pedro Ruíz", 22, Estado.libre);

                break;
            case 13:
                jugador14 = new Jugador("Jafeth Romero", 23, Estado.titular);

                break;
            case 14:
                jugador15 = new Jugador("Sergio Ramírez", 24, Estado.titular);

                break;
            case 15:
                jugador16 = new Jugador("Rafael Vargas", 25, Estado.libre);

                break;
                
            case 16:
                jugador17 = new Jugador("Enrique Morales", 26, Estado.libre);

                break;
            case 17:
                jugador18 = new Jugador("Manuel Castro", 27, Estado.titular);

                break;
            case 18:
                jugador19 = new Jugador("Sebastian Ortega", 28, Estado.suplente);

                break;
            case 19:
                jugador20 = new Jugador("Alex Delgado", 29, Estado.titular);

                break;
            case 20:
                jugador21 = new Jugador("Victor Navarro", 30, Estado.libre);

                break;
            case 21:
                jugador22 = new Jugador("Darian Soto", 31, Estado.titular);

                break;
                
            case 22:
                jugador23 = new Jugador("Anthony Ramírez", 32, Estado.titular);

                break;
            case 23:
                jugador24 = new Jugador("Oscar Barrientos", 33, Estado.titular);

                break;
            case 24:
                jugador25 = new Jugador("Junior Muñoz", 34, Estado.titular);

                break;
            case 25:
                jugador26 = new Jugador("John Romero", 35, Estado.titular);

                break;
            case 26:
                jugador27 = new Jugador("Aaron López", 36, Estado.titular);

                break;
            case 27:
                jugador28 = new Jugador("Eddy Sánchez", 37, Estado.titular);

                break;
                
            case 28:
                jugador29 = new Jugador("Ángel Molina", 38, Estado.libre);

                break;
            case 29:
                jugador30 = new Jugador("Martín Saavedra", 39, Estado.libre);

                break;
            case 30:
                jugador31 = new Jugador("Deiby Soto", 40, Estado.titular);

                break;
            case 31:
                jugador32 = new Jugador(nombreJugador, 41, Estado.libre);

                break;
            case 32:
                jugador33 = new Jugador(nombreJugador, 42, Estado.libre);

                break;
            case 33:
                jugador34 = new Jugador(nombreJugador, 43, Estado.libre);

                break;
                
            case 34:
                jugador35 = new Jugador(nombreJugador, 44, Estado.libre);

                break;
            case 35:
                jugador36 = new Jugador(nombreJugador, 45, Estado.libre);

                break;
            case 36:
                jugador37 = new Jugador(nombreJugador, 46, Estado.libre);

                break;
            case 37:
                jugador38 = new Jugador(nombreJugador, 47, Estado.libre);

                break;
            case 38:
                jugador39 = new Jugador(nombreJugador, 48, Estado.libre);

                break;
            case 39:
                jugador40 = new Jugador(nombreJugador, 49, Estado.libre);

                break;
                
            case 40:
                jugador41 = new Jugador(nombreJugador, 50, Estado.libre);

                break;
            case 41:
                jugador42 = new Jugador(nombreJugador, 51, Estado.libre);

                break;
            case 42:
                jugador43 = new Jugador(nombreJugador, 52, Estado.libre);

                break;
            case 43:
                jugador44 = new Jugador(nombreJugador, 53, Estado.libre);

                break;
            case 44:
                jugador45 = new Jugador(nombreJugador, 54, Estado.libre);

                break;
            case 45:
                jugador46 = new Jugador(nombreJugador, 55, Estado.libre);

                break;
                
            case 46:
                jugador47 = new Jugador(nombreJugador, 56, Estado.libre);

                break;
            case 47:
                jugador48 = new Jugador(nombreJugador, 57, Estado.libre);

                break;
            case 48:
                jugador49 = new Jugador(nombreJugador, 58, Estado.libre);

                break;
            case 49:
                jugador50 = new Jugador(nombreJugador, 59, Estado.libre);

                break;
            case 50:
                jugador51 = new Jugador(nombreJugador, 60, Estado.libre);

                break;
            case 51:
                jugador52 = new Jugador(nombreJugador, 61, Estado.libre);

                break;
                
            case 52:
                jugador53 = new Jugador(nombreJugador, 62, Estado.libre);

                break;
            case 53:
                jugador54 = new Jugador(nombreJugador, 63, Estado.libre);

                break;
            case 54:
                jugador55 = new Jugador(nombreJugador, 64, Estado.libre);

                break;
            case 55:
                jugador56 = new Jugador(nombreJugador, 65, Estado.libre);

                break;
            case 56:
                jugador57 = new Jugador(nombreJugador, 66, Estado.libre);

                break;
            case 57:
                jugador58 = new Jugador(nombreJugador, 67, Estado.libre);

                break;
                
            case 58:
                jugador59 = new Jugador(nombreJugador, 68, Estado.libre);

                break;
            case 59:
                jugador60 = new Jugador(nombreJugador, 69, Estado.libre);

                break;
            case 60:
                jugador61 = new Jugador(nombreJugador, 70, Estado.libre);

                break;
            case 61:
                jugador62 = new Jugador(nombreJugador, 71, Estado.libre);

                break;
            case 62:
                jugador63 = new Jugador(nombreJugador, 72, Estado.libre);

                break;
            case 63:
                jugador64 = new Jugador(nombreJugador, 73, Estado.libre);

                break;
                
            case 64:
                jugador65 = new Jugador(nombreJugador, 74, Estado.libre);

                break;
            case 65:
                jugador66 = new Jugador(nombreJugador, 75, Estado.libre);

                break;
            case 66:
                jugador67 = new Jugador(nombreJugador, 76, Estado.libre);

                break;
            case 67:
                jugador68 = new Jugador(nombreJugador, 77, Estado.libre);

                break;
            case 68:
                jugador69 = new Jugador(nombreJugador, 78, Estado.libre);

                break;
            case 69:
                jugador70 = new Jugador(nombreJugador, 79, Estado.libre);

                break;
        }
    }

    public static void EditarJugador() {

    }

    public static void EliminarJugador() {

    }

    // || MÉTODOS GENERALES ||
    //Esto es un ejemplo tomado de la practica del profe hay que adaptarlo al proyecto
//    private static Equipo seleccionEquipo(){
//        if (Cliente.cantidadClientes == 0) {
//            JOptionPane.showMessageDialog(null, "No hay Clientes en el Sistema.");
//            return null;
//        }
//        int valorBoton = JOptionPane.showOptionDialog(null, "¿Seleccione un Cliente?",
//                "Seleccione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
//                null, botones(), "Cliente #1");
//        switch (valorBoton) {
//            case 0:
//                return cliente1;
//            case 1:
//                return cliente2;
//            case 2:
//                return cliente3;
//
//        }
//        return null;
//    }
//    
//    
    
//    private static Jugador seleccionJugador(){
//        if (Cliente.cantidadClientes == 0) {
//            JOptionPane.showMessageDialog(null, "No hay Clientes en el Sistema.");
//            return null;
//        }
//        int valorBoton = JOptionPane.showOptionDialog(null, "¿Seleccione un Cliente?",
//                "Seleccione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
//                null, botones(), "Cliente #1");
//        switch (valorBoton) {
//            case 0:
//                return cliente1;
//            case 1:
//                return cliente2;
//            case 2:
//                return cliente3;
//
//        }
//        return null;
//    }
//    //Esto es un ejemplo tomado de la practica del profe hay que adaptarlo al proyecto
//    private static String [] botonesMotrarJugadores(){
//        if (Jugador.cantidadJugador == 1) {
//            String botones [] = {"Cliente #1"};
//            return botones;
//        }else if (Cliente.cantidadClientes == 2){
//            String botones [] = {"Cliente #1","Cliente #2"};
//            return botones;
//        }else if (Cliente.cantidadClientes == 3){
//            String botones [] = {"Cliente #1", "Cliente #2", "Cliente #3"};
//            return botones;
//        }
//        return null;
//    }
    
       // String allJugadores [] = {jugador1.getNombreJugador()}; 
    // || GETS AND SETS ||
}
