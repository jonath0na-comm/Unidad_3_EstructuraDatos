/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.datos;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jonav
 */
public class KardexDatos {
   
    // Arreglo de datos
    public static String[][] datos = new String[10][3];

    // Lista de Materias
    public static List<Materias> Listasmaterias = new ArrayList<>();

    // Para saber cuántos registros llevamos
    public static int index = 0;

    // Método que calcula el promedio según las calificaciones ingresadas
    public static double calcularPromedio() {
        if (index == 0) return 0;

        double suma = 0;
        for (int i = 0; i < index; i++) {
            suma += Double.parseDouble(datos[i][2]);
        }
        return suma / index;
    }

    // Método para buscar un dato en la primera columna del arreglo
    public static int buscar(String dato) {
        for (int i = 0; i < index; i++) {
            if (dato.equals(datos[i][0])) {
                return i; // retorna la posición si lo encuentra
            }
        }
        return -1; // retorna -1 si no lo encuentra
    }

    // Método para agregar una Materia a la lista
    public static void agregarMateria(Materias m) {
        Listasmaterias.add(m);
    }
}