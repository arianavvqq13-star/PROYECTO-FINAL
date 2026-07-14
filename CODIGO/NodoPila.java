
package Libreria;

public class NodoPila {

    String accion;
    NodoPila siguiente;

    public NodoPila(String accion) {
        this.accion = accion;
        this.siguiente = null;
    }
}
