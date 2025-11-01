/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.datos;

/**
 *
 * @author jonathan vargas arciniega
 */
public  class Materias {
    String nombre;
    String semestre;
    String calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

 
    public String[] aArreglo(){
        String[]arreglo= new String[3];
        arreglo[0]= nombre;
        arreglo[1]= semestre;
        arreglo[2]= calificacion;
        return arreglo;
    }
    
    
}
