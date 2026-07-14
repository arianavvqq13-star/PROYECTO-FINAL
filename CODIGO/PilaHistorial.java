
package Libreria;


public class PilaHistorial {

    private NodoPila tope;

    // 🔹 PUSH (agregar acción)
    public void push(String accion) {
        NodoPila nuevo = new NodoPila(accion);

        nuevo.siguiente = tope;
        tope = nuevo;

        System.out.println("Accion registrada en historial.");
    }

    // 🔹 POP (eliminar última acción)
    public void pop() {
        if (tope == null) {
            System.out.println("Historial vacio.");
            return;
        }

        System.out.println("Se elimino: " + tope.accion);
        tope = tope.siguiente;
    }

    // 🔹 MOSTRAR PILA
    public void mostrar() {
        System.out.println("\n===== HISTORIAL DE OPERACIONES =====");

        if (tope == null) {
            System.out.println("No hay historial.");
            return;
        }

        NodoPila temp = tope;

        while (temp != null) {
            System.out.println("- " + temp.accion);
            temp = temp.siguiente;
        }
    }

    // 🔹 PEEK (ver última acción)
    public void cima() {
        if (tope == null) {
            System.out.println("Historial vacio.");
        } else {
            System.out.println("Ultima accion: " + tope.accion);
        }
    }
}