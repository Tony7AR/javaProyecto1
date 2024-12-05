package com.mycompany.sc.g2;

import static com.mycompany.sc.g2.GestionJ.jugadores;
import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


 */
public class GestionE {

    // || ATRIBUTOS ||
    
    public static Equipo equipos[] = new Equipo[10];

    public static void MostrarEquipo() {
        System.out.println("---Lista de Equipos---");
        
        
        if (equipos[0] == null) {
            JOptionPane.showMessageDialog(null, "¡No hay equipos en el Sistema! ");
            
        }
        for (int i = 0; i < Equipo.cantidadEquipos; i++) {
            System.out.println((i+1)+ "-"+ equipos[i].mostrarDetallesE(false));
            JOptionPane.showMessageDialog(null, (i+1)+ "-"+ equipos[i].mostrarDetallesE(true));
            
        }
    }

    public static void AgregarEquipo() {

        if (Equipo.cantidadEquipos < equipos.length) {
            
                
                    String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del Equipo #" + (Equipo.cantidadEquipos + 1) + ": ");
                    equipos[Equipo.cantidadEquipos] = new Equipo(nombreEquipo);
                    JOptionPane.showMessageDialog(null, "¡Equipo agregado con éxito!");
                
            
        }else{
            JOptionPane.showMessageDialog(null, "Este Sistema solo puede gestionar 10 Equipos.");
        }
        
        
        
        
        
    }

    public static Equipo seleccionEquipo() {
        if (Equipo.cantidadEquipos == 0) {
            JOptionPane.showMessageDialog(null, "No hay equipos registrados\nPor favor vuelva al menu principal y agregue equipos");
            return null;
            
        }
        String[] opciones = new String[Equipo.cantidadEquipos];
        for (int i = 0; i < Equipo.cantidadEquipos; i++) {
            opciones[i] = equipos[i].getNombreEquipo();
        }

        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione un equipo", "Seleccionar Equipo",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == -1) {
            return null;  // Si se cancela
        }
        return equipos[seleccion];  // Retorna el equipo seleccionado
    
    }
   
//    public static Equipo meterJugadores(){
//        
//    }
   

    // || CONSTRUCTORES ||
    // || METODOS ||
    // || GETS AND SETS ||
    

   
   

}
