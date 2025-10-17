/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.datos;

/**
 *
 * @author jonav
 */
public class KardexDatos {
    public static String [][] datos=
            new String [10][3];
    public static int index=0; // para saber cuantos llevo
    
public static double calcularPromedio() {
    if (KardexDatos.index == 0) return 0;

    double suma = 0;
    for (int i = 0; i < KardexDatos.index; i++) {
        suma += Double.parseDouble(KardexDatos.datos[i][2]);
    }
    return suma / KardexDatos.index;
    // metodo que calcula el promedio segun lo vallan ingresando
}
public static int  buscar(String dato){
    int a=0;
    for (int i=0;i<datos.length;i++){
        if (dato.equals(datos[i][0])){
             a=i;
        }
        else {
            a=-1;           
        }
     
    }
    return a;
} 
}
