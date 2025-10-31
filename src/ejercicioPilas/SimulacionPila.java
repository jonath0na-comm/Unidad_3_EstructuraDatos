/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPilas;

import java.util.Arrays;

/**
 *clase que me permite verificar mis operaciones con la pila 
 * 
 */
public class SimulacionPila {
    public static void main(String[] args) {
        Mistack miPila = new Mistack(4);
        miPila.push("uno");
        miPila.push("dos");
        miPila.push("tres");
        
        System.out.println("valor que esta en el tope " +
               miPila.peek());
        
        miPila.pop();
        miPila.pop();
        
        System.out.println("todos los valores" +
                Arrays.toString(miPila.viewStack()));
        
    }
}
