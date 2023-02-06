/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema6.videoclub;

/**
 *
 * @author oscar
 */
public class Cliente {
    private Integer codigo;
    private String nombre;
    private Bono bono;
    
   public void registrar (){
       
   }
   
   public void registrarCliente(Integer codigo, String nombre, Bono bono){
       this.codigo = codigo;
       this.nombre = nombre;
       this.bono = bono;
   }
   
   public void modificarCliente(Integer codigo, String nombre, Bono bono){
       this.codigo = codigo;
       this.nombre = nombre;
       this.bono = bono;
   }
   
   public void eliminarCliente(Integer codigo){
       this.nombre = null;
       this.bono = null;
       this.codigo = 0;
   }
   
   public void eliminar(){
       this.nombre = null;
       this.bono = null;
       this.codigo = null;
   }
   
   public void insertarCliente () {
      
               
   }
    
    
    
}
