/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.hospital;

/**
 *
 * @author oscar
 */
public class TrabajadorNoMedico extends Trabajador{
    private AreaTrabajo area;
    
    TrabajadorNoMedico(String nombre, String dni, String nId, double sueldo, AreaTrabajo area){
       super(nombre, dni, nId, sueldo);
       this.area = area;  
    }
    
    public AreaTrabajo getArea () {
        return area;
    }
    
    public void setArea (AreaTrabajo area){
        this.area = area;
    }
    
    @Override
    public String toString () {
        String res;
        res = super.toString() + "Área de trabajo: " + this.area;
        return res;
    }
    
}
