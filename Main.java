public class Main {

    public static void main(String[] args) {

        Libreria libreria = new Libreria();

        // =========================
        // Autores de cada libro
        // =========================

        Autor rayBradbury = new Autor("Ray Bradbury", "Estadounidense");
        Autor hughHowey = new Autor("Hugh Howey", "Estadounidense");
        Autor frankHerbert = new Autor("Frank Herbert", "Estadounidense");
        Autor williamGibson = new Autor("William Gibson", "Canadiense");

        Autor sophieLovell = new Autor("Sophie Lovell", "Británica");
        Autor jeanJullien = new Autor("Jean Jullien", "Francés");
        Autor michaelOchs = new Autor("Michael Ochs", "Estadounidense");

        Autor robertMartin = new Autor("Robert C. Martin", "Estadounidense");


        // =========================
        // Novelas (mayormente de ciencia ficción)
        // =========================

        Novela fahrenheit451 = new Novela(
                "Fahrenheit 451",
                "9781451673319",
                45000,
                1953,
                "Ciencia Ficción"
        );

        Novela theSilo = new Novela(
                "The Silo",
                "9780358447832",
                52000,
                2011,
                "Ciencia Ficción"
        );

        Novela dune = new Novela(
                "Dune",
                "9780441172719",
                60000,
                1965,
                "Ciencia Ficción"
        );

        Novela neuromancer = new Novela(
                "Neuromancer",
                "9780441569595",
                48000,
                1984,
                "Cyberpunk"
        );


        // =========================
        // Libros de Arte y Diseño
        // =========================

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


        // =========================
        // Libros de texto
        // =========================

        LibroTexto cleanCode = new LibroTexto(
                "Clean Code",
                "9780132350884",
                70000,
                2008,
                "Universidad"
        );


        // =========================
        // Asociación de autores y sus libros
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
        // Aquí se agregan los libros a la librería
        // =========================

        libreria.agregarLibro(fahrenheit451);
        libreria.agregarLibro(theSilo);
        libreria.agregarLibro(dune);
        libreria.agregarLibro(neuromancer);
        libreria.agregarLibro(dieterRams);
        libreria.agregarLibro(jeanJullienBook);
        libreria.agregarLibro(recordCovers);
        libreria.agregarLibro(cleanCode);


        // =========================
        // Creación de un cliente para realizar compras
        // =========================

        Cliente cliente1 = new Cliente(
                "Carlos Pérez",
                "C001"
        );


        // =========================
        // Se prubea buscar por título
        // =========================

        System.out.println("\n--- BÚSQUEDA POR TÍTULO ---");

        for (Libro libro : libreria.buscarPorTitulo("Dune")) {
            System.out.println(
                    libro.getTitulo() + " - $" + libro.getPrecio()
            );
        }


        // =========================
        // Se prueba buscar por autor
        // =========================

        System.out.println("\n--- BÚSQUEDA POR AUTOR ---");

        for (Libro libro : libreria.buscarPorAutor("William Gibson")) {
            System.out.println(libro.getTitulo());
        }


        // =========================
        // Se prueba el sistema de ventas
        // =========================

        System.out.println("\n--- VENTA ---");

        libreria.venderLibro(
                "9780441172719",
                cliente1
        );


        // =========================
        // Libros del cliente después de la compra
        // =========================

        System.out.println("\n--- LIBROS COMPRADOS ---");

        for (Libro libro : cliente1.getLibrosComprados()) {
            System.out.println(libro.getTitulo());
        }


        // =========================
        // Se comprueba la disponibilidad del libro después de la venta
        // =========================

        System.out.println(
                "\n¿Dune sigue disponible?: "
                        + dune.isDisponible()
        );
    }
}