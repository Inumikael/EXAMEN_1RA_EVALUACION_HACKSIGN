/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;
/**
 *
 * @author HackSign
 */
public class Pelicula {
    private String titulo;
    private String estudio;
    private int rating;

    // Constructor sin parámetros
    public Pelicula() {
        this.titulo = "";
        this.estudio = "";
        this.rating = 0;
    }

    // Constructor con parámetros
    public Pelicula(String titulo, String estudio, int rating) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.rating = rating;
    }

    // Métodos set para los atributos
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // Métodos get para los atributos
    public String getTitulo() {
        return titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public int getRating() {
        return rating;
    }

    // Método imprimirDatos
    public void imprimirDatos() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Estudio: " + this.estudio);
        System.out.println("Rating: " + this.rating);
    }

    // Método evaluarEdad
    public void evaluarEdad(int edad) {
        if (edad >= this.rating) {
            System.out.println("Puedes ver la película\n");
        } else {
            System.out.println("No puedes ver la película\n");
        }
    }
}