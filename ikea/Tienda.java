/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.tema7.ikea;
import java.util.ArrayList;
/**
 *
 * @author oscar
 */
public class Tienda {
    ArrayList<Producto> producto = new ArrayList<Producto>();
    
    public void agregarProducto(Producto prlist){
        this.producto.add(prlist);
    }

    public void mostrarProducto(){
        for(int i = 0; i < this.producto.size();i++){
            System.out.println(this.producto.get(i).toString());
        }
    }
    
}
