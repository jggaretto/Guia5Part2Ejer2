/*
Basados en el ejemplo anterior, ahora nos piden que las Películas no deben repetirse en el Cine,
para ello en lugar de utilizar un ArrayList, utilizaremos un HashSet; pero ojo!!! Para que el
HashSet sepa cuando una Película está repetida, es decir, tienen el mismo título, bastará con
sobreescribir los métodos equals y hashCode en la clase Película.
 */
package guia5part2ejer2;

import java.util.Scanner;


public class Guia5Part2Ejer2 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Crear el cine
    Cine cine = new Cine("ROMA SRL", "Rivadavia 325");

    // Pedir al usuario que cree películas
    boolean crearOtraPelicula = true;
    while (crearOtraPelicula) {
        System.out.println("Ingrese los datos de la película:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Director: ");
        String director = scanner.nextLine();
        System.out.print("Duración (en horas): ");
        int duracion = Integer.parseInt(scanner.nextLine());

        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        cine.agregarPelicula(pelicula);

        System.out.print("¿Desea crear otra película? (s/n): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("n")) {
            crearOtraPelicula = false;
        }
    }

    // Pedir al Cine que liste las películas que duren más de x cantidad de horas
    System.out.print("Ingrese la cantidad de horas mínima: ");
    int horasMinimas = Integer.parseInt(scanner.nextLine());
    cine.listarDuranMas(horasMinimas);

    // Pedir al cine que liste todas las películas
    cine.listarTodo();

    // Pedir al cine que liste las películas ordenadas por título
    cine.listarOrdenadasPorTituloAZ();

    // Pedir al cine que liste las películas ordenadas por director
    cine.listarOrdenadasPorDirectorAZ();

    // Pedir al cine que liste las películas ordenadas por duración
    cine.listarMenorDuracionAMayor();

    scanner.close();
}
    }
    
