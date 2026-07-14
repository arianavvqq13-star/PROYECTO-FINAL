
package Libreria;
public class ColaPrestamos {

    private NodoCola frente;
    private NodoCola fin;

    // 🔹 ENCOLAR (agregar usuario)
    public void encolar(String usuario) {
        NodoCola nuevo = new NodoCola(usuario);

        if (frente == null) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }

        System.out.println("Usuario agregado a la cola de prestamos.");
    }

    // 🔹 DESENCOLAR (atender usuario)
    public void desencolar() {

        if (frente == null) {
            System.out.println("No hay usuarios en cola.");
            return;
        }

        System.out.println("Atendiendo a: " + frente.usuario);

        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }
    }

    // 🔹 MOSTRAR COLA
    public void mostrar() {

        System.out.println("\n===== COLA DE PRESTAMOS =====");

        if (frente == null) {
            System.out.println("No hay usuarios en espera.");
            return;
        }

        NodoCola temp = frente;

        while (temp != null) {
            System.out.println("- " + temp.usuario);
            temp = temp.siguiente;
        }
    }

    // 🔹 VER PRIMERO
    public void frente() {

        if (frente == null) {
            System.out.println("Cola vacia.");
        } else {
            System.out.println("Primero en ser atendido: " + frente.usuario);
        }
    }
}
