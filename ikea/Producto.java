/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.ikea;

/**
 *
 * @author oscar
 */
public abstract class Producto {
    protected String nombre;
    protected String descripcion;
    protected double precio;
    
    Producto (String nombre, String descripcion, double precio){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public String getNombre () {
        return this.nombre;
    }
    
    public String getDescripcion () {
        return this.descripcion;
    }
    
    public double getPrecio () {
        return this.precio;
    }
    
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    
    public void setDescripcion (String descripcion){
        this.descripcion = descripcion;
    }
    
    public void setPrecio (double precio){
        this.precio = precio;
    }
    
    @Override
    public String toString () {
        return "Nombre producto: " + this.getNombre() +
                "Descripción: " + this.getDescripcion() +
                "Precio: " + this.getPrecio() ;
    }
}
