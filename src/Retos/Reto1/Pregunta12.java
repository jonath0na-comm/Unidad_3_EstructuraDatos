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
 * Este programa permite 3 valores numericos que nos devuelve un valor menor
 * que se envia como parametro considerando que los numeros son eneteros tiene 
 * un metodo que devuelve los 3 valores. 
 */
import java.util.Scanner;
public class Pregunta12 {
    
    // Método que recibe tres números enteros y devuelve el menor
    public static int getNumeroMenor(int a, int b, int c) {
        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        return menor;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        int num1 = leer.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = leer.nextInt();
        System.out.print("Ingresa el tercer nmero: ");
        int num3 = leer.nextInt();
        int menor = getNumeroMenor(num1, num2, num3);
        System.out.println("El numero menor es: " + menor);
    }
}