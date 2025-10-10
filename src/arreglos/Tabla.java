/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

/**
 *
 * @author jonav
 */
import java.util.Scanner;
public class Tabla{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[] = new int[20];
        int arreglo2[] = {4, 3, 2, 1, 2};
        int matriz [][] = new int [3][4];
        int [] matriz2 [] = {{2,4,2},{1,2,3}};
        
        System.out.println(" Valor " + 
                matriz2[1][2]);
        System.out.println(" La matriz tiene" + 
                matriz2.length);
        System.out.println("El primer arreglo tiene " + arreglo.length 
                + " posiciones");
        System.out.println("El segundo arreglo tiene " + arreglo2.length 
                + " posiciones");
        
        //Pedir 3 nombres, 3 carreras
        //pedir 3 edades
        //acomodar en una tabla que sea 
        //nombre carrera edad
        String [][] mis_datos = new String [5][3];
        Scanner leer=new Scanner (System.in);
        
        for(int i=0; i<5; i++){
        System.out.println("Dame el nombre: ");
        var nombre =leer.nextLine();
        System.out.println("Dame la carrera: ");
        var carrera=leer.next();
        System.out.println("Dame la edad: ");
        var edad=leer.nextLine();
        //Aqui meterlos a la matriz
        mis_datos[i][0]=nombre;
        mis_datos[i][1]=carrera;
        mis_datos[i][2]=edad;
    }
        //imprime la matriz 
        for (String[] mis_dato : mis_datos){
            for (String dato : mis_dato){
                System.out.printf("%-10s",dato);
            }
            System.out.println("");
        }
    }
}