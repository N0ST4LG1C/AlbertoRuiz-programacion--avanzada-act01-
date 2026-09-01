public class LibroTexto extends Libro {
    
    private String nivelEducativo;

    public LibroTexto(String titulo, String isbn, double precio, int añoPublicacion, String nivelEducativo) {
        super(titulo, isbn, precio, añoPublicacion);
        this.nivelEducativo = nivelEducativo;

    }

     public String getNivelEducativo() {
        return nivelEducativo;
    }

}
