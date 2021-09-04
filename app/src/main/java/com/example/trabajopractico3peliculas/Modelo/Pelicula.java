package com.example.trabajopractico3peliculas.Modelo;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private int foto;
    private String resenia;
    private String descripcion;
    private String actores;
    private String director;

    public Pelicula(String titulo, int foto, String resenia, String descripcion, String actores, String director){
        this.titulo = titulo;
        this.foto = foto;
        this.resenia = resenia;
        this.descripcion = descripcion;
        this.actores = actores;
        this.director = director;
    }

    public String  getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public int getFoto(){
        return foto;
    }
    public void setFoto(int foto){
        this.foto = foto;
    }
    public String getResenia(){
        return resenia;
    }
    public void setResenia(String resenia){
        this.resenia = resenia;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public String getActores(){
        return actores;
    }
    public void setActores(String actores){
        this.actores = actores;
    }
    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }
}
