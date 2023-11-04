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
public class EquipoBasket extends Equipo {

    private int puntosFavor = 0;
    private int puntosContra = 0;
    private ArrayList<Jugadores> jugadoresB = new ArrayList();

    public EquipoBasket() {
        super();
    }

    public EquipoBasket(String nombre) {
        super(nombre);
    }

    public int getPuntosFavor() {
        return puntosFavor;
    }

    public void setPuntosFavor(int puntosFavor) {
        this.puntosFavor = puntosFavor;
    }

    public int getPuntosContra() {
        return puntosContra;
    }

    public void setPuntosContra(int puntosContra) {
        this.puntosContra = puntosContra;
    }

    public ArrayList<Jugadores> getJugadoresB() {
        return jugadoresB;
    }

    public void setJugadoresB(ArrayList<Jugadores> jugadoresB) {
        if (jugadoresB.size() >= 8 && jugadoresB.size() <= 15) {
            this.jugadoresB = jugadoresB;
        } else {
            System.out.println("(No pedia utilizar try-catch asi que por eso tiro un sout en clase) La lista de jugadores es mayor a 15 o menor a 8");
        }
    }

    @Override
    public String toString() {
        return "Equipo de Basket"
                + "\npuntos a Favor = " + puntosFavor + " \npuntos en Contra = " + puntosContra + " \njugadores = " + jugadoresB;
    }

}
