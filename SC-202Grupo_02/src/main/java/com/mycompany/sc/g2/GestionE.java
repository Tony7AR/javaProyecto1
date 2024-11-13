package com.mycompany.sc.g2;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


 */
public class GestionE {

    // || ATRIBUTOS ||
    private static Equipo equipo1 = new Equipo(100, "Super Campeones");
    private static Equipo equipo2 = new Equipo(101, "Teen Titans");
    private static Equipo equipo3 = new Equipo(102, "Ñaprissa");
    private static Equipo equipo4;
    private static Equipo equipo5;
    private static Equipo equipo6;
    private static Equipo equipo7;
    private static Equipo equipo8;
    private static Equipo equipo9;
    private static Equipo equipo10;
    
    private static Equipo equipos[] = new Equipo[10];
    
    public static void AgregarEquipo() {
        
        if (Equipo.cantidadEquipos == 10) {
            JOptionPane.showMessageDialog(null, "Este Sistema solo puede gestionar 10 Equipos.");
            return;
            
        }
        
        equipos[0] = equipo1;
        equipos[1] = getEquipo2();
        equipos[2] = getEquipo3();
        
        String nombreEquipo = JOptionPane.showInputDialog("Ingrese el nombre del Equipo #" + (Equipo.cantidadEquipos + 1) + ": ");
        
        switch (Equipo.cantidadEquipos) {
            case 3:
                equipo4 = new Equipo(103, nombreEquipo);
                equipos[3] = equipo4;
                break;
            case 4:
                equipo5 = new Equipo(104, nombreEquipo);
                equipos[4] = equipo5;
                break;
            case 5:
                equipo6 = new Equipo(105, nombreEquipo);
                equipos[5] = equipo6;
                break;
            
            case 6:
                equipo7 = new Equipo(106, nombreEquipo);
                equipos[6] = equipo7;
                break;
            case 7:
                equipo8 = new Equipo(107, nombreEquipo);
                equipos[7] = equipo8;
                break;
            case 8:
                equipo9 = new Equipo(108, nombreEquipo);
                equipos[8] = equipo9;
                break;
            case 9:
                equipo10 = new Equipo(109, nombreEquipo);
                equipos[9] = equipo10;
                break;
            
        }
    }
    
    public static Equipo seleccionEquipo() {
        if (Equipo.cantidadEquipos == 0) {
            JOptionPane.showMessageDialog(null,
                    "No se ha agregado ningun Equipo al sistema.");
            return null;
        }
        
        int valorBoton = JOptionPane.showOptionDialog(
                null,
                "¿Seleccione un Equipo",
                "Selecccionar Equipo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                botonesSE(),
                "Equipo 1");
        
        switch (valorBoton) {
            case 0:
                setEquipo1(equipo1);
            case 1:
                setEquipo2(equipo2);
            case 2:
                setEquipo3(equipo3);
            case 3:
                setEquipo4(equipo4);
            case 4:
                setEquipo5(equipo5);
            case 5:
                setEquipo6(equipo6);
            case 6:
                setEquipo7(equipo7);
            case 7:
                setEquipo8(equipo8);
            case 8:
                setEquipo9(equipo9);
            case 9:
                setEquipo10(equipo10);
        }
        
        return null;
    }
    
    private static String[] botonesSE() {
        for (int i = 0; i < getEquipos().length; i++) {
            if (i == 0) {
                String botonesSE[] = {"Equipo #1"};
                return botonesSE;
            }else if (i == 1){
                String botonesSE[] = {"Equipo #1","Equipo #2" };
                return botonesSE;
            }else if (i == 2){
                String botonesSE[] = {"Equipo #1","Equipo #2","Equipo #3" };
                return botonesSE;
            }else if (i == 3){
                String botonesSE[] = {"Equipo #1","Equipo #2","Equipo #3","Equipo #4" };
                return botonesSE;
            }else if (i == 4){
                String botonesSE[] = {"Equipo #1","Equipo #2","Equipo #3","Equipo #4","Equipo #5" };
                return botonesSE;
            }else if (i == 5){
                String botonesSE[] = {"Equipo #1","Equipo #2","Equipo #3","Equipo #4","Equipo #5","Equipo #6" };
                return botonesSE;
            }else if (i == 6){
                String botonesSE[] = {"Equipo #1","Equipo #2","Equipo #3","Equipo #4","Equipo #5","Equipo #6","Equipo #7" };
                return botonesSE;
            }else if (i == 7){
                String botonesSE[] = {"Equipo #1","Equipo #2","Equipo #3","Equipo #4","Equipo #5","Equipo #6","Equipo #7","Equipo #8" };
                return botonesSE;
            }else if (i == 8){
                String botonesSE[] = {"Equipo #1","Equipo #2","Equipo #3","Equipo #4","Equipo #5","Equipo #6","Equipo #7","Equipo #8","Equipo #9" };
                return botonesSE;
            }else if (i == 9){
                String botonesSE[] = {"Equipo #1","Equipo #2","Equipo #3","Equipo #4","Equipo #5","Equipo #6","Equipo #7","Equipo #8","Equipo #9","Equipo #10" };
                return botonesSE;
            }
        }
      
        return null;
    }

    // || CONSTRUCTORES ||
    // || METODOS ||
    // || GETS AND SETS ||

    public static Equipo getEquipo1() {
        return equipo1;
    }

    public static void setEquipo1(Equipo equipo1) {
        GestionE.equipo1 = equipo1;
    }

    public static Equipo getEquipo2() {
        return equipo2;
    }

    public static void setEquipo2(Equipo equipo2) {
        GestionE.equipo2 = equipo2;
    }

    public static Equipo getEquipo3() {
        return equipo3;
    }

    public static void setEquipo3(Equipo equipo3) {
        GestionE.equipo3 = equipo3;
    }

    public static Equipo getEquipo4() {
        return equipo4;
    }

    public static void setEquipo4(Equipo equipo4) {
        GestionE.equipo4 = equipo4;
    }

    public static Equipo getEquipo5() {
        return equipo5;
    }

    public static void setEquipo5(Equipo equipo5) {
        GestionE.equipo5 = equipo5;
    }

    public static Equipo getEquipo6() {
        return equipo6;
    }

    public static void setEquipo6(Equipo equipo6) {
        GestionE.equipo6 = equipo6;
    }

    public static Equipo getEquipo7() {
        return equipo7;
    }

    public static void setEquipo7(Equipo equipo7) {
        GestionE.equipo7 = equipo7;
    }

    public static Equipo getEquipo8() {
        return equipo8;
    }

    public static void setEquipo8(Equipo equipo8) {
        GestionE.equipo8 = equipo8;
    }

    public static Equipo getEquipo9() {
        return equipo9;
    }

    public static void setEquipo9(Equipo equipo9) {
        GestionE.equipo9 = equipo9;
    }

    public static Equipo getEquipo10() {
        return equipo10;
    }

    public static void setEquipo10(Equipo equipo10) {
        GestionE.equipo10 = equipo10;
    }

    public static Equipo[] getEquipos() {
        return equipos;
    }

    public static void setEquipos(Equipo[] equipos) {
        GestionE.equipos = equipos;
    }
    
    
}
