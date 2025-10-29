/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1.datos;

/**
 *
 * @author Jonat
 */
public class Materias {
    String nombre;
    int calificacion;
    int semestre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificaciòn) {
        this.calificacion = calificaciòn;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public String [] aArreglo(){
        String [] arreglo = new String [3];
        arreglo[0] = nombre;
        arreglo[1] = "" + semestre;
        arreglo[2] = "" + calificacion;
        return arreglo;
        
    }
    
}
