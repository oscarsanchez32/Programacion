/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema6.videoclub;

/**
 *
 * @author oscar
 */
public class Ejemplar {
   private int codigo;
   private String nombre;
   private double precio;
    
    public void insertarEjemplar (int codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void registrarEjemplar (int codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        
    }
    
    public void registrar () {
        }
    
 
    public void modificarEjemplar (int code, String nombre, double codigo){
        this.codigo = code;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void eliminarEjemplar(int codigo){
        if (codigo == this.codigo){
        this.nombre = null;
        this.codigo = 0;
        this.precio = 0;    
        }
    }
    
    public void eliminar (){
        this.nombre = null;
        this.codigo = 0;
        this.precio = 0;
    }
    
    
    }

