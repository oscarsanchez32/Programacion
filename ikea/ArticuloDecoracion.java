/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.ikea;

/**
 *
 * @author oscar
 */
public class ArticuloDecoracion extends ProductoHogar {
    ArticuloDecoracion (String nombre, String descripcion, double precio, TipoMaterial tipo){
        super(nombre, descripcion, precio, tipo);
        
    }
    
    @Override
    public String toString () {
    return "Nombre producto: " + super.getNombre() +
                "Descripción: " + super.getDescripcion() +
                "Precio: " + super.getPrecio() +
                "Tipo de Material: " + super.getTipoMaterial();
    }
}
