/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.hospital;

/**
 *
 * @author oscar
 */
public class TestHospital {
   
    public static void main (String [] args){
    Medico medo1 = new Medico("Matasanos","126489P","875C", 1850.50, Especialidad.CIRUJANO, "45A", 38);
    TrabajadorNoMedico limp1 = new TrabajadorNoMedico("Charo", "545787M", "54L", 1000.65, AreaTrabajo.LIMPIADOR);   
    
    System.out.println(limp1.toString());
    System.out.println(medo1.toString());
    
    }
}
