package Libreria;

public class ArbolLibros {

    private NodoArbol raiz;

    // 🔹 INSERTAR
    public void insertar(Libro libro) {
        raiz = insertarRec(raiz, libro);
    }

    private NodoArbol insertarRec(NodoArbol actual, Libro libro) {

        if (actual == null) {
            return new NodoArbol(libro);
        }

        if (libro.getCodigo() < actual.libro.getCodigo()) {
            actual.izquierda = insertarRec(actual.izquierda, libro);
        } else if (libro.getCodigo() > actual.libro.getCodigo()) {
            actual.derecha = insertarRec(actual.derecha, libro);
        }

        return actual;
    }

    // 🔹 BUSCAR
    public void buscar(int codigo) {
        NodoArbol resultado = buscarRec(raiz, codigo);

        if (resultado != null) {
            System.out.println("Libro encontrado: " + resultado.libro);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private NodoArbol buscarRec(NodoArbol actual, int codigo) {

        if (actual == null || actual.libro.getCodigo() == codigo) {
            return actual;
        }

        if (codigo < actual.libro.getCodigo()) {
            return buscarRec(actual.izquierda, codigo);
        }

        return buscarRec(actual.derecha, codigo);
    }

    // 🔹 RECORRIDO INORDEN
    public void inOrden() {
        System.out.println("\n===== LIBROS EN ORDEN (INORDEN) =====");
        inOrdenRec(raiz);
    }

    private void inOrdenRec(NodoArbol actual) {
        if (actual != null) {
            inOrdenRec(actual.izquierda);
            System.out.println(actual.libro);
            inOrdenRec(actual.derecha);
        }
    }
}
