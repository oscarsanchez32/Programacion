/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.ikea;

/**
 *
 * @author oscar
 */
public class Mueble extends ProductoHogar {
    private String tipoMueble;
    
    Mueble (String nombre, String descripcion, double precio, TipoMaterial tipo, String tipoMueble){
        super(nombre, descripcion, precio, tipo);
        this.tipoMueble = tipoMueble;
    }
    
    public String getTipoMueble() {
        return this.tipoMueble;
    }
    
    public void setTipoMueble  (String tipoMueble){
        this.tipoMueble = tipoMueble;
    }
    
    @Override
    public String toString () {
    return "Nombre producto: " + super.getNombre() +
                "Descripción: " + super.getDescripcion() +
                "Precio: " + super.getPrecio() +
                "Tipo de Material: " + super.getTipoMaterial() +
                "Tipo de Mueble: " + this.getTipoMueble();
    }
      
}
