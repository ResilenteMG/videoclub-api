
package com.videoclub.videoclub_api.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "peliculas")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rango;
    private String titulo;
    private int ano;
    private String director;

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<String> getCastingPrincipal() {
        return castingPrincipal;
    }

    public void setCastingPrincipal(List<String> castingPrincipal) {
        this.castingPrincipal = castingPrincipal;
    }

    public int getPuntuacionAfinidad() {
        return puntuacionAfinidad;
    }

    public void setPuntuacionAfinidad(int puntuacionAfinidad) {
        this.puntuacionAfinidad = puntuacionAfinidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @ElementCollection
    private List<String> castingPrincipal;

    @Column(name = "puntuacion_afinidad")
    private int puntuacionAfinidad;

    @Column(length = 1000)
    private String descripcion;

    private String imagen;
    private String url;
    private String identificacion;


    private String categoria;

    public Movie() {}

}