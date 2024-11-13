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
//    int edades[] = new int[5];
//
//        //nombre arreglo
//        edades[2] = 52;
//        edades[0] = 18;
//        edades[4] = edades[2]- edades[0];
    private static Jugador jugador1 = new Jugador("Alessandro Calero", 10, Estado.titular);
    private static Jugador jugador2 = new Jugador("Carlos Gómez", 11, Estado.suplente);
    private static Jugador jugador3= new Jugador("David Matínez", 12, Estado.titular);
    private static Jugador jugador4= new Jugador("Juan Rodríguez", 13, Estado.suplente);
    private static Jugador jugador5= new Jugador("Andrés Sánchez", 14, Estado.suplente);
    private static Jugador jugador6= new Jugador("Luis López", 15, Estado.libre);
    private static Jugador jugador7= new Jugador("José Fernández", 16, Estado.suplente);
    private static Jugador jugador8= new Jugador("Josue González", 17, Estado.titular);
    private static Jugador jugador9= new Jugador("Miguel Díaz", 18, Estado.libre);
    private static Jugador jugador10= new Jugador("Javier Herrera", 19, Estado.libre);
    private static Jugador jugador11= new Jugador("Jonathan García", 20, Estado.titular);
    private static Jugador jugador12 = new Jugador("Antonio Jiménez", 21, Estado.suplente);
    private static Jugador jugador13= new Jugador("Pedro Ruíz", 22, Estado.libre);
    private static Jugador jugador14= new Jugador("Jafeth Romero", 23, Estado.titular);
    private static Jugador jugador15= new Jugador("Sergio Ramírez", 24, Estado.titular);
    private static Jugador jugador16= new Jugador("Rafael Vargas", 25, Estado.libre);
    private static Jugador jugador17= new Jugador("Enrique Morales", 26, Estado.libre);
    private static Jugador jugador18= new Jugador("Manuel Castro", 27, Estado.titular);
    private static Jugador jugador19= new Jugador("Sebastian Ortega", 28, Estado.suplente);
    private static Jugador jugador20= new Jugador("Alex Delgado", 29, Estado.titular);
    private static Jugador jugador21= new Jugador("Victor Navarro", 30, Estado.libre);
    private static Jugador jugador22= new Jugador("Darian Soto", 31, Estado.titular);
    private static Jugador jugador23= new Jugador("Anthony Ramírez", 32, Estado.titular);
    private static Jugador jugador24= new Jugador("Oscar Barrientos", 33, Estado.titular);
    private static Jugador jugador25= new Jugador("Junior Muñoz", 34, Estado.titular);
    private static Jugador jugador26= new Jugador("John Romero", 35, Estado.titular);
    private static Jugador jugador27 = new Jugador("Aaron López", 36, Estado.titular);
    private static Jugador jugador28= new Jugador("Eddy Sánchez", 37, Estado.titular);
    private static Jugador jugador29= new Jugador("Ángel Molina", 38, Estado.libre);
    private static Jugador jugador30= new Jugador("Martín Saavedra", 39, Estado.libre);
    private static Jugador jugador31= new Jugador("Deiby Soto", 40, Estado.titular);
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

    private static Jugador  jugadores []= new Jugador[70];
    
    

    // || MÉTODOS PARA EL MENÚ ||
    public static void MostrarJugador() {
        Jugador jugador = seleccionJugador();
        if (jugador == null) {
            return;
        }
        if (todosJugadores() == null) {
            JOptionPane.showMessageDialog(null, "El jugador " + jugador.getNombreJugador() + "No está registrado");
        } else {
            JOptionPane.showMessageDialog(null, todosJugadores());
        }

    }
    
    
    
    
    public static void AgregarJugador() {
        
        if (Jugador.cantidadJugador == 70) {
            JOptionPane.showMessageDialog(null, "Este Sistema solo puede gestionar 70 Jugadores.");
            return;
            
        }
        jugadores[0] = getJugador1();
        jugadores[1] = getJugador2();
        jugadores[2] = getJugador3();
        jugadores[3] = getJugador4();
        jugadores[4] = getJugador5();
        jugadores[5] = getJugador6();
        jugadores[6] = getJugador7();
        jugadores[7] = getJugador8();
        jugadores[8] = getJugador9();
        jugadores[9] = getJugador10();
        jugadores[10] = getJugador11();
        jugadores[11] = getJugador12();
        jugadores[12] = getJugador13();
        jugadores[13] = getJugador14();
        jugadores[14] = getJugador15();
        jugadores[15] = getJugador16();
        jugadores[16] = getJugador17();
        jugadores[17] = getJugador18();
        jugadores[18] = getJugador19();
        jugadores[19] = getJugador20();
        jugadores[20] = getJugador21();
        jugadores[21] = getJugador22();
        jugadores[22] = getJugador23();
        jugadores[23] = getJugador24();
        jugadores[24] = getJugador25();
        jugadores[25] = getJugador26();
        jugadores[26] = getJugador27();
        jugadores[27] = getJugador28();
        jugadores[28] = getJugador29();
        jugadores[29] = getJugador30();
        jugadores[30] = getJugador31();
        
        
       
        String nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre del Jugador #" + (Jugador.cantidadJugador + 1) + ": ");

        switch (Jugador.cantidadJugador) {
            case 31:
                jugador32 = new Jugador(nombreJugador, 41, Estado.libre);
                jugadores[31] = getJugador32();

                break;
            case 32:
                jugador33 = new Jugador(nombreJugador, 42, Estado.libre);
                jugadores[32] = getJugador33();
                break;
            case 33:
                jugador34 = new Jugador(nombreJugador, 43, Estado.libre);
                jugadores[33] = getJugador34();
                break;

            case 34:
                jugador35 = new Jugador(nombreJugador, 44, Estado.libre);
                jugadores[34] = getJugador35();
                break;
            case 35:
                jugador36 = new Jugador(nombreJugador, 45, Estado.libre);
                jugadores[35] = getJugador36();
                break;
            case 36:
                jugador37 = new Jugador(nombreJugador, 46, Estado.libre);
                jugadores[36] = getJugador37();
                break;
            case 37:
                jugador38 = new Jugador(nombreJugador, 47, Estado.libre);
                jugadores[37] = getJugador38();
                break;
            case 38:
                jugador39 = new Jugador(nombreJugador, 48, Estado.libre);
                jugadores[38] = getJugador39();
                break;
            case 39:
                jugador40 = new Jugador(nombreJugador, 49, Estado.libre);
                jugadores[39] = getJugador40();
                break;

            case 40:
                jugador41 = new Jugador(nombreJugador, 50, Estado.libre);
                jugadores[40] = getJugador41();
                break;
            case 41:
                jugador42 = new Jugador(nombreJugador, 51, Estado.libre);
                jugadores[41] = getJugador42();
                break;
            case 42:
                jugador43 = new Jugador(nombreJugador, 52, Estado.libre);
                jugadores[42] = getJugador43();
                break;
            case 43:
                jugador44 = new Jugador(nombreJugador, 53, Estado.libre);
                jugadores[43] = getJugador44();
                break;
            case 44:
                jugador45 = new Jugador(nombreJugador, 54, Estado.libre);
                jugadores[44] = getJugador45();
                break;
            case 45:
                jugador46 = new Jugador(nombreJugador, 55, Estado.libre);
                jugadores[45] = getJugador46();
                break;
                
            case 46:
                jugador47 = new Jugador(nombreJugador, 56, Estado.libre);
                jugadores[46] = getJugador47();
                break;
            case 47:
                jugador48 = new Jugador(nombreJugador, 57, Estado.libre);
                jugadores[47] = getJugador48();
                break;
            case 48:
                jugador49 = new Jugador(nombreJugador, 58, Estado.libre);
                jugadores[48] = getJugador49();
                break;
            case 49:
                jugador50 = new Jugador(nombreJugador, 59, Estado.libre);
                jugadores[49] = getJugador50();
                break;
            case 50:
                jugador51 = new Jugador(nombreJugador, 60, Estado.libre);
                jugadores[50] = getJugador51();
                break;
            case 51:
                jugador52 = new Jugador(nombreJugador, 61, Estado.libre);
                jugadores[51] = getJugador52();
                break;

            case 52:
                jugador53 = new Jugador(nombreJugador, 62, Estado.libre);
                jugadores[52] = getJugador53();
                break;
            case 53:
                jugador54 = new Jugador(nombreJugador, 63, Estado.libre);
                jugadores[53] = getJugador54();
                break;  
            case 54:
                jugador55 = new Jugador(nombreJugador, 64, Estado.libre);
                jugadores[54] = getJugador55();
                break;
            case 55:
                jugador56 = new Jugador(nombreJugador, 65, Estado.libre);
                jugadores[55] = getJugador56();
                break;
            case 56:
                jugador57 = new Jugador(nombreJugador, 57, Estado.libre);
                jugadores[56] = getJugador32();
                break;
            case 57:
                jugador58 = new Jugador(nombreJugador, 67, Estado.libre);
                jugadores[57] = getJugador32();
                break;

            case 58:
                jugador59 = new Jugador(nombreJugador, 68, Estado.libre);
                jugadores[58] = getJugador32();
                break;
            case 59:
                jugador60 = new Jugador(nombreJugador, 69, Estado.libre);
                jugadores[59] = getJugador32();
                break;
            case 60:
                jugador61 = new Jugador(nombreJugador, 70, Estado.libre);
                jugadores[60] = getJugador32();
                break;
            case 61:
                jugador62 = new Jugador(nombreJugador, 71, Estado.libre);
                jugadores[61] = getJugador32();
                break;
            case 62:
                jugador63 = new Jugador(nombreJugador, 72, Estado.libre);
                jugadores[62] = getJugador32();
                break;
            case 63:
                jugador64 = new Jugador(nombreJugador, 73, Estado.libre);
                jugadores[63] = getJugador32();
                break;
                
            case 64:
                jugador65 = new Jugador(nombreJugador, 74, Estado.libre);
                jugadores[64] = getJugador32();
                break;
            case 65:
                jugador66 = new Jugador(nombreJugador, 75, Estado.libre);
                jugadores[65] = getJugador32();
                break;
            case 66:
                jugador67 = new Jugador(nombreJugador, 76, Estado.libre);
                jugadores[66] = getJugador32();
                break;
            case 67:
                jugador68 = new Jugador(nombreJugador, 77, Estado.libre);
                jugadores[67] = getJugador32();
                break;
            case 68:
                jugador69 = new Jugador(nombreJugador, 78, Estado.libre);
                jugadores[68] = getJugador32();
                break;
            case 69:
                jugador70 = new Jugador(nombreJugador, 79, Estado.libre);
                jugadores[69] = getJugador32();
                break;
        }
    }
    
