
package Libreria;

public class NodoLista {
    Libro libro;
    NodoLista siguiente;

    public NodoLista(Libro libro) {
        this.libro = libro;
        this.siguiente = null;
    }
}
