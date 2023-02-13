/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.aeropuerto;

/**
 *
 * @author oscar
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private String mail;
    
    Persona(String nombre, String apellidos, String dni, String mail){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.mail=mail;
    }
      public String getNombre() {
    return nombre;
    }

      public void setNombre(String nombre) {
    this.nombre = nombre;
    }

      public String getApellidos() {
    return this.apellidos;
    }

    public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
    }

    public String getDni() {
    return this.dni;
    }

    public void setDni(String dni) {
    this.dni = dni;
    }

    public String getEmail() {
    return this.mail;
    }

    public void setEmail(String email) {
    this.mail = email;
    }
}
