/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.aeropuerto;

/**
 *
 * @author oscar
 */
public class TrabajadorAeropuerto extends Persona{
    double sueldo;
    TrabajadorAeropuerto(String nombre, String apellidos, String dni, String mail, double sueldo){
        super(nombre, apellidos, dni, mail);
        this.sueldo = sueldo;
    }
    
    public double getSueldo() {
    return this.sueldo;
    }

    public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
    }
    
}
