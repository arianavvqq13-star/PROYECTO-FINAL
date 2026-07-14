
package Libreria;

public class ArreglosBiblioteca {
 
    
 //Arreglo unidimensional
    
    private String []categorias={
      "Programacion",
      "Fantasia",
      "Matematica ",
      "Ficcion",
      
    };
    
  //Arreglo bidimensional 

     private String [][]estanteria={
        {"Java", "Python", "C++"},
        {"Cisco", "CCNA", "IPv6"},
        {"SQL", "Oracle", "MySQL"}
     };     


 public void mostrarCategorias() {
        System.out.println("\n===== CATEGORIAS DE LIBROS =====");

        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + ". " + categorias[i]);
        }
    }

    public void mostrarEstanteria() {
        System.out.println("\n===== ESTANTERIA DE LIBROS =====");

        for (int i = 0; i < estanteria.length; i++) {
            for (int j = 0; j < estanteria[i].length; j++) {
                System.out.printf("%-12s", estanteria[i][j]);
            }
            System.out.println();
        }
    }
}