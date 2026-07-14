
package Libreria;

public class NodoArbol {

    Libro libro;
    NodoArbol izquierda;
    NodoArbol derecha;

    public NodoArbol(Libro libro) {
        this.libro = libro;
        this.izquierda = null;
        this.derecha = null;
    }
}