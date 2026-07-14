
package Libreria;

public class ListaEnlazadaLibros {

    private NodoLista inicio;

    // insertar libro al final
    public void agregarLibro(Libro libro) {
        NodoLista nuevo = new NodoLista(libro);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            NodoLista temp = inicio;

            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }

            temp.siguiente = nuevo;
        }

        System.out.println("Libro agregado correctamente.");
    }

    //  mostrar libros
    public void mostrarLibros() {
        System.out.println("\n===== LISTA DE LIBROS =====");

        if (inicio == null) {
            System.out.println("No hay libros registrados.");
            return;
        }

        NodoLista temp = inicio;

        while (temp != null) {
            System.out.println(temp.libro);
            temp = temp.siguiente;
        }
    }

    // buscar libro por código
    public void buscarLibro(int codigo) {
        NodoLista temp = inicio;
        boolean encontrado = false;

        while (temp != null) {
            if (temp.libro.getCodigo() == codigo) {
                System.out.println("Libro encontrado: " + temp.libro);
                encontrado = true;
                break;
            }
            temp = temp.siguiente;
        }

        if (!encontrado) {
            System.out.println("Libro no encontrado.");
        }
    }

    // eliminar libro por código
    public void eliminarLibro(int codigo) {

        if (inicio == null) {
            System.out.println("Lista vacia.");
            return;
        }

        if (inicio.libro.getCodigo() == codigo) {
            inicio = inicio.siguiente;
            System.out.println("Libro eliminado.");
            return;
        }

        NodoLista actual = inicio;

        while (actual.siguiente != null &&
               actual.siguiente.libro.getCodigo() != codigo) {
            actual = actual.siguiente;
        }

        if (actual.siguiente == null) {
            System.out.println("Libro no encontrado.");
        } else {
            actual.siguiente = actual.siguiente.siguiente;
            System.out.println("Libro eliminado.");
        }
    }
}