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

   
    
    //Se crea el arreglo estatico y se inicializa
    public static Jugador jugadores[]= new Jugador[70];
    
    
    
    
    

    // || MÉTODOS PARA EL SUBMENÚ ||

    
    
    //Metodo que va ser llamado por la clase correspondiente para mostrar los jugadores
    //PENDIENTE DE TERMINAR
    public static void MostrarJugador() {
        Equipo escogerEquipos = GestionE.seleccionEquipo();
        if (escogerEquipos == null) {
            return;
        }
        
        

    }
    
    //Metodo que va ser llamado por la clase correspondiente para agregar jugadores
    //Metodo Temporal
    public static void AgregarJugador() {
        
        
        
        if (Jugador.cantidadJugador < jugadores.length ) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del jugador: ");
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante: "));
            String curso = JOptionPane.showInputDialog("Ingrese el curso del estudiante: ");
            
            jugadores[Jugador.cantidadJugador] = new Jugador(nombre, equipoPertenencia, Estado.sinEstado, Posicion.sinPosicion);
            JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente.");
            
        }else{
            JOptionPane.showMessageDialog(null, "No se puede agregar más de "+estudiantes.length +" estudiantes");
        }
        
        

        
    }
    
    //Metodo que va ser llamado por la clase correspondiente para Editar los jugadores
    //PENDIENTE DE TERMINAR
    
    /*
    public static void EditarJugador() { //Metodo para editar jugadores 
        Jugador jugador == cantidadJugador();
        if (jugador == null) {
            return;
        }
        String nombreJugador = JOptionPane.showInputDialog("Ingrese el nuevo nombre del jugador: ");
        String IdJugador = JOptionPane.showInputDialog("Ingrese el nuevo ID del jugador: ");
        jugador.setnombreJugador();
        jugador.setidjugador();

        JOptionPaneptionPane.showMessageDialog(null, "Los datos han sido cambiados exitosamente");
  }
*/
    //Metodo que va ser llamado por la clase correspondiente para Eliminar Jugadores
    //PENDIENTE DE TERMINAR
    public static void EliminarJugador() {

    }

//Metodo que va ser llamado por la clase correspondiente para seleccionar jugadores
    //PENDIENTE DE TERMINAR
    
    /*
    private static Jugador seleccionJugador() { // Metodo para seleccionar jugadores 

        if (Jugador.cantidadJugador == 0) {
            JOptionPane.showMessageDialog(null, "No hay Jugadores en el Sistema.");
            return null;
        }
        JOptionPane.showMessageDialog(null, todosJugadores(), "Mostrar Jugadores", JOptionPane.INFORMATION_MESSAGE);
        todosJugadores();

        return null;
    }
    */
    
    
    
    // || GETS AND SETS ||

    
    
    
    
    
}
