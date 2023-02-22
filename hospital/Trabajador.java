/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.hospital;

/**
 *
 * @author oscar
 */
public class Trabajador {
    protected String nombre;
    protected String dni;
    protected String nId;
    protected double sueldo;
    
    Trabajador (String nombre, String dni, String nId, double sueldo){
       this.nombre=nombre;
       this.dni = dni;
       this.nId = nId;
       this.sueldo = sueldo;
    }
    
    public String getNombre (){
        return "Nombre Trabajador: " + this.nombre;
    }
    
    public String getDni () {
        return "DNI Trabajador : " + this.dni;
    }
    
    public String getNId (){
        return "Número indentificativo del trabajador: " + this.nId;
    }
    
    public double sueldo () {
        return this.sueldo;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setDni (String dni){
        this.dni = dni;
    }
    
    public void setNId (String nId){
        this.nId = nId;
    }
  
    public void setSueldo (double sueldo){
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString(){
        String res;
        res = "Nombre Trabajador: "+ this.nombre +", DNI trabajador: "+ this.dni + ", número de ID: "+this.nId + ", Sueldo: " + this.sueldo + "€ ";
        return res;
    }
}
