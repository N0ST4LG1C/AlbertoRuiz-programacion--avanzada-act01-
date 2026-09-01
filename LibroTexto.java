
// La clase LibroTexto representa un tipo específico de Libro.
// Hereda todos los atributos y métodos definidos en la clase Libro.

public class LibroTexto extends Libro {
    
    private String nivelEducativo;

     // Constructor: inicializa los atributos heredados de Libro
    // y además establece el nivel educativo.
    public LibroTexto(String titulo, String isbn, double precio, int añoPublicacion, String nivelEducativo) {
        super(titulo, isbn, precio, añoPublicacion);
        this.nivelEducativo = nivelEducativo;

    }

     // Devuelve el nivel educativo del libro.
     public String getNivelEducativo() {
        return nivelEducativo;
    }

}
