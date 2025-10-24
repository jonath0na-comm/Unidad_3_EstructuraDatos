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
        System.out.println("------------------------------------------------------------------------");

        do {
            System.out.println("1) Agregar cliente a la fila");
            System.out.println("2) Atender cliente");
            System.out.println("3) Cliente sale de la fila");
            System.out.println("4) Terminar servicio");
            System.out.println("5) Imprimir en orden inverso");
            System.out.print("Selecciona una opción: ");
            opcion = Integer.parseInt(leer.nextLine());
            System.out.println("--------------------------------------------------------------------");

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa el nombre: ");
                    String nombre = leer.nextLine();
                    Persona personaNueva = new Persona();
                    personaNueva.nombre = nombre;

                    if (inicioFila == null) {
                        inicioFila = personaNueva;
                    } else {
                        System.out.println("¿Deseas agregar al inicio o al final? (i/f): ");
                        String lugar = leer.nextLine().toLowerCase();

                        if (lugar.equals("i")) {
                            personaNueva.vieneAtras = inicioFila;
                            inicioFila.vieneAdelante = personaNueva;
                            inicioFila = personaNueva;
                        } else {
                            Persona siguiente = inicioFila;
                            while (siguiente.vieneAtras != null) {
                                siguiente = siguiente.vieneAtras;
                            }
                            siguiente.vieneAtras = personaNueva;
                            personaNueva.vieneAdelante = siguiente;
                        }
                    }
                    imprimirLista(inicioFila);
                    System.out.println("-------------------------------------------------------------------");
                    break;

                case 2:
                    if (inicioFila != null) {
                        System.out.println("Se atendió a: " + inicioFila.nombre);
                        inicioFila = inicioFila.vieneAtras;
                        if (inicioFila != null) {
                            inicioFila.vieneAdelante = null;
                        }
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }
                    imprimirLista(inicioFila);
                    break;

                case 3:
                    System.out.println("¿A quién deseas eliminar?: ");
                    String eliminar = leer.nextLine();
                    Persona buscado = inicioFila;

                    while (buscado != null && !buscado.nombre.equals(eliminar)) {
                        buscado = buscado.vieneAtras;
                    }

                    if (buscado != null) {
                        if (buscado.vieneAdelante == null) {
                            // Es el inicio
                            inicioFila = buscado.vieneAtras;
                            if (inicioFila != null)
                                inicioFila.vieneAdelante = null;
                        } else if (buscado.vieneAtras == null) {
                            // Es el final
                            buscado.vieneAdelante.vieneAtras = null;
                        } else {
                            buscado.vieneAdelante.vieneAtras = buscado.vieneAtras;
                            buscado.vieneAtras.vieneAdelante = buscado.vieneAdelante;
                        }
                        System.out.println("Se eliminó a " + eliminar + " de la fila.");
                    } else {
                        System.out.println("No se encontró a " + eliminar + " en la fila.");
                    }
                    imprimirLista(inicioFila);
                    break;

                case 4:
                    System.out.println("Servicio terminado. ¡Hasta luego!");
                    int contador = 0;
                    while (inicioFila != null) {
                        contador++;
                        inicioFila = inicioFila.vieneAtras;
                    }
                    System.out.println("Las personas sin atender son " + contador);
                    break;

                case 5:
                    imprimirListaInversa(inicioFila);
                    break;
            }

        } while (opcion != 4);
    }

    static class Persona {
        String nombre;
        Persona vieneAtras;
        Persona vieneAdelante;
    }

    public static void imprimirLista(Persona persona) {
        if (persona == null) {
            System.out.println("La fila está vacía.");
        } else {
            System.out.println("Estado actual de la fila:");
            Persona temp = persona;
            while (temp != null) {
                System.out.println(" - " + temp.nombre);
                temp = temp.vieneAtras;
            }
        }
    }

    public static void imprimirListaInversa(Persona persona) {
        if (persona == null) {
            System.out.println("La fila está vacía.");
        } else {
            Persona temp = persona;
            while (temp.vieneAtras != null) {
                temp = temp.vieneAtras;
            }
            System.out.println("Fila en orden inverso:");
            while (temp != null) {
                System.out.println(" - " + temp.nombre);
                temp = temp.vieneAdelante;
            }
        }
    }
}