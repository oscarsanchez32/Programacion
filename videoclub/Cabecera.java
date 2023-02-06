/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema6.videoclub;

/**
 *
 * @author oscar
 */
public class Cabecera {
    private Cliente cliente;
    private Fecha_entrega fecha;
    
    public void insertarCabecera (Cliente cliente, Fecha_entrega fecha){
        this.cliente = cliente;
        this.fecha = fecha;
    }
    
    public void eliminarCabecera (Cliente cliente){
        if (this.cliente == cliente){
            this.cliente = null;
            this.fecha = null;
                    
        }
    }
    
}
