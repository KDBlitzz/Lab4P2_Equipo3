/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_diegolara;

/**
 *
 * @author diego
 */
public class Equipo {

    protected String nombre;
    protected int puntos = 0;
    protected int partidosJ = 0;
    protected int partidosG = 0;
    protected int partidosP = 0;

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosJ() {
        return partidosJ;
    }

    public void setPartidosJ(int partidosJ) {
        this.partidosJ = partidosJ;
    }

    public int getPartidosG() {
        return partidosG;
    }

    public void setPartidosG(int partidosG) {
        this.partidosG = partidosG;
    }

    public int getPartidosP() {
        return partidosP;
    }

    public void setPartidosP(int partidosP) {
        this.partidosP = partidosP;
    }

    @Override
    public String toString() {
        return "\nnombre = " + nombre + " \npuntos = " + puntos + " \npartidos jugados = " + partidosJ + " \npartidos Ganados = " + partidosG + " \npartidos Perdidos = " + partidosP;
    }

}
