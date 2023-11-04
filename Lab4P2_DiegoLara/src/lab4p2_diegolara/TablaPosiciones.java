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
public abstract class TablaPosiciones {

    protected ArrayList<Equipo> listaEquipos = new ArrayList();

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    @Override
    public String toString() {
        return "Tabla de Posiciones"
                + "\nlistaEquipos = " + listaEquipos;
    }

    public abstract void ordenar();
}
