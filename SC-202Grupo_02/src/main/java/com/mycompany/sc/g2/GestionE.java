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
            JOptionPane.showMessageDialog(null, (i+1)+ "-"+ equipos[i].mostrarDetallesE(true));
            //System.out.println((i+1)+ "-"+ equipos[i].mostrarDetallesE(false));
        }
    }

    public static void AgregarEquipo() {

        if (Equipo.cantidadEquipos < equipos.length) {
            
                
                    String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del Equipo #" + (Equipo.cantidadEquipos + 1) + ": ");
                    equipos[Equipo.cantidadEquipos] = new Equipo(nombreEquipo);
                
            
        }else{
            JOptionPane.showMessageDialog(null, "Este Sistema solo puede gestionar 10 Equipos.");
        }
        
        
        
        
        
    }

    public static Equipo seleccionEquipo() {
        System.out.println("---Lista de Equipos---");
        
        int valor = JOptionPane.showOptionDialog(null, "Seleccione el Equipo"
                , "Seleccione", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesSE()
                , "");
        
        
        return null;
    }

    public static String[] botonesSE() {
        
       
        
        
       int i;
       i = equipos.length;
       
       if (i == 0) {
           String botonesSE[] = {equipos[0].getNombreEquipo()};
           return botonesSE;
       } else if (i == 1) {
           String botonesSE[] = {equipos[0].getNombreEquipo(),equipos[1].getNombreEquipo()};
           return botonesSE;
       } else if (i == 2) {
           String botonesSE[] = {equipos[0].getNombreEquipo(),equipos[1].getNombreEquipo(),equipos[2].getNombreEquipo()};
           return botonesSE;
       } else if (i == 3) {
           String botonesSE[] = {equipos[0].getNombreEquipo(),equipos[1].getNombreEquipo(),equipos[2].getNombreEquipo(),equipos[3].getNombreEquipo()};
           return botonesSE;
       } else if (i == 4) {
           String botonesSE[] = {"Equipo #1", "Equipo #2", "Equipo #3", "Equipo #4", "Equipo #5"};
           return botonesSE;
       } else if (i == 5) {
           String botonesSE[] = {"Equipo #1", "Equipo #2", "Equipo #3", "Equipo #4", "Equipo #5", "Equipo #6"};
           return botonesSE;
       } else if (i == 6) {
           String botonesSE[] = {"Equipo #1", "Equipo #2", "Equipo #3", "Equipo #4", "Equipo #5", "Equipo #6", "Equipo #7"};
           return botonesSE;
       } else if (i == 7) {
           String botonesSE[] = {"Equipo #1", "Equipo #2", "Equipo #3", "Equipo #4", "Equipo #5", "Equipo #6", "Equipo #7", "Equipo #8"};
           return botonesSE;
       } else if (i == 8) {
           String botonesSE[] = {"Equipo #1", "Equipo #2", "Equipo #3", "Equipo #4", "Equipo #5", "Equipo #6", "Equipo #7", "Equipo #8", "Equipo #9"};
           return botonesSE;
       } else if (i == 9) {
           String botonesSE[] = {"Equipo #1", "Equipo #2", "Equipo #3", "Equipo #4", "Equipo #5", "Equipo #6", "Equipo #7", "Equipo #8", "Equipo #9", "Equipo #10"};
           return botonesSE;
       }

        

        return null;
    }

    // || CONSTRUCTORES ||
    // || METODOS ||
    // || GETS AND SETS ||
    

   
   

}
