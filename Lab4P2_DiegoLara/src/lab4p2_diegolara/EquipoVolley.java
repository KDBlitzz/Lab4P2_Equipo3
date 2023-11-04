/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_diegolara;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class EquipoVolley extends Equipo {

    private int puntosAnotados = 0;
    private int puntosRecibidos = 0;
    private int setsG = 0;
    private int setsP = 0;
    private ArrayList<Jugadores> jugadoresV = new ArrayList();

    public EquipoVolley() {
        super();
    }

    public EquipoVolley(String nombre) {
        super(nombre);
    }

    public int getPuntosAnotados() {
        return puntosAnotados;
    }

    public void setPuntosAnotados(int puntosAnotados) {
        this.puntosAnotados = puntosAnotados;
    }

    public int getPuntosRecibidos() {
        return puntosRecibidos;
    }

    public void setPuntosRecibidos(int puntosRecibidos) {
        this.puntosRecibidos = puntosRecibidos;
    }

    public int getSetsG() {
        return setsG;
    }

    public void setSetsG(int setsG) {
        this.setsG = setsG;
    }

    public int getSetsP() {
        return setsP;
    }

    public void setSetsP(int setsP) {
        this.setsP = setsP;
    }

    public ArrayList<Jugadores> getJugadoresV() {
        return jugadoresV;
    }

    public void setJugadoresV(ArrayList<Jugadores> jugadoresV) {
        if (jugadoresV.size() >= 10 && jugadoresV.size() <= 18) {
            this.jugadoresV = jugadoresV;
        } else {
            System.out.println("(No pedia utilizar try-catch asi que por eso tiro un sout en clase) La lista de jugadores es mayor a 18 o menor a 10");
        }
    }

    @Override
    public String toString() {
        return "Equipo de Volley"
                + "\npuntosAnotados = " + puntosAnotados + " \npuntos Recibidos = " + puntosRecibidos + " \nsets ganados = " + setsG + " \nsets perdidos = " + setsP + " \njugadores = " + jugadoresV;
    }

}
