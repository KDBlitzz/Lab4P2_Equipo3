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
public class TablaVolley extends TablaPosiciones {

    ArrayList<EquipoVolley> volley = new ArrayList();

    public ArrayList<EquipoVolley> getVolley() {
        return volley;
    }

    @Override
    public String toString() {
        return "Tabla de Volley"
                + "\nVolley = " + volley;
    }

    @Override
    public void ordenar() {
        for (Equipo e : volley) {

            if (volley.get(volley.indexOf(e)).getPartidosJ() == volley.get(volley.indexOf(e) + 1).getPartidosJ()) {
                if (volley.get(volley.indexOf(e)).getPartidosG() < volley.get(volley.indexOf(e) + 1).getPartidosG()) {
                    EquipoVolley actu = volley.get(volley.indexOf(e));
                    EquipoVolley sigue = volley.get(volley.indexOf(e) + 1);
                    volley.set(volley.indexOf(e), sigue);
                    volley.set((volley.indexOf(e) + 1), actu);
                } else if (volley.get(volley.indexOf(e)).getPartidosG() == volley.get(volley.indexOf(e) + 1).getPartidosG()) {
                    if (volley.get(volley.indexOf(e)).getSetsG() < volley.get(volley.indexOf(e) + 1).getSetsG()) {
                        EquipoVolley actu = volley.get(volley.indexOf(e));
                        EquipoVolley sigue = volley.get(volley.indexOf(e) + 1);
                        volley.set(volley.indexOf(e), sigue);
                        volley.set((volley.indexOf(e) + 1), actu);
                    } else if (volley.get(volley.indexOf(e)).getSetsG() == volley.get(volley.indexOf(e) + 1).getSetsG()) {
                        if (volley.get(volley.indexOf(e)).getSetsP() > volley.get(volley.indexOf(e) + 1).getSetsP()) {
                            EquipoVolley actu = volley.get(volley.indexOf(e));
                            EquipoVolley sigue = volley.get(volley.indexOf(e) + 1);
                            volley.set(volley.indexOf(e), sigue);
                            volley.set((volley.indexOf(e) + 1), actu);
                        }
                    }
                }
            }

        }
    }

}
