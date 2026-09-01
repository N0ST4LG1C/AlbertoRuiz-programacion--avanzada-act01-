import java.util.ArrayList;


// La clase Libro representa la estructura base de cualquier libro del sistema.
public class Libro { 

    private String titulo;
    private String isbn;
    private double precio;
    private int añoPublicacion;
    private boolean disponible;
    private ArrayList<Autor> autores;


     // Constructor: inicializa los datos principales del libro.
    // Todo libro nuevo comienza disponible y con una lista de autores vacía.
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

        // Permite cambiar el estado de disponibilidad del libro.
        public void setDisponible(boolean disponible) {
            this.disponible = disponible;
        }  

        // Devuelve la lista de autores asociados al libro.
                public ArrayList<Autor> getAutores() {
                    return autores;
                }

                   // Agrega un autor a la lista de autores del libro.
                public void agregarAutor(Autor autor) {
                    autores.add(autor);
                }

 }
