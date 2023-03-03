/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.ikea;

/**
 *
 * @author oscar
 */
public abstract class ProductoHogar extends Producto {
    private TipoMaterial tipo;
    
    ProductoHogar (String nombre, String descripcion, double precio, TipoMaterial tipo){
        super(nombre, descripcion, precio);
        this.tipo = tipo;
    }
    
    public TipoMaterial getTipoMaterial () {
        return this.tipo;
    }
    
    public void setTipoMaterial (TipoMaterial tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString () {
    return "Nombre producto: " + super.getNombre() +
                "Descripción: " + super.getDescripcion() +
                "Precio: " + super.getPrecio() +
                "Tipo de Material: " + this.getTipoMaterial();
    }
}
