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
public class TablaBasket extends TablaPosiciones {

    ArrayList<EquipoBasket> basket = new ArrayList();

    public ArrayList<EquipoBasket> getBasket() {
        return basket;
    }

    @Override
    public String toString() {
        return "Tabla de Basket"
                + "\nbasket = " + basket;
    }

    @Override
    public void ordenar() {
        for (Equipo e : basket) {

            if (basket.get(basket.indexOf(e)).partidosJ == basket.get(basket.indexOf(e) + 1).partidosJ) {
                if (basket.get(basket.indexOf(e)).partidosG < basket.get(basket.indexOf(e) + 1).partidosG) {
                    EquipoBasket actu = basket.get(basket.indexOf(e));
                    EquipoBasket sigue = basket.get(basket.indexOf(e) + 1);
                    basket.set(basket.indexOf(e), sigue);
                    basket.set((basket.indexOf(e) + 1), actu);
                } else if (basket.get(basket.indexOf(e)).partidosG == basket.get(basket.indexOf(e) + 1).partidosG) {
                    if (basket.get(basket.indexOf(e)).getPuntosContra() < basket.get(basket.indexOf(e) + 1).getPuntosContra()) {
                        EquipoBasket actu = basket.get(basket.indexOf(e));
                        EquipoBasket sigue = basket.get(basket.indexOf(e) + 1);
                        basket.set(basket.indexOf(e), sigue);
                        basket.set((basket.indexOf(e) + 1), actu);
                    }
                }
            }
            if (basket.get(basket.indexOf(e)).partidosJ != basket.get(basket.indexOf(e) + 1).partidosJ) {
                int df1 = (basket.get(basket.indexOf(e)).getPartidosG()) / basket.get(basket.indexOf(e)).getPartidosJ();
                int df2 = (basket.get(basket.indexOf(e) + 1).getPartidosG()) / basket.get(basket.indexOf(e)).getPartidosJ();

                if (df1 < df2) {
                    EquipoBasket actu = basket.get(basket.indexOf(e));
                    EquipoBasket sigue = basket.get(basket.indexOf(e) + 1);
                    basket.set(basket.indexOf(e), sigue);
                    basket.set((basket.indexOf(e) + 1), actu);
                }

            }

        }
    }

}
