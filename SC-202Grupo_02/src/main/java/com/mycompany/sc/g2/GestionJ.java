package com.mycompany.sc.g2;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


 */
public class GestionJ {
    //Se crea el arreglo estatico y se inicializa

    public static Jugador jugadores[] = new Jugador[70];

    // || MÉTODOS PARA EL SUBMENÚ ||
    //Metodo que va ser llamado por la clase correspondiente para mostrar los jugadores
    //PENDIENTE DE TERMINAR
    public static void MostrarJugador() {
        GestionE.seleccionEquipo();
        

    }

    //Metodo que va ser llamado por la clase correspondiente para agregar jugadores
    //Metodo Temporal
    public static void AgregarJugador() {

        if (Jugador.cantidadJugador < jugadores.length) {
            
            
                String nombreJugador = JOptionPane.showInputDialog("Ingrese el nombre del Jugador #" + (Jugador.cantidadJugador + 1) + ": ");
                
                Equipo equipoPertenencia = null;
                jugadores[Jugador.cantidadJugador] = new Jugador(nombreJugador, Estado.sinEstado, asignarPosicion());
            

        
            
            

        }else{
            JOptionPane.showMessageDialog(null, "Este Sistema solo puede gestionar 70 Jugadores.");
        }
        
        
    }
    
    public static Posicion asignarPosicion(){
        Posicion posicion = null;

                String botonesPosicion[] = {"Delantero", "Mediocampista", "Defensa", "Portero"};
                int botonPosicion = JOptionPane.showOptionDialog(null, "Seleccione una Posición", "Seleccionar Posición", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesPosicion, "Delantero");

                switch (botonPosicion) {
                    case 0: //Delantero
                        posicion = Posicion.delantero;
                        break;
                    case 1://Mediocampista
                        posicion = Posicion.medioCampista;
                        break;

                    case 2://Defensa
                        posicion = Posicion.defensa;
                        break;

                    case 3://Portero
                        posicion = Posicion.portero;
                        break;

                }
        return null;
    }

}



// || ATRIBUTOS ||
// || GETS AND SETS ||

