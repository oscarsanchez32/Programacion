/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioSocio;
import java.time.LocalDate;

public class Socio implements Comparable{
    private String dni;
    private String nombre;
    private LocalDate fechaAlta;
    
    //Constructor
    public Socio (String dni, String nombre, LocalDate fechaAlta){
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }
    
    //Getters
    public String getDni () {
        return this.dni;
    }
    
    public String getNombre () {
        return this.nombre;
    }
    
    public LocalDate getFechaAlta () {
        return this.fechaAlta;
    }
    
    //Setter
    public void setDni (String dni) {
        this.dni = dni;
    }
    
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }
    
    public void setFechaAlta (LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    //Equals
    @Override
    public boolean equals (Object o){
        Socio otroSocio = (Socio) o;
        return dni.equals(otroSocio.getDni());
    }
    
    //Comparable
    @Override
    public int compareTo(Socio otroSocio){
        return this.dni.compareTo(otroSocio.getDni());
    }
    
    //Antigüedad
    public long antiguedad () {
    return LocalDate.now().getYear() - fechaAlta.getYear();
    
    //ToString
    @Override
    public String toString () {
        return "Socio: "+
                "DNI: " + this.dni + "/" +
                "Nombre: " + this.nombre + "/" +
                "Fecha de alta: " + this.fechaAlta ;
    }
    
    
    
}
