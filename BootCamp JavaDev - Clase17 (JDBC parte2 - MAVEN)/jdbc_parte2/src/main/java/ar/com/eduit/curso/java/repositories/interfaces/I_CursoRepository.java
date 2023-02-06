package ar.com.eduit.curso.java.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.eduit.curso.java.entities.Curso;

public interface I_CursoRepository {            // SQL:
    void save(Curso curso);                     //insert
    void remove(Curso curso);                   //delete
    void update(Curso curso);                   //update
    List<Curso> getAll();                       //select
    Curso getById(int id);                      //select where
    List<Curso>getLikeTitulo(String titulo);    //select where
    
     default List<Curso>getLikeTituloProfesor(String titulo, String profesor){
        if(titulo==null || profesor==null) return new ArrayList<Curso>();
        return getAll()
                .stream()
                .filter(c->c.getTitulo().toLowerCase().contains(titulo.toLowerCase())
                        && c.getProfesor().toLowerCase().contains(profesor.toLowerCase()))
                .collect(Collectors.toList());
    }
    
}

