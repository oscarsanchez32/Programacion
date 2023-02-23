/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.hospitalAbstracto;

/**
 *
 * @author oscar
 */
public class TestHospitalAbstracto {
    public static void main (String [] args){
        
   
    Enfermero enf1 = new Enfermero ("Paqui", "548796L", "1E", 1350.28, AreaTrabajo.ENFERMERO);
    Cardiologo card1 = new Cardiologo("Fernando", "459419P", "58CRD", 2500.80, Especialidad.CARDIOLOGO, "59419A", 35);
    
    System.out.println(enf1.calcularSueldo());
    System.out.println(card1.calcularSueldo());
    
    
    
    
    } 
}
