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
public class EquipoFutbol extends Equipo {

    private int partidosEmpatados = 0;
    private int golesFavor = 0, golesContra = 0;
    private ArrayList<Jugadores> jugadoresF = new ArrayList();

    public EquipoFutbol() {
        super();
    }

    public EquipoFutbol(String nombre) {
        super(nombre);
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public ArrayList<Jugadores> getJugadoresF() {
        return jugadoresF;
    }

    public void setJugadoresF(ArrayList<Jugadores> jugadoresF) {
        if (jugadoresF.size() >= 15 && jugadoresF.size() <= 22) {
            this.jugadoresF = jugadoresF;
        } else {
            System.out.println("(No pedia utilizar try-catch asi que por eso tiro un sout en clase) La lista de jugadores es mayor a 22 o menor a 15");
        }
    }

    @Override
    public String toString() {
        return "Equipo de Futbol"
                + "\npartidosEmpatados = " + partidosEmpatados + "\n goles a Favor = " + golesFavor + " \ngoles en Contra = " + golesContra + "\n jugadores = " + jugadoresF;
    }

}
