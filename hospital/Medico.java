/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.hospital;

/**
 *
 * @author oscar
 */
public class Medico extends Trabajador {
    private Especialidad esp;
    private String num_colegiado;
    private int num_pacientes;
    
    Medico (String nombre, String dni, String nId, double sueldo, Especialidad esp, String num_colegiado, int num_pacientes){
        super(nombre, dni, nId, sueldo);
        this.esp = esp;
        this.num_colegiado=num_colegiado;
        this.num_pacientes = num_pacientes;
    }
    
    public Especialidad getEspecialidad (){
        return this.esp;
    }
    
    public String num_colegiado (){
        return "Número de colegiado: " + this.num_colegiado;
    }
    
    public int num_pacientes (){
        return num_pacientes;
    }
    
    public void setEspecialidad (Especialidad esp){
        this.esp = esp;
    }
    
    public void setNum_colegiado (String num_colegiado){
        this.num_colegiado = num_colegiado;
    }
    
    public void setNum_Pacientes (int num_pacientes){
        this.num_pacientes = num_pacientes;
    }
    
    @Override
    public String toString () {
        String res;
        res = super.toString() + "Especialidad: "+this.esp+ ", Num. de Colegiado: " + this.num_colegiado + ", Num. de pacientes: " + this.num_pacientes;
        return res;
    }
    
}
