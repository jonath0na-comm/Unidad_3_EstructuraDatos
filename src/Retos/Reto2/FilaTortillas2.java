/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos.Reto2;

/**
 *
 * @author jonav
 */
import java.util.Scanner;
public class FilaTortillas2 {
      public static void main(String[] args) {
      int opcion = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("TORTILLERIA TEC");
        Persona inicioFila = null;

        do {
            System.out.println("1) Agregar cliente a la fila");
            System.out.println("2) Atender cliente");
            System.out.println("3) Cliente sale de la fila");
            System.out.println("4) Terminar servicio");
            System.out.print("Selecciona una opción: ");

            opcion = Integer.parseInt(leer.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("ingresa el nombre: ");
                    String nombre = leer.nextLine();
                    Persona personaNueva = new Persona();
                    personaNueva.nombre = nombre;
                    if (inicioFila == null)
                        inicioFila = personaNueva;
                    else {
                        Persona siguiente = inicioFila;
                        while (siguiente.vieneAtras != null) {
                            siguiente = siguiente.vieneAtras;
                        }
                        siguiente.vieneAtras = personaNueva;
                    }
                    imprimirLista(inicioFila);
                    break;

                case 2:
                    if (inicioFila != null) {
                        inicioFila = inicioFila.vieneAtras;
                    }
                    imprimirLista(inicioFila);
                    break;

                case 3:
                    System.out.println("A quien deseas eliminar: ");
                    String eliminar = leer.nextLine();
                    Persona buscado = inicioFila;
                    Persona atras = null;
                    while(!buscado.nombre.equals(eliminar)
                            && buscado!=null);{
                    atras = buscado;
                    buscado = buscado.vieneAtras;
                }
                      //case 1
                            if(buscado!=null){
                                //case 1
                                if (atras == null)inicioFila = inicioFila.vieneAtras;
                                else if (buscado.vieneAtras == null )atras.vieneAtras=null;
                                else atras.vieneAtras = buscado.vieneAtras;
                            }
                    imprimirLista(inicioFila);
                    
                    
                    break;

                case 4:
                    break;
            }

        } while (opcion != 4);
    }
    static class Persona {
        String nombre;
        Persona vieneAtras;
    }
    public static void imprimirLista(Persona persona) {
        if (persona != null) {
            System.out.println(persona.nombre);
            imprimirLista(persona.vieneAtras);
        }
    }
}