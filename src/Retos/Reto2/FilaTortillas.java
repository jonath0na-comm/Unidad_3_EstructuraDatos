/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos.Reto2;

import java.util.Scanner;

/**
 *
 * @author jonathan vargas arciniega 
 * 21 de octubre de 2025
 * El programa nos permite administra 
 * una fila de clientes: permite agregar, atender, o eliminar clientes
 * y muestra cómo va quedando la fila hasta terminar el servicio.
 */
public class FilaTortillas {
     public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String[] fila = new String[10];
        int tamaño = 0;
        int opcion = 0;

        do {
            // Bloque para capturar errores de tipo
            while (true) {
                try {
                    System.out.println("------------------------------------------");
                    System.out.println("TORTILLERIA TEC");
                    System.out.println("------------------------------------------");
                    System.out.println("1) Agregar cliente a la fila");
                    System.out.println("2) Atender cliente");
                    System.out.println("3) Cliente sale de la fila");
                    System.out.println("4) Terminar servicio");
                    System.out.print("Selecciona una opcion: ");

                    opcion = Integer.parseInt(leer.nextLine()); // Convertir a número
                    System.out.println("--------------------------------------------------");
                    break; // Si todo sale bien, salir del bucle
                } catch (NumberFormatException e) {
                    System.out.println("Error corazon debes ingresar un numero del 1 al 4 Intenta de nuevo.");
                }
            }
            switch (opcion) {
                case 1:
                    if (tamaño >= fila.length) {
                        System.out.println("La fila ya está llena.");
                    } else {
                        System.out.print("Nombre del cliente: ");
                        String nombre = leer.nextLine();
                        fila[tamaño] = nombre;
                        tamaño++;
                        System.out.println("Cliente agregado correctamente.");
                        System.out.println("----------------------------------------------------------");
                        mostrarFila(fila, tamaño);
                        System.out.println();
                    }
                    break;
                case 2:
                    if (tamaño == 0) {
                        System.out.println("No hay clientes en la fila.");
                    } else {
                        System.out.println("Se está atendiendo a: " + fila[0]);
                        for (int i = 0; i < tamaño - 1; i++) {
                            fila[i] = fila[i + 1];
                        }
                        tamaño--;
                        fila[tamaño] = null;
                        mostrarFila(fila, tamaño);
                        System.out.println();
                    }
                    break;
                case 3:
                    if (tamaño == 0) {
                        System.out.println("No hay clientes en la fila.");
                    } else {
                        System.out.print("Cliente que salió de la fila: ");
                        String nombre = leer.nextLine();
                        int indice = buscarCliente(fila, tamaño, nombre);
                        if (indice == -1) {
                            System.out.println("Cliente no encontrado en la fila.");
                        } else {
                            for (int i = indice; i < tamaño - 1; i++) {
                                fila[i] = fila[i + 1];
                            }
                            tamaño--;
                            fila[tamaño] = null;
                            System.out.println("Cliente " + nombre + " se fue de la fila.");
                            mostrarFila(fila, tamaño);
                            System.out.println();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Servicio terminado.");
                    System.out.println("Clientes restantes en la fila: " + tamaño);
                    mostrarFila(fila, tamaño);
                    System.out.println("MUCHAS GRACIAS POR SUS COMPRAS POR EL DÍA DE HOY");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }
    private static int buscarCliente(String[] fila, int tamaño, String nombre) {
        for (int i = 0; i < tamaño; i++) {
            if (fila[i].equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }
    private static void mostrarFila(String[] fila, int tamaño) {
        if (tamaño == 0) {
            System.out.println("La fila está vacía.");
        } else {
            System.out.println("Fila actual:");
            for (int i = 0; i < tamaño; i++) {
                System.out.print(fila[i]);
                if (i < tamaño - 1) System.out.print(" ---> ");
                if ((i + 1) % 3 == 0) System.out.println(); // salto de línea cada 3 clientes
            }
            System.out.println();
        }
    }
}