import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();

        // Datos iniciales mínimos para poder probar búsquedas y ventas

// =========================
// Autores de cada libro
// =========================

Autor rayBradbury = new Autor("Ray Bradbury", "Estadounidense");
Autor hughHowey = new Autor("Hugh Howey", "Estadounidense");
Autor frankHerbert = new Autor("Frank Herbert", "Estadounidense");
Autor williamGibson = new Autor("William Gibson", "Canadiense");
Autor sophieLovell = new Autor("Sophie Lovell", "Britanica");
Autor jeanJullien = new Autor("Jean Jullien", "Frances");
Autor michaelOchs = new Autor("Michael Ochs", "Estadounidense");
Autor robertMartin = new Autor("Robert C. Martin", "Estadounidense");


// =========================
// Libros de cada autor
// =========================

Novela fahrenheit451 = new Novela(
        "Fahrenheit 451",
        "9781451673319",
        45000,
        1953,
        "Ciencia Ficcion"
);

Novela theSilo = new Novela(
        "The Silo",
        "9780358447832",
        52000,
        2011,
        "Ciencia Ficcion"
);

Novela dune = new Novela(
        "Dune",
        "9780441172719",
        60000,
        1965,
        "Ciencia Ficcion"
);

Novela neuromancer = new Novela(
        "Neuromancer",
        "9780441569595",
        48000,
        1984,
        "Cyberpunk"
);

Libro dieterRams = new Libro(
        "Dieter Rams: As Little Design as Possible",
        "9780714849188",
        120000,
        2011
);

Libro jeanJullienBook = new Libro(
        "Jean Jullien",
        "9781838663192",
        95000,
        2022
);

Libro recordCovers = new Libro(
        "1000 Record Covers",
        "9783836545259",
        85000,
        2014
);

LibroTexto cleanCode = new LibroTexto(
        "Clean Code",
        "9780132350884",
        70000,
        2008,
        "Universidad"
);


// =========================
// Asociacíon de autores con sus libros
// =========================

fahrenheit451.agregarAutor(rayBradbury);
rayBradbury.agregarLibro(fahrenheit451);

theSilo.agregarAutor(hughHowey);
hughHowey.agregarLibro(theSilo);

dune.agregarAutor(frankHerbert);
frankHerbert.agregarLibro(dune);

neuromancer.agregarAutor(williamGibson);
williamGibson.agregarLibro(neuromancer);

dieterRams.agregarAutor(sophieLovell);
sophieLovell.agregarLibro(dieterRams);

jeanJullienBook.agregarAutor(jeanJullien);
jeanJullien.agregarLibro(jeanJullienBook);

recordCovers.agregarAutor(michaelOchs);
michaelOchs.agregarLibro(recordCovers);

cleanCode.agregarAutor(robertMartin);
robertMartin.agregarLibro(cleanCode);


// =========================
// Agregando libros al catálogo
// =========================

libreria.agregarLibro(fahrenheit451);
libreria.agregarLibro(theSilo);
libreria.agregarLibro(dune);
libreria.agregarLibro(neuromancer);
libreria.agregarLibro(dieterRams);
libreria.agregarLibro(jeanJullienBook);
libreria.agregarLibro(recordCovers);
libreria.agregarLibro(cleanCode);


// Cliente utilizado para las pruebas de compra
Cliente cliente = new Cliente("Alberto Ruiz", "C001");

        int opcion;

        do {

            System.out.println("\n===== SISTEMA DE LIBRERIA =====");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por titulo");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Vender libro");
            System.out.println("5. Mostrar catalogo");
            System.out.println("6. Mostrar libros comprados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                
                case 1:

    System.out.println("\n--- AGREGAR LIBRO ---");

    System.out.println("Tipo de libro:");
    System.out.println("1. Libro general");
    System.out.println("2. Novela");
    System.out.println("3. Libro de texto");
    System.out.print("Seleccione el tipo: ");

    int tipoLibro = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Titulo: ");
    String titulo = scanner.nextLine();

    System.out.print("ISBN: ");
    String isbn = scanner.nextLine();

    System.out.print("Precio: ");
    double precio = scanner.nextDouble();

    System.out.print("Año de publicacion: ");
    int año = scanner.nextInt();
    scanner.nextLine();

    Libro nuevoLibro;

    if (tipoLibro == 1) {

        nuevoLibro = new Libro(
                titulo,
                isbn,
                precio,
                año
        );

    } else if (tipoLibro == 2) {

        System.out.print("Genero: ");
        String genero = scanner.nextLine();

        nuevoLibro = new Novela(
                titulo,
                isbn,
                precio,
                año,
                genero
        );

    } else if (tipoLibro == 3) {

        System.out.print("Nivel educativo: ");
        String nivelEducativo = scanner.nextLine();

        nuevoLibro = new LibroTexto(
                titulo,
                isbn,
                precio,
                año,
                nivelEducativo
        );

    } else {

        System.out.println("Tipo de libro no valido.");
        break;
    }


    // Crear y asociar autor

    System.out.print("Nombre del autor: ");
    String nombreAutor = scanner.nextLine();

    System.out.print("Nacionalidad del autor: ");
    String nacionalidadAutor = scanner.nextLine();

    Autor nuevoAutor = new Autor(
            nombreAutor,
            nacionalidadAutor
    );

    nuevoLibro.agregarAutor(nuevoAutor);
    nuevoAutor.agregarLibro(nuevoLibro);


    // Agregar al catalogo

    libreria.agregarLibro(nuevoLibro);

    break;

                case 2:
                    System.out.print("Ingrese el titulo: ");
                    String tituloBusqueda = scanner.nextLine();

                    ArrayList<Libro> librosPorTitulo =
                            libreria.buscarPorTitulo(tituloBusqueda);

                    if (librosPorTitulo.isEmpty()) {
                        System.out.println("No se encontraron libros.");
                    } else {
                        for (Libro libro : librosPorTitulo) {
                            System.out.println(
                                    libro.getTitulo()
                                            + " | ISBN: "
                                            + libro.getIsbn()
                                            + " | Precio: $"
                                            + libro.getPrecio()
                            );
                        }
                    }

                    break;

                case 3:
                    System.out.print("Ingrese el nombre del autor: ");
                    String autorBusqueda = scanner.nextLine();

                    ArrayList<Libro> librosPorAutor =
                            libreria.buscarPorAutor(autorBusqueda);

                    if (librosPorAutor.isEmpty()) {
                        System.out.println("No se encontraron libros.");
                    } else {
                        for (Libro libro : librosPorAutor) {
                            System.out.println(
                                    libro.getTitulo()
                                            + " | ISBN: "
                                            + libro.getIsbn()
                            );
                        }
                    }

                    break;

                case 4:
                    System.out.print("Ingrese el ISBN del libro a vender: ");
                    String isbnVenta = scanner.nextLine();

                    libreria.venderLibro(isbnVenta, cliente);
                    break;

                case 5:
                    System.out.println("\n--- CATALOGO ---");

                    for (Libro libro : libreria.getCatalogo()) {
                        System.out.println(
                                libro.getTitulo()
                                    + " | ISBN: "
                                    + libro.getIsbn()
                                    + " | Disponible: "
                                    + libro.isDisponible()
                        );
                    }

                    break;

                case 6:
                    System.out.println("\n--- LIBROS COMPRADOS ---");

                    if (cliente.getLibrosComprados().isEmpty()) {
                        System.out.println("El cliente no ha comprado libros.");
                    } else {
                        for (Libro libro : cliente.getLibrosComprados()) {
                            System.out.println(libro.getTitulo());
                        }
                    }

                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}
