package sistema_biblioteca; 
import java.util.Scanner;
import Libreria.*;


public class Sistema_Biblioteca {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Estructuras
        ArreglosBiblioteca arreglos = new ArreglosBiblioteca();
        ListaEnlazadaLibros lista = new ListaEnlazadaLibros();
        PilaHistorial pila = new PilaHistorial();
        ColaPrestamos cola = new ColaPrestamos();
        ArbolLibros arbol = new ArbolLibros();

        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1. Arreglos (Categorias)");
            System.out.println("2. Lista de Libros");
            System.out.println("3. Historial (Pila)");
            System.out.println("4. Prestamos (Cola)");
            System.out.println("5. Busqueda (Arbol)");
            System.out.println("6. Salir");
            System.out.print("Seleccione opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                // ARREGLOS
                case 1:
                    System.out.println("\n1. Categorias");
                    System.out.println("2. Estanteria");
                    System.out.print("Opcion: ");
                    int opA = sc.nextInt();

                    if (opA == 1) {
                        arreglos.mostrarCategorias();
                        pila.push("Se visualizaron categorias");
                    } else if (opA == 2) {
                        arreglos.mostrarEstanteria();
                        pila.push("Se visualizo estanteria");
                    }
                    break;

                // LISTA ENLAZADA
                case 2:
                    System.out.println("\n1. Agregar libro");
                    System.out.println("2. Mostrar libros");
                    System.out.println("3. Buscar libro");
                    System.out.println("4. Eliminar libro");
                    System.out.print("Opcion: ");
                    int opL = sc.nextInt();

                    switch (opL) {

                        case 1:
                            System.out.print("Codigo: ");
                            int c = sc.nextInt();
                            sc.nextLine();

                            System.out.print("Titulo: ");
                            String t = sc.nextLine();

                            System.out.print("Autor: ");
                            String a = sc.nextLine();

                            Libro libro = new Libro(c, t, a);
                            lista.agregarLibro(libro);
                            arbol.insertar(libro);

                            pila.push("Se agrego libro: " + t);
                            break;

                        case 2:
                            lista.mostrarLibros();
                            break;

                        case 3:
                            System.out.print("Codigo a buscar: ");
                            int cb = sc.nextInt();
                            lista.buscarLibro(cb);
                            break;

                        case 4:
                            System.out.print("Codigo a eliminar: ");
                            int ce = sc.nextInt();
                            lista.eliminarLibro(ce);
                            pila.push("Se elimino libro codigo: " + ce);
                            break;
                    }
                    break;

                // PILA
                case 3:
                    pila.mostrar();
                    break;

                // COLA
                case 4:
                    System.out.println("\n1. Solicitar prestamo");
                    System.out.println("2. Atender prestamo");
                    System.out.println("3. Mostrar cola");
                    System.out.print("Opcion: ");
                    int opC = sc.nextInt();

                    switch (opC) {

                        case 1:
                            sc.nextLine();
                            System.out.print("Nombre usuario: ");
                            String u = sc.nextLine();

                            cola.encolar(u);
                            pila.push("Usuario en cola: " + u);
                            break;

                        case 2:
                            cola.desencolar();
                            pila.push("Se atendio un prestamo");
                            break;

                        case 3:
                            cola.mostrar();
                            break;
                    }
                    break;

                // ARBOL
                case 5:
                    System.out.println("\n1. Buscar libro");
                    System.out.println("2. Mostrar arbol (InOrden)");
                    System.out.print("Opcion: ");
                    int opAr = sc.nextInt();

                    if (opAr == 1) {
                        System.out.print("Codigo: ");
                        int ca = sc.nextInt();
                        arbol.buscar(ca);
                    } else if (opAr == 2) {
                        arbol.inOrden();
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }

        } while (opcion != 6);

        sc.close();
    }
}