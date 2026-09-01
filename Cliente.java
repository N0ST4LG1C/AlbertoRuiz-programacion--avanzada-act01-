import java.util.ArrayList;
// La clase Cliente representa a una persona que compra libros en la librería.
public class Cliente {

    private String nombre;
    private String id;
    private ArrayList<Libro> librosComprados;


    // Constructor: crea un cliente con nombre e ID.
    // La lista de libros comprados comienza vacía.
    public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosComprados = new ArrayList<>();
    }
     // Devuelve el nombre del cliente.
    public String getNombre() {
        return nombre;
    }
    // Devuelve el ID del cliente.
    public String getId() {
        return id;
    }
     // Devuelve la lista de libros comprados por el cliente.
    public ArrayList<Libro> getLibrosComprados() {
        return librosComprados;
    }
     // Agrega un libro a la lista de compras del cliente.
    public void agregarLibroComprado(Libro libro) {
        librosComprados.add(libro);
    }
}
