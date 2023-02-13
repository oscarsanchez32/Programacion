/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.aeropuerto;

/**
 *
 * @author oscar
 */
public class Pasajero extends Persona{
    private int numeroPasaporte;
    Pasajero(String nombre, String apellidos, String dni, String mail, int numeroPasaporte){
        super(nombre, apellidos, dni, mail);
        this.numeroPasaporte = numeroPasaporte;
    }
    
    public double getNumeroPasaporte() {
    return this.numeroPasaporte;
    }

    public void setNumeroPasaporte(int numeroPasaporte) {
    this.numeroPasaporte = numeroPasaporte;
    }
    
    
    
}
