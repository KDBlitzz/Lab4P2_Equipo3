package lab4p2_diegolara;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4P2_DiegoLara {

    static ArrayList<Jugadores> jugadores = new ArrayList();
    static Scanner cinq = new Scanner(System.in);
    static Scanner cordes = new Scanner(System.in);
    static TablaFutbol tablaF = new TablaFutbol();
    static TablaVolley tablaV = new TablaVolley();
    static TablaBasket tablaB = new TablaBasket();

    public static void main(String[] args) {
        boolean menu = true;
        while (menu) {
            System.out.println("1. Equipo");
            System.out.println("2. Transferencia de Jugador");
            System.out.println("3. Registrar Partido");
            System.out.println("4. Salir");
            int option = cinq.nextInt();

            switch (option) {
                case 1 -> {
                    boolean menuE = true;
                    while (menuE) {
                        System.out.println("1. Registrar Equipo");
                        System.out.println("2. Listar Equipo");
                        System.out.println("3. Modificar Equipo");
                        System.out.println("4. Eliminar Equipo");
                        System.out.println("5. Salir");
                        int opE = cinq.nextInt();
                        switch (opE) {
                            case 1 -> {
                                System.out.println("""
                                                   1. Futbol
                                                   2. Basquet
                                                   3. Voleibol
                                                   Ingrese un deporte:""");
                                int opcion = cinq.nextInt();

                                switch (opcion) {

                                    case 1 -> {
                                        AgregarFutbol();
                                    }
                                    case 2 -> {
                                        AgregarBasket();
                                    }
                                    case 3 -> {
                                        AgregarVolley();
                                    }

                                }

                            }
                            case 2 -> {
                                if (tablaF.getListaEquipos().isEmpty() && tablaV.getListaEquipos().isEmpty() && tablaB.getListaEquipos().isEmpty()) {
                                    System.out.println("No hay equipos");
                                } else {
                                    ListarEquipos();
                                }
                            }
                            case 3 -> {
                                boolean modMenu = true;
                                while (modMenu) {
                                    System.out.println("¿Que equipos desea ver?\n"
                                            + "1. Futbol\n"
                                            + "2. Volley\n"
                                            + "3. Basket\n"
                                            + "4. Salir");
                                    int modOp = cinq.nextInt();
                                    switch (modOp) {
                                        case 1 -> {
                                            ListarFut();
                                            System.out.println("Ingrese el equipo que desea modificar: ");
                                            int modF = cinq.nextInt() - 1;
                                            ValidarInt(modF);
                                            ModificarFut(modF);
                                            System.out.println("Se modifico exitosamente");
                                        }
                                        case 2 -> {
                                            ListarVolley();
                                            System.out.println("Ingrese el equipo que desea modificar: ");
                                            int modV = cinq.nextInt() - 1;
                                            ValidarInt(modV);
                                            ModificarVolley(modV);
                                            System.out.println("Se modifico exitosamente");
                                        }
                                        case 3 -> {
                                            ListarBasket();
                                            System.out.println("Ingrese el equipo que desea modificar: ");
                                            int modB = cinq.nextInt() - 1;
                                            ValidarInt(modB);
                                            ModificarBasket(modB);
                                            System.out.println("Se modifico exitosamente");
                                        }
                                        case 4 -> {
                                            modMenu = false;
                                        }
                                        default -> {
                                            System.out.println("Opcion Invalida");
                                        }
                                    }
                                }
                            }
                            case 4 -> {
                                if (tablaF.getListaEquipos().isEmpty() && tablaV.getListaEquipos().isEmpty() && tablaB.getListaEquipos().isEmpty()) {
                                    System.out.println("No hay equipos");
                                } else {
                                    boolean elimM = true;
                                    while (elimM) {
                                        System.out.println("¿Que equipos desea ver?\n"
                                                + "1. Futbol\n"
                                                + "2. Volley\n"
                                                + "3. Basket\n"
                                                + "4. Salir");
                                        int elimOp = cinq.nextInt();
                                        switch (elimOp) {
                                            case 1 -> {
                                                ListarFut();
                                                System.out.println("Ingrese el numero del equipo que desea eliminar: ");
                                                int elimF = cinq.nextInt() - 1;
                                                ValidarInt(elimF);
                                                tablaF.getFutbol().remove(elimF);
                                                System.out.println("Se removio exitosamente");
                                            }
                                            case 2 -> {
                                                ListarVolley();
                                                System.out.println("Ingrese el numero del equipo que desea eliminar: ");
                                                int elimV = cinq.nextInt() - 1;
                                                ValidarInt(elimV);
                                                tablaV.getVolley().remove(elimV);
                                                System.out.println("Se removio exitosamente");
                                            }
                                            case 3 -> {
                                                ListarBasket();
                                                System.out.println("Ingrese el numero del equipo que desea eliminar: ");
                                                int elimB = cinq.nextInt() - 1;
                                                ValidarInt(elimB);
                                                tablaB.getBasket().remove(elimB);
                                                System.out.println("Se removio exitosamente");
                                            }
                                            case 4 -> {
                                                elimM = false;
                                            }
                                            default -> {
                                                System.out.println("Opcion Invalida");
                                            }
                                        }
                                    }
                                }
                            }
                            case 5 -> {
                                menuE = false;
                            }
                            default -> {
                                System.out.println("Opcion Invalida");
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("=== JUGADORES ===");
                    System.out.println("""
                                       1. Agregar Jugadores
                                       2. Listar Jugadores
                                       3. Eliminar Jugadores
                                       4. Transferencia
                                       Ingrese una opcion:""");
                    int opc = cinq.nextInt();
                    switch (opc) {

                        case 1:

                            System.out.println("== AGREAGAR JUGADOR ==");
                            System.out.println("Ingrese el nombre:");
                            String nombre = cordes.next();
                            System.out.println("Ingrese la edad:");
                            int edad = cinq.nextInt();
                            ValidarInt(edad);
                            System.out.println("Ingrese el sueldo:");
                            double sueldo = cinq.nextDouble();
                            ValidarDouble(sueldo);
                            System.out.println("Ingrese el equipo [ Futbol/ Basquetbol / Voleibol ]:");
                            Equipo equipo = new Equipo(cordes.next());
                            System.out.println("Ingrese la duracion del contrato:");
                            int deal = cinq.nextInt();
                            ValidarInt(deal);
                            jugadores.add(new Jugadores(nombre, edad, sueldo, equipo, deal));
                            System.out.println("Jugador Agregado");

                            break;

                        case 2:
                            printJugadores();
                            break;

                        case 3:
                            System.out.println("== ELIMINAR JUGADOR ==");
                            printJugadores();
                            System.out.println("Ingrese el jugador que desea eliminar:");
                            int index = cinq.nextInt() - 1;
                            ValidarInt(index);
                            jugadores.remove(index);
                            System.out.println("Jugador Eliminado");

                            break;

                        case 4:

                            System.out.println("== TRANSFERENCIA DE JUGADORES ==");
                            printJugadores();
                            System.out.println("Ingrese el jugador:");
                            int jugador = cinq.nextInt() - 1;
                            ValidarInt(jugador);
                            transferencia(jugador);
                            System.out.println("Ingrese el nuevo sueldo del jugador: ");
                            double sueldoN = cinq.nextDouble();
                            ValidarDouble(sueldoN);
                            jugadores.get(jugador).setSueldo(sueldoN);
                            System.out.println("Ingrese el nuevo tiempo de contrato del jugador: ");
                            int duracionN = cinq.nextInt();
                            ValidarInt(duracionN);
                            jugadores.get(jugador).setDuracionC(duracionN);
                            break;

                        default:
                            System.out.println("Opcion Invalida");
                    }
                }
                case 3 -> {
                    if (tablaF.getListaEquipos().isEmpty() && tablaV.getListaEquipos().isEmpty() && tablaB.getListaEquipos().isEmpty()) {
                        System.out.println("No hay equipos");
                    } else {
                        Registrar();
                    }
                }
                case 4 -> {
                    menu = false;
                }
                default -> {
                    System.out.println("Opcion Invalida");
                }
            }
        }
    }

    public static void Registrar() {
        boolean menuR = true;
        while (menuR) {
            System.out.println("¿Que partido desea que este registrado?"
                    + "\n1. Futbol"
                    + "\n2. Volley"
                    + "\n3. Basket"
                    + "\n4. Salir");
            int opR = cinq.nextInt();
            switch (opR) {
                case 1 -> {
                    if (tablaF.getFutbol().size() == 1) {
                        System.out.println("Solo hay un equipo, no puede hacer el registro");
                    } else {
                        ListarFut();
                        System.out.println("Elija el equipo 1: ");
                        int p1 = cinq.nextInt() - 1;
                        ValidarInt(p1);
                        System.out.println("Elija el equipo 2: ");
                        int p2 = cinq.nextInt() - 1;
                        ValidarInt(p2);
                        while (tablaF.getFutbol().get(p1) == tablaF.getFutbol().get(p2)) {
                            System.out.println("No puede hacer el registro con el mismo equipo: ");
                            p1 = cinq.nextInt() - 1;
                        }
                        System.out.println("Ingrese el resultado del equipo 1(victoria/derrota/empate): ");
                        String resultado = cordes.next();
                        while (!resultado.equalsIgnoreCase("victoria") && !resultado.equalsIgnoreCase("derrota") && !resultado.equalsIgnoreCase("empate")) {
                            System.out.println("Ingrese una de las 3 opciones (victoria/derrota/empate): ");
                            resultado = cordes.next();
                        }
                        System.out.println("Ingrese el resultado del equipo 2(victoria/derrota/empate): ");
                        String resultado2 = cordes.next();
                        while (!resultado2.equalsIgnoreCase("victoria") && !resultado2.equalsIgnoreCase("derrota") && !resultado2.equalsIgnoreCase("empate")) {
                            System.out.println("Ingrese una de las 3 opciones (victoria/derrota/empate): ");
                            resultado2 = cordes.next();
                        }
                        if (resultado.equalsIgnoreCase("victoria") && resultado2.equalsIgnoreCase("derrota")) {
                            tablaF.getFutbol().get(p1).setPartidosJ(tablaF.getFutbol().get(p1).getPartidosJ() + 1);
                            tablaF.getFutbol().get(p2).setPartidosJ(tablaF.getFutbol().get(p2).getPartidosJ() + 1);
                            tablaF.getFutbol().get(p1).setPartidosG(tablaF.getFutbol().get(p1).getPartidosG() + 1);
                            tablaF.getFutbol().get(p2).setPartidosP(tablaF.getFutbol().get(p2).getPartidosP() + 1);
                            tablaF.getFutbol().get(p1).setPuntos(tablaF.getFutbol().get(p1).getPuntos() + 3);
                        } else if (resultado.equalsIgnoreCase("derrota") && resultado2.equalsIgnoreCase("victoria")) {
                            tablaF.getFutbol().get(p1).setPartidosJ(tablaF.getFutbol().get(p1).getPartidosJ() + 1);
                            tablaF.getFutbol().get(p2).setPartidosJ(tablaF.getFutbol().get(p2).getPartidosJ() + 1);
                            tablaF.getFutbol().get(p2).setPartidosG(tablaF.getFutbol().get(p2).getPartidosG() + 1);
                            tablaF.getFutbol().get(p1).setPartidosP(tablaF.getFutbol().get(p1).getPartidosP() + 1);
                            tablaF.getFutbol().get(p2).setPuntos(tablaF.getFutbol().get(p2).getPuntos() + 3);
                        } else if ((resultado.equalsIgnoreCase("empate") && resultado2.equalsIgnoreCase("empate"))) {
                            tablaF.getFutbol().get(p1).setPartidosJ(tablaF.getFutbol().get(p1).getPartidosJ() + 1);
                            tablaF.getFutbol().get(p2).setPartidosJ(tablaF.getFutbol().get(p2).getPartidosJ() + 1);
                            tablaF.getFutbol().get(p1).setPartidosEmpatados(tablaF.getFutbol().get(p1).getPartidosEmpatados() + 1);
                            tablaF.getFutbol().get(p2).setPartidosEmpatados(tablaF.getFutbol().get(p2).getPartidosEmpatados() + 1);
                            tablaF.getFutbol().get(p1).setPuntos(tablaF.getFutbol().get(p1).getPuntos() + 1);
                            tablaF.getFutbol().get(p2).setPuntos(tablaF.getFutbol().get(p2).getPuntos() + 1);
                        } else {
                            System.out.println("No puede poner que un equipo empate y otro pierda y/o gane");
                            break;
                        }

                        System.out.println("Ingrese los goles a favor del equipo 1: ");
                        int golp1 = cinq.nextInt();
                        ValidarInt(golp1);
                        tablaF.getFutbol().get(p1).setGolesFavor(tablaF.getFutbol().get(p1).getGolesFavor() + golp1);
                        System.out.println("Ingrese los goles encontra del equipo 1: ");
                        int contrap1 = cinq.nextInt();
                        ValidarInt(contrap1);
                        tablaF.getFutbol().get(p1).setGolesContra(tablaF.getFutbol().get(p1).getGolesContra() + contrap1);

                        System.out.println("Ingrese los goles a favor del equipo 2: ");
                        int golp2 = cinq.nextInt();
                        ValidarInt(golp2);
                        tablaF.getFutbol().get(p2).setGolesFavor(tablaF.getFutbol().get(p2).getGolesFavor() + golp2);
                        System.out.println("Ingrese los goles encontra del equipo 2: ");
                        int contrap2 = cinq.nextInt();
                        ValidarInt(contrap2);
                        tablaF.getFutbol().get(p2).setGolesContra(tablaF.getFutbol().get(p2).getGolesContra() + contrap2);
                    }
                }
                case 2 -> {
                    if (tablaV.getVolley().size() == 1) {
                        System.out.println("No puede hacer el registro porque solo hay 1 equipo");
                    } else {
                        ListarVolley();
                        System.out.println("Elija el equipo 1: ");
                        int p1 = cinq.nextInt() - 1;
                        ValidarInt(p1);
                        System.out.println("Elija el equipo 2: ");
                        int p2 = cinq.nextInt() - 1;
                        ValidarInt(p2);
                        System.out.println("Ingrese el resultado del equipo 1(victoria/derrota): ");
                        String resultado = cordes.next();
                        while (!resultado.equalsIgnoreCase("victoria") && !resultado.equalsIgnoreCase("derrota")) {
                            System.out.println("Ingrese una de las 3 opciones (victoria/derrota): ");
                            resultado = cordes.next();
                        }
                        System.out.println("Ingrese el resultado del equipo 2(victoria/derrota): ");
                        String resultado2 = cordes.next();
                        while (!resultado2.equalsIgnoreCase("victoria") && !resultado2.equalsIgnoreCase("derrota")) {
                            System.out.println("Ingrese una de las 3 opciones (victoria/derrota): ");
                            resultado2 = cordes.next();
                        }
                        if (resultado.equalsIgnoreCase("victoria") && resultado2.equalsIgnoreCase("derrota")) {
                            tablaV.getVolley().get(p1).setPartidosJ(tablaV.getVolley().get(p1).getPartidosJ() + 1);
                            tablaV.getVolley().get(p2).setPartidosJ(tablaV.getVolley().get(p2).getPartidosJ() + 1);
                            tablaV.getVolley().get(p1).setPartidosG(tablaV.getVolley().get(p1).getPartidosG() + 1);
                            tablaV.getVolley().get(p2).setPartidosP(tablaV.getVolley().get(p2).getPartidosP() + 1);
                            tablaV.getVolley().get(p1).setSetsG(tablaV.getVolley().get(p1).getSetsG() + 1);
                            tablaV.getVolley().get(p2).setSetsP(tablaV.getVolley().get(p2).getSetsP() + 1);

                        } else if (resultado.equalsIgnoreCase("derrota") && resultado2.equalsIgnoreCase("victoria")) {
                            tablaV.getVolley().get(p1).setPartidosJ(tablaV.getVolley().get(p1).getPartidosJ() + 1);
                            tablaV.getVolley().get(p2).setPartidosJ(tablaV.getVolley().get(p2).getPartidosJ() + 1);
                            tablaV.getVolley().get(p2).setPartidosG(tablaV.getVolley().get(p2).getPartidosG() + 1);
                            tablaV.getVolley().get(p1).setPartidosP(tablaV.getVolley().get(p1).getPartidosP() + 1);
                            tablaV.getVolley().get(p2).setSetsG(tablaV.getVolley().get(p2).getSetsG() + 1);
                            tablaV.getVolley().get(p1).setSetsP(tablaV.getVolley().get(p1).getSetsP() + 1);

                        } else {
                            System.out.println("No puede poner que un equipo empate y otro pierda y/o gane");
                            break;
                        }
                        System.out.println("Ingrese los puntos anotados del equipo 1: ");
                        int puntosp1 = cinq.nextInt();
                        ValidarInt(puntosp1);
                        tablaV.getVolley().get(p1).setPuntosAnotados(tablaV.getVolley().get(p1).getPuntosAnotados() + puntosp1);
                        System.out.println("Ingrese los puntos recibidos del equipo 1: ");
                        int recibidop1 = cinq.nextInt();
                        ValidarInt(recibidop1);
                        tablaV.getVolley().get(p1).setPuntosRecibidos(tablaV.getVolley().get(p1).getPuntosRecibidos() + recibidop1);

                        System.out.println("Ingrese los puntos anotados del equipo 2: ");
                        int puntosp2 = cinq.nextInt();
                        ValidarInt(puntosp2);
                        tablaV.getVolley().get(p2).setPuntosAnotados(tablaV.getVolley().get(p2).getPuntosAnotados() + puntosp2);
                        System.out.println("Ingrese los puntos recibidos del equipo 2: ");
                        int recibidop2 = cinq.nextInt();
                        ValidarInt(recibidop2);
                        tablaV.getVolley().get(p2).setPuntosRecibidos(tablaV.getVolley().get(p2).getPuntosRecibidos() + recibidop2);
                    }
                }
                case 3 -> {
                    if (tablaB.getBasket().size() == 1) {
                        System.out.println("Solo hay 1 equipo, no puede hacer el registro");
                    } else {
                        ListarBasket();
                        System.out.println("Elija el equipo 1: ");
                        int p1 = cinq.nextInt() - 1;
                        ValidarInt(p1);
                        System.out.println("Elija el equipo 2: ");
                        int p2 = cinq.nextInt() - 1;
                        ValidarInt(p2);
                        System.out.println("Ingrese el resultado del equipo 1(victoria/derrota): ");
                        String resultado = cordes.next();
                        while (!resultado.equalsIgnoreCase("victoria") && !resultado.equalsIgnoreCase("derrota")) {
                            System.out.println("Ingrese una de las 3 opciones (victoria/derrota): ");
                            resultado = cordes.next();
                        }
                        System.out.println("Ingrese el resultado del equipo 2(victoria/derrota): ");
                        String resultado2 = cordes.next();
                        while (!resultado2.equalsIgnoreCase("victoria") && !resultado2.equalsIgnoreCase("derrota")) {
                            System.out.println("Ingrese una de las 3 opciones (victoria/derrota): ");
                            resultado2 = cordes.next();
                        }

                        if (resultado.equalsIgnoreCase("victoria") && resultado2.equalsIgnoreCase("derrota")) {
                            tablaB.getBasket().get(p1).setPartidosJ(tablaB.getBasket().get(p1).getPartidosJ() + 1);
                            tablaB.getBasket().get(p2).setPartidosJ(tablaB.getBasket().get(p2).getPartidosJ() + 1);
                            tablaB.getBasket().get(p1).setPartidosG(tablaB.getBasket().get(p1).getPartidosG() + 1);
                            tablaB.getBasket().get(p2).setPartidosP(tablaB.getBasket().get(p2).getPartidosP() + 1);

                        } else if (resultado.equalsIgnoreCase("derrota") && resultado2.equalsIgnoreCase("victoria")) {
                            tablaB.getBasket().get(p1).setPartidosJ(tablaB.getBasket().get(p1).getPartidosJ() + 1);
                            tablaB.getBasket().get(p2).setPartidosJ(tablaB.getBasket().get(p2).getPartidosJ() + 1);
                            tablaB.getBasket().get(p2).setPartidosG(tablaB.getBasket().get(p2).getPartidosG() + 1);
                            tablaB.getBasket().get(p1).setPartidosP(tablaB.getBasket().get(p1).getPartidosP() + 1);

                        } else {
                            System.out.println("No puede poner que un equipo empate y otro pierda y/o gane");
                            break;
                        }

                        System.out.println("Ingrese los puntos a favor del equipo 1: ");
                        int favorp1 = cinq.nextInt();
                        ValidarInt(favorp1);
                        tablaB.getBasket().get(p1).setPuntosFavor(tablaB.getBasket().get(p1).getPuntosFavor() + favorp1);
                        System.out.println("Ingrese los puntos en contra del equipo 1: ");
                        int contrap1 = cinq.nextInt();
                        ValidarInt(contrap1);
                        tablaB.getBasket().get(p1).setPuntosContra(tablaB.getBasket().get(p1).getPuntosContra() + contrap1);

                        System.out.println("Ingrese los puntos a favor del equipo 2: ");
                        int favorp2 = cinq.nextInt();
                        ValidarInt(favorp2);
                        tablaB.getBasket().get(p2).setPuntosFavor(tablaB.getBasket().get(p2).getPuntosFavor() + favorp2);
                        System.out.println("Ingrese los puntos en contra del equipo 2: ");
                        int contrap2 = cinq.nextInt();
                        ValidarInt(contrap2);
                        tablaB.getBasket().get(p2).setPuntosContra(tablaB.getBasket().get(p2).getPuntosContra() + contrap2);
                    }
                }
                case 4 -> {
                    menuR = false;
                }
                default -> {
                    System.out.println("Opcion Invalida");
                }
            }
        }
    }

    public static void ModificarFut(int mod) {
        System.out.println("Ingrese el nuevo nombre del equipo: ");
        String Nnombre = cordes.next();
        tablaF.getFutbol().get(mod).setNombre(Nnombre);
    }

    public static void ModificarVolley(int mod) {
        System.out.println("Ingrese el nuevo nombre del equipo: ");
        String Nnombre = cordes.next();

        tablaV.getVolley().get(mod).setNombre(Nnombre);
    }

    public static void ModificarBasket(int mod) {
        System.out.println("Ingrese el nuevo nombre del equipo: ");
        String Nnombre = cordes.next();

        tablaB.getBasket().get(mod).setNombre(Nnombre);
    }

    public static void ListarEquipos() {
        for (Equipo a : tablaF.getListaEquipos()) {
            System.out.println("Futbol");
            System.out.println("Equipo: " + (tablaF.getFutbol().indexOf(a) + 1) + " Nombre: " + (tablaF.getFutbol().get(tablaF.getFutbol().indexOf(a)).getNombre()));
            System.out.println(a);
        }
        for (Equipo a : tablaV.getListaEquipos()) {
            System.out.println("Volley");
            System.out.println("Equipo: " + (tablaV.getVolley().indexOf(a) + 1) + " Nombre: " + (tablaV.getVolley().get(tablaV.getVolley().indexOf(a)).getNombre()));
            System.out.println(a);
        }
        for (Equipo a : tablaB.getListaEquipos()) {
            System.out.println("Basket");
            System.out.println("Equipo: " + (tablaB.getBasket().indexOf(a) + 1) + " Nombre: " + (tablaB.getBasket().get(tablaB.getBasket().indexOf(a)).getNombre()));
            System.out.println(a);
        }

    }

    public static void ListarFut() {
        for (Equipo a : tablaF.getListaEquipos()) {
            System.out.println("Futbol");
            System.out.println("Equipo: " + (tablaF.getFutbol().indexOf(a) + 1));
            System.out.println(a);
        }
    }

    public static void ListarVolley() {
        for (Equipo a : tablaV.getListaEquipos()) {
            System.out.println("Volley");
            System.out.println("Equipo: " + (tablaV.getVolley().indexOf(a) + 1));
            System.out.println(a);
        }
    }

    public static void ListarBasket() {
        for (Equipo a : tablaB.getListaEquipos()) {
            System.out.println("Basket");
            System.out.println("Equipo: " + (tablaB.getBasket().indexOf(a) + 1));
            System.out.println(a);
        }
    }

    public static void AgregarFutbol() {
        System.out.println("Ingrese el nombre: ");
        String nombre = cordes.next();
        EquipoFutbol equipo = new EquipoFutbol(nombre);
        tablaF.getFutbol().add(equipo);
        tablaF.getListaEquipos().add(equipo);
        System.out.println("Se agrego");
    }

    public static void AgregarVolley() {
        System.out.println("Ingrese el nombre: ");
        String nombre = cordes.next();
        EquipoVolley equipo = new EquipoVolley(nombre);
        tablaV.getVolley().add(equipo);
        tablaV.getListaEquipos().add(equipo);
        System.out.println("Se agrego");
    }

    public static void AgregarBasket() {
        System.out.println("Ingrese el nombre: ");
        String nombre = cordes.next();
        EquipoBasket equipo = new EquipoBasket(nombre);
        tablaB.getBasket().add(equipo);
        tablaB.getListaEquipos().add(equipo);
        System.out.println("Se agrego");
    }

    public static void printJugadores() {
        for (Jugadores j : jugadores) {
            System.out.println("Jugador " + jugadores.indexOf(j) + ":\n" + j);
        }

    }

    public static void transferencia(int jugador) {

        if (jugadores.get(jugador).getEquipo() instanceof EquipoFutbol) {
            ListarFut();
            System.out.println("Ingrese el nuevo equipo:");
            int equipo = cinq.nextInt() - 1;
            ValidarInt(equipo);
            jugadores.get(jugador).getEquipo().setNombre(tablaF.getListaEquipos().get(equipo).getNombre());
            System.out.println("Transferencia Realizada");

        }
        if (jugadores.get(jugador).getEquipo() instanceof EquipoBasket) {
            ListarBasket();
            System.out.println("Ingrese el nuevo equipo:");
            int equipo = cinq.nextInt() - 1;
            ValidarInt(equipo);
            jugadores.get(jugador).getEquipo().setNombre(tablaF.getListaEquipos().get(equipo).getNombre());
            System.out.println("Transferencia Realizada");
        }
        if (jugadores.get(jugador).getEquipo() instanceof EquipoVolley) {
            ListarVolley();
            System.out.println("Ingrese el nuevo equipo:");
            int equipo = cinq.nextInt() - 1;
            ValidarInt(equipo);
            jugadores.get(jugador).getEquipo().setNombre(tablaF.getListaEquipos().get(equipo).getNombre());
            System.out.println("Transferencia Realizada");
        }
    }

    public static void ValidarInt(int n) {
        while (n < 0) {
            System.out.println("Ingrese numeros mayores o iguales a 0");
            n = cinq.nextInt();
        }
    }

    public static void ValidarDouble(double n) {
        while (n < 0) {
            System.out.println("Ingrese numeros mayores o iguales a 0");
            n = cinq.nextInt();
        }
    }
}
