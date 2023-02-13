/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.aeropuerto;

/**
 *
 * @author oscar
 */
public class Azafato extends Persona{
    double sueldo;
    Idioma idioma;
    
    Azafato(String nombre, String apellidos, String dni, String mail, double sueldo, Idioma idioma){
        super(nombre, apellidos, dni, mail);
        this.sueldo = sueldo;
        this.idioma = idioma;
    }
    
    
    public Idioma getIdioma() {
    return this.idioma;
    }

    public void setIdioma(Idioma idioma) {
    this.idioma = idioma;
    }
    
    public double getSueldo() {
    return this.sueldo;
    }

    public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
    }
             
}
