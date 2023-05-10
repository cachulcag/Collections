/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Ej01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String i;

        do {
            System.out.println("Ingrese una nueva raza de perro");
            lista.add(leer.next());
            System.out.println("Desea agragar otra raza?");
            i = leer.next();
        } while ("Si".equalsIgnoreCase(i));

        System.out.println(lista);

    }

}
