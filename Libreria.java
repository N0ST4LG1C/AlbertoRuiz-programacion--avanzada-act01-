import java.util.ArrayList;


// La clase Libreria administra el catálogo y las operaciones principales del sistema.
public class Libreria {

    // Lista de libros disponibles y registrados en la librería.
    private ArrayList<Libro> catalogo;

     // Constructor: crea una librería con un catálogo vacío.
    public Libreria() {
        this.catalogo = new ArrayList<>();
    }

     // Devuelve el catálogo completo de libros.
    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

     // Agrega un libro al catálogo.
    // Antes de agregarlo, verifica que no exista otro con el mismo ISBN.
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

     // Busca libros cuyo título coincida con el título ingresado.
    // La comparación ignora diferencias entre mayúsculas y minúsculas.
    public ArrayList<Libro> buscarPorTitulo(String titulo) {
    ArrayList<Libro> resultados = new ArrayList<>();

    for (Libro libro : catalogo) {
        if (libro.getTitulo().equalsIgnoreCase(titulo)) {
            resultados.add(libro);
        }
    }

    return resultados;
}

  // Busca libros asociados a un autor específico.
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

 // Vende un libro utilizando su ISBN y el cliente que realiza la compra.
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

      // Este mensaje se muestra si ningún libro del catálogo tiene ese ISBN.
    System.out.println("No se encontró un libro con ese ISBN.");
}

}
