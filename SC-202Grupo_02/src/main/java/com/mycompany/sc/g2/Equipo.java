package com.mycompany.sc.g2;

import java.util.Random;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


*/

public class Equipo {
    // || ATRIBUTOS ||
    private int idEquipo;
    private String nombreEquipo;
    GestionJ jugadores[]; //cambiar por listado
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    public  int golesFavor;
    public int golesContra;
    public int posesionBalon;
    public static int consecutivoIdEquipo = 100;
    public static int cantidadEquipos = 0;
    Random random = new Random();

    
    
    
    
    
    
    
    
    // || CONSTRUCTORES ||
    
    public Equipo (String nombreEquipo){
        this.idEquipo = consecutivoIdEquipo;
        this.nombreEquipo = nombreEquipo;
        this.jugadores = jugadores;
        this.partidosJugados = getPartidosJugados();
        this.partidosGanados = getPartidosGanados();
        this.partidosPerdidos = getPartidosPerdidos();
        this.partidosEmpatados = getPartidosEmpatados();
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.posesionBalon = posesionBalon;
        consecutivoIdEquipo++;
        cantidadEquipos++;
    }
    
    
    
    
    
    
    
    
    
    // || METODOS ||
     
    
    
    
    public String mostrarDetallesE (boolean conSaltoLinea){
        if (conSaltoLinea) {
            return "DATOS DEL Equipo #"+getIdEquipo()+
                    "\nNombre: "+getNombreEquipo()+
                    "\nJugadores: "+jugadores+
                    "\nPartidos Jugados: "+getPartidosJugados()+
                    "\nPartidos Ganados: "+ getPartidosGanados()+
                    "\nPartidos Perdidos "+ getPartidosPerdidos()+
                    "\nPartidos Empatados: " + getPartidosEmpatados()+
                    "\nGoles a Favor: "+ golesFavor+
                    "\nGoles en Contra: "+ golesContra+
                    "\nPosesión del Balón: "+ posesionBalon;
            
            
            
        }
        return "Equipo #: "+getIdEquipo()+ ", Nombre: "+getNombreEquipo()+ ", Jugadores: "+null+
                "Partidos Jugados: "+getPartidosJugados()+ "Partidos Ganados: "+ getPartidosGanados()+"Partidos Perdidos "+ getPartidosPerdidos()+
                "Partidos Empatados: " + getPartidosEmpatados()+"Goles a Favor: "+ golesFavor+"Goles en Contra: "+ golesContra+"Posesión del Balón: "+ posesionBalon;
    }
    
    
    
    
    
    
    
    // || GETS AND SETS ||

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

 
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPartidosGanados() {
        return partidosGanados;
    }

    public void setPartidosGanados(int partidosGanados) {
        this.partidosGanados = partidosGanados;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

   
    
    
    
    
}
