package com.aulaestudio.controllers;



import com.aulaestudio.models.Alumno;

import java.util.ArrayList;

public class AcademiaController {
    private ArrayList<Alumno> listaAlumnos;
    private boolean debug;

    public AcademiaController(boolean debug) {
        this.listaAlumnos =new ArrayList();

        if (debug){
            Alumno al=new Alumno("Pedro","111",23);
            al.matricularAsignatura("progamacion");
            this.listaAlumnos.add(al);
            al=new Alumno("Juan","222",23);
            al.matricularAsignatura("programacion");
            this.listaAlumnos.add(al);
            al=new Alumno("Maria","333",23);
            al.matricularAsignatura("marcas");
            this.listaAlumnos.add(al);

        }
    }

    public AcademiaController() {
        this.listaAlumnos =new ArrayList();
    }
    public int addAlumno(String nombre,String dni,int edad){
        this.listaAlumnos.add(new Alumno(nombre,dni,edad));
        return this.listaAlumnos.size()-1;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public ArrayList<Alumno> buscarAlumno(String search){
        ArrayList<Alumno> lista=new ArrayList<>();
        for(Alumno al:listaAlumnos){
            if(al.getNombre().equals(search)||al.getDni().equals(search)){
                lista.add(al);
            }
        }
        if(lista.size()>0) return lista;
        return  null;
    }

    public boolean matricularAlumno(String asignatura, Alumno alumno) {
        alumno.matricularAsignatura(asignatura);
        return true;
    }

    public ArrayList<String> busarAlumnoAsignatura(String asignatura) {
    ArrayList<String> alumnosEncontrados=new ArrayList<>();
    for(Alumno al:this.listaAlumnos){
        if(al.matriculado(asignatura)){
            alumnosEncontrados.add(al.getNombre());
        }
    }
    return alumnosEncontrados;
    }
}
