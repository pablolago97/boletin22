/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

/**
 *
 * @author Pablo
 */
public class Libros {
     private String nomeLibro, autor;

    private Float precio;
    private int unidades;

    public Libros() {
    }

    public Libros(String nomeLibro, String autor, Float precio, int unidades) {
        this.nomeLibro = nomeLibro;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNomeLibro() {
        return nomeLibro;
    }

    public String getAutor() {
        return autor;
    }

    public Float getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    @Override
    public String toString() {
        return "Libro: " + nomeLibro + ", Autor: " + autor + ", Precio: " + precio + ", Unidades:" + unidades;
    }
}
