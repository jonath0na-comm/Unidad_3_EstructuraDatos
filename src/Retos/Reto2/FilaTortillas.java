/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos.Reto2;

import java.util.Scanner;

/**
 *
 * @author jonathan vargas arciniega 
 * 
 */
public class FilaTortillas {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] fila = new String[50]; // capacidad máxima
        int tamaño = 0;
        int opcion;

        do {
            System.out.println("TORTILLERIA TEC ");
            System.out.println("1) Agregar cliente a la fila");
            System.out.println("2) Atender cliente");
            System.out.println("3) Cliente sale de la fila");
            System.out.println("4) Terminar servicio");
            System.out.print("Selecciona una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // limpiar el salto de línea
            System.out.println("--------------------------------------------------");

            switch (opcion) {
                case 1 -> { // Agregar cliente
                    if (tamaño >= fila.length) {
                        System.out.println("La fila está llena.");
                    } else {
                        System.out.print("Nombre del cliente: ");
                        String nombre = leer.nextLine();
                        fila[tamaño] = nombre;
                        tamaño++;
                        System.out.println("Cliente agregado correctamente.");
                        mostrarFila(fila, tamaño);
                    }
                }
               /////////////////////////
          
    }
}