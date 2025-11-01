/*

 */
package ejercicio1.datos;

import java.util.ArrayList;

/**
 *Esta clase me permite mantener la informacion entre las ventanas
 * 
 * @author jonathan vargas arciniega 
 * 14 de octubre
 */
public class KardexDatos {
 /**   public static String [][] datos=
            new String [10][3];
    public static int index=0; // para saber cuantos llevo
   */ 
public static double calcularPromedio() {
    if (KardexDatos.listasMaterias.size() == 0) return 0;

    double suma = 0;
    for (int i = 0; i < KardexDatos.listasMaterias.size(); i++) {
        Materias mat = KardexDatos.listasMaterias.get(i);
        suma += Double.parseDouble(mat.calificacion);
    }
    return suma / KardexDatos.listasMaterias.size();
     // metodo que calcula el promedio segun lo vallan ingresando
} /*
public static int buscar(String dato) {
    for (int i = 0; i < index; i++) {
        if (dato.equalsIgnoreCase(datos[i][0])) {
            return i; // retorna el índice encontrado
        }
    }
    return -1; // si no se encontró
} */
    public static ArrayList<Materias> listasMaterias = new ArrayList<>();
}
