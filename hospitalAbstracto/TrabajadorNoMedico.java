/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.hospitalAbstracto;

/**
 *
 * @author oscar
 */
public abstract class TrabajadorNoMedico extends Trabajador {
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
    public double calcularSueldo () {
      double  res;
      res = super.sueldo;
      return res;
    }
    
    
    @Override
    public String toString () {
        String res;
        res = super.toString() + "Área de trabajo: " + this.area;
        return res;
    }
    
}

