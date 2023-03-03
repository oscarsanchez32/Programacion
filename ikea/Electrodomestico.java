/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.ikea;

/**
 *
 * @author oscar
 */
public class Electrodomestico extends ProductoHogar {
    private EficienciaEnergetica eficiencia;
    
    Electrodomestico (String nombre, String descripcion, double precio, TipoMaterial tipo, EficienciaEnergetica eficiencia){
        super(nombre, descripcion, precio, tipo);
        this.eficiencia = eficiencia;
    }
    
    public EficienciaEnergetica getEficiencia () {
        return this.eficiencia;
    }
    
    public void setEficiencia (EficienciaEnergetica eficiencia){
        this.eficiencia = eficiencia;
    }
    
    @Override
    public String toString () {
    return "Nombre producto: " + super.getNombre() +
                "Descripción: " + super.getDescripcion() +
                "Precio: " + super.getPrecio() +
                "Tipo de Material: " + super.getTipoMaterial() +
                "Eficiencia energética: " + this.getEficiencia () ;
    }
}
