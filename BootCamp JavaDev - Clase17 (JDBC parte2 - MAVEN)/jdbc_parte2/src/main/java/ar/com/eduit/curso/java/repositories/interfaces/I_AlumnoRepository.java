package ar.com.eduit.curso.java.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;

public interface I_AlumnoRepository {
    
    void save(Alumno alumno);
    void remove(Alumno alumno);
    void update(Alumno alumno);
    
    List<Alumno> getAll();

    
/*Todos los métodos se apoyan en getAll(), ya que deberá estar implementado de forma obligatoria en la Clase que implmente 
la Interfaz. Es mas barato cargar toda la lista y filtrar, que realizar codigos que solo traigan el Elemento solicitado */
    
    default Alumno getById(int id){
// OPCION API STREAM (Programacion Funcional)
        return getAll()
                .stream()
                .filter(a->a.getId()==id)
                .findAny()
                .orElse(new Alumno ());
        
// OPCION 2 Programacion Imperativa
/*
        Alumno alumno = new Alumno (); 
        for(Alumno a : getAll()){
            if(a.getId()== id) alumno = a;
            return alumno;
        }
        return alumno;
*/
    }
    
    default List<Alumno>getLikeApellido(String apellido){
        if (apellido == null) return new ArrayList ();
        return getAll()
                .stream()
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList()); //transforma los datos tipo String que devuelve el filtro en Lista. 
        
    }
    
    default List<Alumno>getByApellido(String apellido){
        if (apellido == null) return new ArrayList ();
        return getAll()
                .stream()
                .filter(a->a.getApellido().equalsIgnoreCase(apellido))
                .collect(Collectors.toList());
        
    }
    
    /* La diferencia entre un método y otro sera que en 'getLikeApellido' filtrara cualquier caso que 'contenga' una parte de 
    la String pasada como Parámetro, y en 'getByApellido' la expresión pasada como Parámetro debe ser igual para que tenga
    un resultado. 
    */
    
    default List<Alumno>getLikeCurso(int idCurso){
        return getAll()
                .stream()
                .filter(a->a.getIdCurso()==idCurso)
                .collect(Collectors.toList());
    }
    
    default List<Alumno>getLikeCurso(Curso curso){
        if(curso==null) return new ArrayList<Alumno>();
        return getLikeCurso(curso.getId());
    }
    
    default List<Alumno>getLikeApellidoNombre(String apellido, String nombre){
        if (apellido==null || nombre==null) return new ArrayList<Alumno>();
        return getAll()
                .stream()
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase())
                        && a.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .collect(Collectors.toList());
    }
    
}
