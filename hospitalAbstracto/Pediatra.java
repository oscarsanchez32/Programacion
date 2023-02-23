/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.hospitalAbstracto;

/**
 *
 * @author oscar
 */
public class Pediatra extends Medico {
    double comision = 35.45;
    
    Pediatra(String nombre, String dni, String nId, double sueldo, Especialidad esp, String num_colegiado, int num_pacientes){
        super(nombre, dni, nId, sueldo, esp, num_colegiado, num_pacientes);
    }
    
    @Override
    public double calcularSueldo () {
        double res;
        res = super.sueldo + super.getNum_pacientes()*this.comision;
        return res;
    }
    
}
