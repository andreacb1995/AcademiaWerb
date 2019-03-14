package com.aulaestudio.models;


import java.util.ArrayList;

public class Alumno {
     private String nombre;
     private String dni;
     private int edad;
     private ArrayList<String> asignaturas=new ArrayList();
    public Alumno() {
    }
    public Alumno(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }
    public Alumno(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                '}';
    }


    public void matricularAsignatura(String asignatura){
        this.asignaturas.add(asignatura);
    }

    public boolean matriculado(String asignatura) {
        if(this.asignaturas.indexOf(asignatura)<0){
            return false;
        }
        return true;
    }
}
