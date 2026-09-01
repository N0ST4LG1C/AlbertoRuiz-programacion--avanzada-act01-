import java.util.ArrayList;

public class Libro { 

    private String titulo;
    private String isbn;
    private double precio;
    private int añoPublicacion;
    private boolean disponible;
    private ArrayList<Autor> autores;

        public Libro(String titulo, String isbn, double precio, int añoPublicacion) {
            this.titulo = titulo; 
            this.isbn = isbn;
            this.precio = precio;
            this.añoPublicacion = añoPublicacion;
            this.disponible = true;
            this.autores = new ArrayList<>();
        }

        public String getTitulo(){
            return titulo;
        }

        public String getIsbn(){
            return isbn;
        }

        public double getPrecio(){
            return precio;
        }

        public int getAñoPublicacion(){
            return añoPublicacion;
        }

        public boolean isDisponible(){
            return disponible;
        }

        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }  

                public ArrayList<Autor> getAutores() {
                    return autores;
                }

                public void agregarAutor(Autor autor) {
                    autores.add(autor);
                }

 }