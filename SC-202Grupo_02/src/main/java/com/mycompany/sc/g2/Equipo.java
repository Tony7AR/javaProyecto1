package com.mycompany.sc.g2;

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
    private Jugador jugadores;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosEmpatados;
    private int partidosPerdidos;
    public  int golesFavor;
    public int golesContra;
    public int posesionBalon;
    public static int consecutivoIdEquipo = 100;


    
    
    
    
    
    
    
    
    // || CONSTRUCTORES ||
    
    public Equipo (int idEquipo, String nombreEquipo){
        this.idEquipo = consecutivoIdEquipo;
        this.nombreEquipo = nombreEquipo;
        this.jugadores = getJugadores();
        this.partidosJugados = getPartidosJugados();
        this.partidosGanados = getPartidosGanados();
        this.partidosPerdidos = getPartidosPerdidos();
        this.partidosEmpatados = getPartidosEmpatados();
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.posesionBalon = posesionBalon;
        consecutivoIdEquipo++;
    }
    
    
    
    
    
    
    
    
    
    // || METODOS ||
    
    private void mostrarDetallesEquipo (){
        JOptionPane.showMessageDialog(null, "DATOS DEL EQUIPO: " + getIdEquipo()+
                "\nNombre de Equipo: " + getNombreEquipo()+ "\nJugadores: " + getJugadores()+ "\nPartidos Jugados: " 
                + getPartidosJugados()+ "\nPartidos Ganados: " + getPartidosGanados()+ "\nPartidos Perdidos: " + getPartidosPerdidos()+"\nPartidos Empatados: "
                + getPartidosEmpatados()+"\nGoles a Favor: "+ golesFavor + "\nGoles en Contra: "+ golesContra +"\nPosesión del Balón " +posesionBalon );
    }
    
    public Jugador asignarJugadorEquipo(){
        
        return getJugadores();
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

    public Jugador getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador jugadores) {
        this.jugadores = jugadores;
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
