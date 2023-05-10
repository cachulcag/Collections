/*
 Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Ej02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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

        System.out.println("Ingrese la raza de perro que desea buscar");
        String raza = leer.next();
        
        Iterator it = lista.iterator();
        while(it.hasNext()){
            if(it.next().equals(raza)){
                it.remove();
                System.out.println("La raza fue removida");
            }
        }
        Collections.sort(lista);
        System.out.println(lista);
        
    }

}
