import java.util.ArrayList;

// La clase Autor representa a un autor dentro del sistema de la librería.
public class Autor {

    private String nombre;
    private String nacionalidad;
    private ArrayList<Libro> libros;

    // Constructor: crea un nuevo autor con su nombre y nacionalidad.
    // La lista de libros comienza vacía.

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.libros = new ArrayList<>();
    }

      // Devuelve el nombre del autor.
    public String getNombre() {
        return nombre;
    }

     // Devuelve la nacionalidad del autor.
    public String getNacionalidad() {
        return nacionalidad;
    }

    // Devuelve la lista de libros asociados al autor.
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    
     // Agrega un libro a la lista de libros escritos por el autor.
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}
