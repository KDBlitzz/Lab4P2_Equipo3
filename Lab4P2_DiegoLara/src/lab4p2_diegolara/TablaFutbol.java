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
public class TablaFutbol extends TablaPosiciones {

    ArrayList<EquipoFutbol> futbol = new ArrayList();

    public ArrayList<EquipoFutbol> getFutbol() {
        return futbol;
    }

    @Override
    public String toString() {
        return "Tabla de Futbol"
                + "\nfutbol = " + futbol;
    }

    @Override
    public void ordenar() {
        for (Equipo e : futbol) {

            if (futbol.get(futbol.indexOf(e)).puntos < futbol.get(futbol.indexOf(e) + 1).puntos) {

                EquipoFutbol actu = futbol.get(futbol.indexOf(e));
                EquipoFutbol sigue = futbol.get(futbol.indexOf(e) + 1);
                futbol.set(futbol.indexOf(e), sigue);
                futbol.set((futbol.indexOf(e) + 1), actu);

            }
            if (futbol.get(futbol.indexOf(e)).puntos == futbol.get(futbol.indexOf(e) + 1).puntos) {
                int df1 = futbol.get(futbol.indexOf(e)).getGolesFavor() - futbol.get(futbol.indexOf(e)).getGolesContra();
                int df2 = futbol.get(futbol.indexOf(e) + 1).getGolesFavor() - futbol.get(futbol.indexOf(e) + 1).getGolesContra();

                if (df1 < df2) {
                    EquipoFutbol actu = futbol.get(futbol.indexOf(e));
                    EquipoFutbol sigue = futbol.get(futbol.indexOf(e) + 1);
                    futbol.set(futbol.indexOf(e), sigue);
                    futbol.set((futbol.indexOf(e) + 1), actu);
                }

            }

        }
    }

}
