/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Ej04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList();

    public void crearPelicula() {
        String validacion;
        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el título de la película");
            pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el autor");
            pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion");
            pelicula.setDuracion(leer.nextDouble());

            peliculas.add(pelicula);

            System.out.println("DESEA GUARDAR UNA NUEVA PELICULA?");
            validacion = leer.next();

        } while ("si".equalsIgnoreCase(validacion));

    }

    public void mostrarPeliculas() {
        System.out.println("Aquí se muestran la lista de películas");
        System.out.println("");
        peliculas.forEach((pelicula) -> {
            System.out.println(pelicula.toString());
        });
        System.out.println("----------------------");
    }

    public void mayor1() {
        System.out.println("A continuación se muestan las peliculas con duración mayor a una hora:");
        peliculas.forEach((pelicula) -> {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            } else {
                System.out.println("no hay peliculas que duren más de una hora");
            }
        });
        System.out.println("----------------------------------");
    }

    public void mayorMenor() {
        peliculas.sort(Comparator.comparing(Pelicula :: getDuracion));
        System.out.println("El orden según la duracion de mayor a menor sería: ");
        mostrarPeliculas();
    }

    public void menorMayor(){
        Collections.sort(peliculas, Comparator.comparing(Pelicula :: getDuracion).reversed());
        System.out.println("El orden según la duración de menor a mayor sería: ");
        mostrarPeliculas();
    }
    
    public void ordenPorTitulo(){
        peliculas.sort(Comparator.comparing(Pelicula :: getTitulo));
        System.out.println("Orden según el título");
        mostrarPeliculas();
    }
    
    public void ordenPorDirector(){
        Collections.sort(peliculas, Comparator.comparing(Pelicula :: getDirector));
        System.out.println("Orden según el director");
        mostrarPeliculas();
    }
}
