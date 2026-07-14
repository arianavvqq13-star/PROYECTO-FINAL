
package Libreria;

public class Libro {

    private int codigo;
    private String titulo;
    private String autor;

    public Libro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo +
               " | Titulo: " + titulo +
               " | Autor: " + autor;
    }
}
