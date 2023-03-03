/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.ikea;

/**
 *
 * @author oscar
 */
public class TestIkea {
    public static void main (String [] args){
        Mueble m1 = new Mueble("Estantería KALLAX", "Esntantería grande, 1.90m de alto, 1m de ancho",150.95, TipoMaterial.MADERA, "Estantería");
        ArticuloDecoracion a1 = new ArticuloDecoracion("Lámpara FORSÁ", "Flexo flexible que ilumina mucho", 40.50, TipoMaterial.METAL);
        
        System.out.println(m1.toString());
        System.out.println(a1.toString());
       
    }
    
}
