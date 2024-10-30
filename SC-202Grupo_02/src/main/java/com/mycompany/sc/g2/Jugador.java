package com.mycompany.sc.g2;

import javax.swing.JOptionPane;

/*
CODIGO DE CLASE: SC-202
GRUPO: 02
INTEGRANTES: OSCAR SOLÍS BARRIENTOS, ANTHONY AZOFEIFA RAMÍREZ, ALESSANDRO BOGANTES CALERO
|| PROYECTO FÚTBOL CINCO ||


*/

public class Jugador {
    // || ATRIBUTOS ||
    private int idJugador;
    private String nombreJugador;
    private Posicion posicion;
    private Equipo equipoPertenencia;
    private Estado estado;
    private static int golesAnotados;
    private static int accionesTotales;
    private static int consecutivo;
    
    
    
    
    
    
    
    
    
    
    // || CONSTRUCTORES ||
    
    //String nombre, String correo, String direccion
    public Jugador (String nombreJugador, Posicion posicion, Equipo equipoPertenencia){
        this.idJugador = consecutivo;
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
        this.equipoPertenencia = equipoPertenencia;
        
    }
    
    
    
    
    
    
    
    
    
    // || METODOS ||
    private void mostrarDetalles (){
        JOptionPane.showMessageDialog(null, "DATOS DEL JUGADOR: " + getIdJugador() +
                "\nNombre: " + getNombreJugador() + "\nPosición: " + getPosicion() + "\nEquipo de Pertenencia: " 
                + getEquipoPertenencia()+ "\nEstado: " + getEstado() + "\nGoles Anotados: " + Jugador.golesAnotados );
    }
    
    public Estado estadoJugador (){
        return null;
    }
    
    
    // || GETS AND SETS ||
    
    public int getIdJugador() {
        return idJugador;
    }

    
    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Equipo getEquipoPertenencia() {
        return equipoPertenencia;
    }

    public void setEquipoPertenencia(Equipo equipoPertenencia) {
        this.equipoPertenencia = equipoPertenencia;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
   
    
    
    
}
