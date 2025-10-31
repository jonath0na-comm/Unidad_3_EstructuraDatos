/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPilas;

/**
 * 
 * @author Jonathna vargas arcinieha 
 * 31 octubre 2025
 * este programa nos permite trabajar con los datos en forma
 * de LIFO en una pila estatica para manipular datos.
 */
public class Mistack {
   private final int MAXIMO;
   private final String [] STACK;
   private int tope;
   
    /**
 * 
 * Metodo que nos permite ver el contenido 
 * de la pila regresa un arreglo con los datos.
 */
   public String [] viewStack(){
       int topeVirtual = tope + 1;
       String [] values = new String [topeVirtual];
       int index = 0;
       for(int i=tope; i>=0; i--){
           values[index]= STACK[i];
           index++;
       }
       return values;
   }
   
   /**
 * 
 * Metodo que nos permite mostar los elementos que tiene
 * la pila en el tope regresa el valor, si no existe tregresa
 * vacio.
 */
   public String peek(){
       String value = "";
       if (tope>=0){
           value = STACK[tope];
       }
       return value;
   }
   
   /**
 * 
 * Metodo que nos permite sacar el valor 
 * que tenemos en el tope de la pila 
 * return regresa el valor que tenemso en el 
 * final de la si el valor no existe regresar vacia.
 */
   public String pop(){
       String value = "";
       if (tope>=0){
           value = STACK[tope];
           tope--;
       }
       return value;
   }
   
   /**
 * 
 * Metodo que nos permite agregar elementos a la pila 
 * VALUE  es el elemento que se agrega 
 * return un verdadero si se logro insertar
 */
   public boolean push(String value){
       boolean isSUccess;
       if(tope<MAXIMO){
           tope ++;
           STACK[tope] = value;
           isSUccess = true;
       }else{
           isSUccess = false;
       }
       return isSUccess;
   }
   
   //contructor bacio 
   public Mistack(){
       this(10);
   }
   
   //contructor 
   public Mistack(int max){
       MAXIMO = max;
       STACK = new String [MAXIMO];
       tope = -1;   
   }
}
