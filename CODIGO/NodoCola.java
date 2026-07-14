
package Libreria;

public class NodoCola {

    String usuario;
    NodoCola siguiente;

    public NodoCola(String usuario) {
        this.usuario = usuario;
        this.siguiente = null;
    }
}