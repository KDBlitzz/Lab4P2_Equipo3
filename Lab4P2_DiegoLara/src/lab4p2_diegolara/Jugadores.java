/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_diegolara;

/**
 *
 * @author diego
 */
public class Jugadores {

    protected String nombre;
    protected int edad;
    protected double sueldo;
    protected Equipo equipo;
    protected int duracionC;

    public Jugadores() {
    }

    public Jugadores(String nombre, int edad, double sueldo, Equipo equipo, int duracionC) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.equipo = equipo;
        this.duracionC = duracionC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getDuracionC() {
        return duracionC;
    }

    public void setDuracionC(int duracionC) {
        this.duracionC = duracionC;
    }

    @Override
    public String toString() {
        return "\nnombre = " + nombre + " \nedad = " + edad + " \nsueldo = " + sueldo + " \nequipo = " + equipo + " \nduracion de contrato = " + duracionC;
    }

}
