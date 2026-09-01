public class Novela extends Libro {

    private String genero;

    public Novela(String titulo, String isbn, double precio, int añoPublicacion, String genero) {
        super(titulo, isbn, precio, añoPublicacion);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}

