/*
 Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Ej02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Collection<String> lista = new ArrayList();
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Ingrese una nueva raza de perro");
            lista.add(leer.next());
            System.out.println("Desea agragar otra raza?");
        } while ("Si".equalsIgnoreCase(leer.next()));

        lista.forEach((i) -> System.out.println(i));

        System.out.println("Ingrese la raza de perro que desea eliminar");
        String raza = leer.next();
        if (lista.contains(raza)) {
            lista.remove(raza);
            System.out.println("La raza fue removida");
        } else {
            System.out.println("Raza no encontrada");
        }

        lista.stream().sorted();
        lista.forEach((i) -> System.out.println(i));
    }

}
