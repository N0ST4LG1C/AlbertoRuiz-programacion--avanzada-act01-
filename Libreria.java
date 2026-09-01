import java.util.ArrayList;

public class Libreria {

    private ArrayList<Libro> catalogo;

    public Libreria() {
        this.catalogo = new ArrayList<>();
    }

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

    public void agregarLibro(Libro libro) {
        for (Libro libroExistente : catalogo) {
            if (libroExistente.getIsbn().equals(libro.getIsbn())) {
                System.out.println("Ya existe un libro con ese ISBN.");
                return;
            }
        }

        catalogo.add(libro);
        System.out.println("Libro agregado correctamente.");
    }

    public ArrayList<Libro> buscarPorTitulo(String titulo) {
    ArrayList<Libro> resultados = new ArrayList<>();

    for (Libro libro : catalogo) {
        if (libro.getTitulo().equalsIgnoreCase(titulo)) {
            resultados.add(libro);
        }
    }

    return resultados;
}

public ArrayList<Libro> buscarPorAutor(String nombreAutor) {
    ArrayList<Libro> resultados = new ArrayList<>();

    for (Libro libro : catalogo) {
        for (Autor autor : libro.getAutores()) {
            if (autor.getNombre().equalsIgnoreCase(nombreAutor)) {
                resultados.add(libro);
                break;
            }
        }
    }

    return resultados;
}

public void venderLibro(String isbn, Cliente cliente) {

    for (Libro libro : catalogo) {

        if (libro.getIsbn().equals(isbn)) {

            if (!libro.isDisponible()) {
                System.out.println("El libro no está disponible.");
                return;
            }

            cliente.agregarLibroComprado(libro);
            libro.setDisponible(false);

            System.out.println("Libro vendido correctamente a " + cliente.getNombre());
            return;
        }
    }

    System.out.println("No se encontró un libro con ese ISBN.");
}

}