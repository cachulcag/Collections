/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej05;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author crist
 */
public class Services {

    TreeSet<String> conjuntoPaises = new TreeSet();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void ingresarPais() {
        do {
            System.out.println("Ingrese un país (no pueden repetirse)");
            conjuntoPaises.add(leer.next());

            System.out.println("DESEA AGREGAR OTRO PAÍS?"); 

        } while ("si".equalsIgnoreCase(leer.next()));

        conjuntoPaises.forEach((paises) -> {
            System.out.println(paises);
        });
    }

    public void buscarPaises() {
        System.out.println("Ingrese el país que desea eliminar");
        if(conjuntoPaises.removeIf(n -> (n.contentEquals(leer.next())))){
            System.out.println("País eliminado");
        }else
            System.out.println("País no encontrado");        
        conjuntoPaises.forEach((e) -> System.out.println(e));

    }
}
