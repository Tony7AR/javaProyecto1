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
    private int golesAnotados;
    private int accionesTotales;
    private String nombreJugador;
    private Posicion posicion;
    private Equipo equipoPertenencia;
    private Estado estado;
    public static int consecutivoGoles = 0;
    public static int consecutivoAcciones = 0;
    public static int consecutivoID = 10;
    public static int cantidadJugador = 0;
    
    
    
    
    
    
    
    
    
    
    // || CONSTRUCTORES ||
    
    //String nombre
    public Jugador (String nombreJugador, int idJugador, Estado estado ){
        this.idJugador = consecutivoID;
        this.nombreJugador = nombreJugador;
        this.posicion = asignarPosicion();
        this.equipoPertenencia = equipoPertenencia;
        this.estado = asignarEstado();
        this.golesAnotados = consecutivoGoles;
        this.accionesTotales = consecutivoAcciones;
        consecutivoID++;
        cantidadJugador++;
        
    }
    
    
    
    
    
    
    
    
    
    // || METODOS ||
    public void mostrarDetallesJugador (){
        JOptionPane.showMessageDialog(null, "ID: " + getIdJugador()+
                "\nNombre: " + getNombreJugador()+ "\nPosición: " + getPosicion()+ "\nEquipo: " 
                + getEquipoPertenencia()+ "\nEstado: " + getEstado()+ "\nGoles Anotados: " + getGolesAnotados());
    }
    
    
    
    
    
    public Posicion asignarPosicion (){
        String botonesPosicion[] = {"Delantero", "Mediocampista", "Defensa", "Portero"};
        int botonPosicion = JOptionPane.showOptionDialog(null, "Seleccione una Posición", "Seleccionar Posición", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesPosicion, "Delantero");

        switch (botonPosicion) {
            case 0: //Delantero
                setPosicion(Posicion.delantero);
                break;
            case 1://Mediocampista
                setPosicion(Posicion.medioCampista);
                break;
                
            case 2://Defensa
                setPosicion(Posicion.defensa);
                break;
                
            case 3://Portero
                setPosicion(Posicion.portero);
                break;
                    
        }
        return getPosicion();
    }
    
    public Estado asignarEstado (){
        String botonesEstado[] = {"Titular", "Suplente", "Libre"};
        int botonEstado = JOptionPane.showOptionDialog(null, "Seleccione un Estado para el Jugador.", "Seleccionar Estado", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesEstado, "Libre");

        switch (botonEstado) {
            case 0: //Titular
                setEstado(Estado.titular);
                break;
            case 1://Suplente
                setEstado(Estado.suplente);
                break;
                
            case 2://Libre
                setEstado(Estado.libre);
                break;
                
        }
        return getEstado();
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

    public int getGolesAnotados() {
        return golesAnotados;
    }

    public void setGolesAnotados(int golesAnotados) {
        this.golesAnotados = golesAnotados;
    }

    public int getAccionesTotales() {
        return accionesTotales;
    }

    public void setAccionesTotales(int accionesTotales) {
        this.accionesTotales = accionesTotales;
    }
    
   
    
    
    
}
