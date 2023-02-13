/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.aeropuerto;

/**
 *
 * @author oscar
 */
public class Piloto extends Persona{
    private Rango rango;
    private double sueldo;
    private boolean vuelosInternacionales;
    
    Piloto(String nombre, String apellidos, String dni, String mail, Rango rango, double sueldo, boolean vuelosInternacionales){
        super(nombre, apellidos, dni, mail);
        this.rango = rango;
        this.sueldo = sueldo;
        this.vuelosInternacionales = vuelosInternacionales;      
    }
    
    public Rango getRango() {
    return this.rango;
    }

    public void setRango(Rango rango) {
    this.rango = rango;
    }

    public double getSueldo() {
    return this.sueldo;
    }

    public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
    }

    public boolean esVuelosInternacionales() {
    return vuelosInternacionales;
    }

    public void setVuelosInternacionales(boolean vuelosInternacionales) {
    this.vuelosInternacionales = vuelosInternacionales;
  }
}
