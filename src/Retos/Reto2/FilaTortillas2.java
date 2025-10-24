/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos.Reto2;

/**
 *
 * @author jonathan vargas arciniega 
 * 24 de octubre 2025
 */
import java.util.Scanner;

public class FilaTortillas2 {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);

        System.out.println("TORTILLERIA TEC");
        Persona inicioFila = null; // Puntero al primer cliente de la fila (inicio de la lista)
        System.out.println("------------------------------------------------------------------------");

        do {
            // Menú de opciones
            System.out.println("1) Agregar cliente a la fila");
            System.out.println("2) Atender cliente");
            System.out.println("3) Cliente sale de la fila");
            System.out.println("4) Terminar servicio");
            System.out.println("5) Imprimir en orden inverso");
            System.out.print("Selecciona una opción: ");
            opcion = Integer.parseInt(leer.nextLine());
            System.out.println("--------------------------------------------------------------------");

            switch (opcion) {

                // Opción 1: Agregar un nuevo cliente
                case 1:
                    System.out.println("Ingresa el nombre: ");
                    String nombre = leer.nextLine();
                    Persona personaNueva = new Persona();
                    personaNueva.nombre = nombre;

                    if (inicioFila == null) {
                        // Si la fila está vacía, el nuevo cliente es el primero
                        inicioFila = personaNueva;
                    } else {
                        // Si ya hay clientes, se pregunta dónde agregarlo
                        System.out.println("¿Deseas agregar al inicio o al final? (i/f): ");
                        String lugar = leer.nextLine().toLowerCase();

                        if (lugar.equals("i")) {
                            // Insertar al inicio de la fila
                            personaNueva.vieneAtras = inicioFila;
                            inicioFila.vieneAdelante = personaNueva;
                            inicioFila = personaNueva;
                        } else {
                            // Insertar al final de la fila
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

                // Opción 2: Atender al primer cliente de la fila
                case 2:
                    if (inicioFila != null) {
                        System.out.println("Se atendió a: " + inicioFila.nombre);
                        // El siguiente cliente pasa a ser el primero
                        inicioFila = inicioFila.vieneAtras;
                        if (inicioFila != null) {
                            inicioFila.vieneAdelante = null;
                        }
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }
                    imprimirLista(inicioFila);
                    break;

                // Opción 3: Eliminar un cliente específico de la fila
                case 3:
                    System.out.println("¿A quién deseas eliminar?: ");
                    String eliminar = leer.nextLine();
                    Persona buscado = inicioFila;

                    // Se busca a la persona por nombre
                    while (buscado != null && !buscado.nombre.equals(eliminar)) {
                        buscado = buscado.vieneAtras;
                    }

                    if (buscado != null) {
                        if (buscado.vieneAdelante == null) {
                            // Si es el primero de la fila
                            inicioFila = buscado.vieneAtras;
                            if (inicioFila != null)
                                inicioFila.vieneAdelante = null;
                        } else if (buscado.vieneAtras == null) {
                            // Si es el último
                            buscado.vieneAdelante.vieneAtras = null;
                        } else {
                            // Si está en medio de la fila
                            buscado.vieneAdelante.vieneAtras = buscado.vieneAtras;
                            buscado.vieneAtras.vieneAdelante = buscado.vieneAdelante;
                        }
                        System.out.println("Se eliminó a " + eliminar + " de la fila.");
                    } else {
                        System.out.println("No se encontró a " + eliminar + " en la fila.");
                    }
                    imprimirLista(inicioFila);
                    break;

                // Opción 4: Terminar el servicio
                case 4:
                    System.out.println("Servicio terminado. ¡Hasta luego!");
                    int contador = 0;
                    // Se cuenta cuántas personas quedaron sin atender
                    while (inicioFila != null) {
                        contador++;
                        inicioFila = inicioFila.vieneAtras;
                    }
                    System.out.println("Las personas sin atender son " + contador);
                    break;

                // Opción 5: Imprimir la lista en orden inverso
                case 5:
                    imprimirListaInversa(inicioFila);
                    break;
            }

        } while (opcion != 4); // El ciclo termina cuando el usuario selecciona "Terminar servicio"
    }

    // Clase interna para representar a cada cliente en la fila
    static class Persona {
        String nombre;
        Persona vieneAtras;     // Enlace hacia el siguiente cliente
        Persona vieneAdelante;  // Enlace hacia el cliente anterior
    }

    // Método para imprimir la fila en orden normal
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

    // Método para imprimir la fila en orden inverso
    public static void imprimirListaInversa(Persona persona) {
        if (persona == null) {
            System.out.println("La fila está vacía.");
        } else {
            // Se recorre hasta el último cliente
            Persona temp = persona;
            while (temp.vieneAtras != null) {
                temp = temp.vieneAtras;
            }
            System.out.println("Fila en orden inverso:");
            // Luego se imprime desde el final hacia el inicio
            while (temp != null) {
                System.out.println(" - " + temp.nombre);
                temp = temp.vieneAdelante;
            }
        }
    }
}