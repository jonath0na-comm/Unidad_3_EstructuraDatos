/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos.Reto1;

/**
 *
 * @author jonathan vargas arciniega 
 * 10 de octubre 2025 
 * 
 * programa que se aplica la recursividad donde se imprime los nuemros que se antepone 
 * a otro en un orden inverso.
 */
import java.util.Scanner;
public class Pregunta13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa un numero: ");
        int numero = leer.nextInt();

        System.out.println("Numeros en orden inverso:");
        imprimir_numero(numero);
    }
    // Método recursivo que imprime los números en orden inverso
    public static void imprimir_numero(int n) {
        if (n > 0) { 
            System.out.print(n + " ");
            imprimir_numero(n - 1); 
        }
    }
}