//    public static void ArregloJugadores(int indiceAJugadores, Jugador jugador){
//        
//        if (indiceAJugadores >= 0 && indiceAJugadores < jugadores.length) {
//            jugadores[indiceAJugadores] = jugador;
//        } else {
//            System.out.println("Índice fuera de rango");
//        }
//        ArregloJugadores(0, jugador1);
//        
//    }
//    jugadores[1]= jugador2;

    
    
    
//    public static void EditarJugador() {
//        Jugador jugador == cantidadJugador();
//        if (jugador == null) {
//            return;
//        }
//        string nombreJugador = JoptionPane.showInputDialog("Ingrese el nuevo nombre del jugador: ");
//        string IdJugador = joptionPane.showInputDialog("Ingrese el nuevo ID del jugador: ");
//        jugador.setnombreJugador();
//        jugador.setidjugador();
//
//        JOptionPaneptionPane.showMessageDialog(null, "Los datos han sido cambiados exitosamente");
//    }

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
    private static Jugador seleccionJugador() {

        if (Jugador.cantidadJugador == 0) {
            JOptionPane.showMessageDialog(null, "No hay Jugadores en el Sistema.");
            return null;
        }
        JOptionPane.showMessageDialog(null, todosJugadores(), "Mostrar Jugadores", JOptionPane.INFORMATION_MESSAGE);
        todosJugadores();

        return null;
    }

    private static String todosJugadores() {

        return null;

    }
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

    public static Jugador getJugador1() {
        return jugador1;
    }

    public static void setJugador1(Jugador jugador1) {
        GestionJ.jugador1 = jugador1;
    }

    public static Jugador getJugador2() {
        return jugador2;
    }

    public static void setJugador2(Jugador jugador2) {
        GestionJ.jugador2 = jugador2;
    }

    public static Jugador getJugador3() {
        return jugador3;
    }

    public static void setJugador3(Jugador jugador3) {
        GestionJ.jugador3 = jugador3;
    }

    public static Jugador getJugador4() {
        return jugador4;
    }

    public static void setJugador4(Jugador jugador4) {
        GestionJ.jugador4 = jugador4;
    }

    public static Jugador getJugador5() {
        return jugador5;
    }

    public static void setJugador5(Jugador jugador5) {
        GestionJ.jugador5 = jugador5;
    }

    public static Jugador getJugador6() {
        return jugador6;
    }

    public static void setJugador6(Jugador jugador6) {
        GestionJ.jugador6 = jugador6;
    }

    public static Jugador getJugador7() {
        return jugador7;
    }

    public static void setJugador7(Jugador jugador7) {
        GestionJ.jugador7 = jugador7;
    }

    public static Jugador getJugador8() {
        return jugador8;
    }

    public static void setJugador8(Jugador jugador8) {
        GestionJ.jugador8 = jugador8;
    }

    public static Jugador getJugador9() {
        return jugador9;
    }

    public static void setJugador9(Jugador jugador9) {
        GestionJ.jugador9 = jugador9;
    }

    public static Jugador getJugador10() {
        return jugador10;
    }

    public static void setJugador10(Jugador jugador10) {
        GestionJ.jugador10 = jugador10;
    }

    public static Jugador getJugador11() {
        return jugador11;
    }

    public static void setJugador11(Jugador jugador11) {
        GestionJ.jugador11 = jugador11;
    }

    public static Jugador getJugador12() {
        return jugador12;
    }

    public static void setJugador12(Jugador jugador12) {
        GestionJ.jugador12 = jugador12;
    }

    public static Jugador getJugador13() {
        return jugador13;
    }

    public static void setJugador13(Jugador jugador13) {
        GestionJ.jugador13 = jugador13;
    }

    public static Jugador getJugador14() {
        return jugador14;
    }

    public static void setJugador14(Jugador jugador14) {
        GestionJ.jugador14 = jugador14;
    }

    public static Jugador getJugador15() {
        return jugador15;
    }

    public static void setJugador15(Jugador jugador15) {
        GestionJ.jugador15 = jugador15;
    }

    public static Jugador getJugador16() {
        return jugador16;
    }

    public static void setJugador16(Jugador jugador16) {
        GestionJ.jugador16 = jugador16;
    }

    public static Jugador getJugador17() {
        return jugador17;
    }

    public static void setJugador17(Jugador jugador17) {
        GestionJ.jugador17 = jugador17;
    }

    public static Jugador getJugador18() {
        return jugador18;
    }

    public static void setJugador18(Jugador jugador18) {
        GestionJ.jugador18 = jugador18;
    }

    public static Jugador getJugador19() {
        return jugador19;
    }

    public static void setJugador19(Jugador jugador19) {
        GestionJ.jugador19 = jugador19;
    }

    public static Jugador getJugador20() {
        return jugador20;
    }

    public static void setJugador20(Jugador jugador20) {
        GestionJ.jugador20 = jugador20;
    }

    public static Jugador getJugador21() {
        return jugador21;
    }

    public static void setJugador21(Jugador jugador21) {
        GestionJ.jugador21 = jugador21;
    }

    public static Jugador getJugador22() {
        return jugador22;
    }

    public static void setJugador22(Jugador jugador22) {
        GestionJ.jugador22 = jugador22;
    }

    public static Jugador getJugador23() {
        return jugador23;
    }

    public static void setJugador23(Jugador jugador23) {
        GestionJ.jugador23 = jugador23;
    }

    public static Jugador getJugador24() {
        return jugador24;
    }

    public static void setJugador24(Jugador jugador24) {
        GestionJ.jugador24 = jugador24;
    }

    public static Jugador getJugador25() {
        return jugador25;
    }

    public static void setJugador25(Jugador jugador25) {
        GestionJ.jugador25 = jugador25;
    }

    public static Jugador getJugador26() {
        return jugador26;
    }

    public static void setJugador26(Jugador jugador26) {
        GestionJ.jugador26 = jugador26;
    }

    public static Jugador getJugador27() {
        return jugador27;
    }

    public static void setJugador27(Jugador jugador27) {
        GestionJ.jugador27 = jugador27;
    }

    public static Jugador getJugador28() {
        return jugador28;
    }

    public static void setJugador28(Jugador jugador28) {
        GestionJ.jugador28 = jugador28;
    }

    public static Jugador getJugador29() {
        return jugador29;
    }

    public static void setJugador29(Jugador jugador29) {
        GestionJ.jugador29 = jugador29;
    }

    public static Jugador getJugador30() {
        return jugador30;
    }

    public static void setJugador30(Jugador jugador30) {
        GestionJ.jugador30 = jugador30;
    }

    public static Jugador getJugador31() {
        return jugador31;
    }

    public static void setJugador31(Jugador jugador31) {
        GestionJ.jugador31 = jugador31;
    }

    public static Jugador getJugador32() {
        return jugador32;
    }

    public static void setJugador32(Jugador jugador32) {
        GestionJ.jugador32 = jugador32;
    }

    public static Jugador getJugador33() {
        return jugador33;
    }

    public static void setJugador33(Jugador jugador33) {
        GestionJ.jugador33 = jugador33;
    }

    public static Jugador getJugador34() {
        return jugador34;
    }

    public static void setJugador34(Jugador jugador34) {
        GestionJ.jugador34 = jugador34;
    }

    public static Jugador getJugador35() {
        return jugador35;
    }

    public static void setJugador35(Jugador jugador35) {
        GestionJ.jugador35 = jugador35;
    }

    public static Jugador getJugador36() {
        return jugador36;
    }

    public static void setJugador36(Jugador jugador36) {
        GestionJ.jugador36 = jugador36;
    }

    public static Jugador getJugador37() {
        return jugador37;
    }

    public static void setJugador37(Jugador jugador37) {
        GestionJ.jugador37 = jugador37;
    }

    public static Jugador getJugador38() {
        return jugador38;
    }

    public static void setJugador38(Jugador jugador38) {
        GestionJ.jugador38 = jugador38;
    }

    public static Jugador getJugador39() {
        return jugador39;
    }

    public static void setJugador39(Jugador jugador39) {
        GestionJ.jugador39 = jugador39;
    }

    public static Jugador getJugador40() {
        return jugador40;
    }

    public static void setJugador40(Jugador jugador40) {
        GestionJ.jugador40 = jugador40;
    }

    public static Jugador getJugador41() {
        return jugador41;
    }

    public static void setJugador41(Jugador jugador41) {
        GestionJ.jugador41 = jugador41;
    }

    public static Jugador getJugador42() {
        return jugador42;
    }

    public static void setJugador42(Jugador jugador42) {
        GestionJ.jugador42 = jugador42;
    }

    public static Jugador getJugador43() {
        return jugador43;
    }

    public static void setJugador43(Jugador jugador43) {
        GestionJ.jugador43 = jugador43;
    }

    public static Jugador getJugador44() {
        return jugador44;
    }

    public static void setJugador44(Jugador jugador44) {
        GestionJ.jugador44 = jugador44;
    }

    public static Jugador getJugador45() {
        return jugador45;
    }

    public static void setJugador45(Jugador jugador45) {
        GestionJ.jugador45 = jugador45;
    }

    public static Jugador getJugador46() {
        return jugador46;
    }

    public static void setJugador46(Jugador jugador46) {
        GestionJ.jugador46 = jugador46;
    }

    public static Jugador getJugador47() {
        return jugador47;
    }

    public static void setJugador47(Jugador jugador47) {
        GestionJ.jugador47 = jugador47;
    }

    public static Jugador getJugador48() {
        return jugador48;
    }

    public static void setJugador48(Jugador jugador48) {
        GestionJ.jugador48 = jugador48;
    }

    public static Jugador getJugador49() {
        return jugador49;
    }

    public static void setJugador49(Jugador jugador49) {
        GestionJ.jugador49 = jugador49;
    }

    public static Jugador getJugador50() {
        return jugador50;
    }

    public static void setJugador50(Jugador jugador50) {
        GestionJ.jugador50 = jugador50;
    }

    public static Jugador getJugador51() {
        return jugador51;
    }

    public static void setJugador51(Jugador jugador51) {
        GestionJ.jugador51 = jugador51;
    }

    public static Jugador getJugador52() {
        return jugador52;
    }

    public static void setJugador52(Jugador jugador52) {
        GestionJ.jugador52 = jugador52;
    }

    public static Jugador getJugador53() {
        return jugador53;
    }

    public static void setJugador53(Jugador jugador53) {
        GestionJ.jugador53 = jugador53;
    }

    public static Jugador getJugador54() {
        return jugador54;
    }

    public static void setJugador54(Jugador jugador54) {
        GestionJ.jugador54 = jugador54;
    }

    public static Jugador getJugador55() {
        return jugador55;
    }

    public static void setJugador55(Jugador jugador55) {
        GestionJ.jugador55 = jugador55;
    }

    public static Jugador getJugador56() {
        return jugador56;
    }

    public static void setJugador56(Jugador jugador56) {
        GestionJ.jugador56 = jugador56;
    }

    public static Jugador getJugador57() {
        return jugador57;
    }

    public static void setJugador57(Jugador jugador57) {
        GestionJ.jugador57 = jugador57;
    }

    public static Jugador getJugador58() {
        return jugador58;
    }

    public static void setJugador58(Jugador jugador58) {
        GestionJ.jugador58 = jugador58;
    }

    public static Jugador getJugador59() {
        return jugador59;
    }

    public static void setJugador59(Jugador jugador59) {
        GestionJ.jugador59 = jugador59;
    }

    public static Jugador getJugador60() {
        return jugador60;
    }

    public static void setJugador60(Jugador jugador60) {
        GestionJ.jugador60 = jugador60;
    }

    public static Jugador getJugador61() {
        return jugador61;
    }

    public static void setJugador61(Jugador jugador61) {
        GestionJ.jugador61 = jugador61;
    }

    public static Jugador getJugador62() {
        return jugador62;
    }

    public static void setJugador62(Jugador jugador62) {
        GestionJ.jugador62 = jugador62;
    }

    public static Jugador getJugador63() {
        return jugador63;
    }

    public static void setJugador63(Jugador jugador63) {
        GestionJ.jugador63 = jugador63;
    }

    public static Jugador getJugador64() {
        return jugador64;
    }

    public static void setJugador64(Jugador jugador64) {
        GestionJ.jugador64 = jugador64;
    }

    public static Jugador getJugador65() {
        return jugador65;
    }

    public static void setJugador65(Jugador jugador65) {
        GestionJ.jugador65 = jugador65;
    }

    public static Jugador getJugador66() {
        return jugador66;
    }

    public static void setJugador66(Jugador jugador66) {
        GestionJ.jugador66 = jugador66;
    }

    public static Jugador getJugador67() {
        return jugador67;
    }

    public static void setJugador67(Jugador jugador67) {
        GestionJ.jugador67 = jugador67;
    }

    public static Jugador getJugador68() {
        return jugador68;
    }

    public static void setJugador68(Jugador jugador68) {
        GestionJ.jugador68 = jugador68;
    }

    public static Jugador getJugador69() {
        return jugador69;
    }

    public static void setJugador69(Jugador jugador69) {
        GestionJ.jugador69 = jugador69;
    }

    public static Jugador getJugador70() {
        return jugador70;
    }

    public static void setJugador70(Jugador jugador70) {
        GestionJ.jugador70 = jugador70;
    }

    
    
    
    public static Jugador[] getJugadores() {
        return jugadores;
    }

    public static void setJugadores(Jugador[] jugadores) {
        GestionJ.jugadores = jugadores;
    }
    
    
}
