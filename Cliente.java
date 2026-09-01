import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String id;
    private ArrayList<Libro> librosComprados;

    public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.librosComprados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Libro> getLibrosComprados() {
        return librosComprados;
    }

    public void agregarLibroComprado(Libro libro) {
        librosComprados.add(libro);
    }
}