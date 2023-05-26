/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Ej06;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author crist
 */
public class Services {

    Map<String, Double> productos = new TreeMap();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    boolean i = true;

    public void ingresarProducto() {
        String validacion;
        do {
            System.out.println("Ingrese un producto");
            String nombre = leer.next();
            System.out.println("Ingrese el precio");
            double costo = leer.nextDouble();
            productos.put(nombre, costo);

            System.out.println("DESEA AGREGAR OTRO PRODUCTO?");
            validacion = leer.next();

        } while ("si".equalsIgnoreCase(validacion));
    }

    public void modificarPrecio() {
        System.out.println("Que producto desea modificar?");
        String nombre = leer.next();
        
            if (productos.containsKey(nombre)) {
                System.out.println("Ingrese el precio nuevo");
                productos.replace(nombre, Double.NaN, leer.nextDouble());
                mostrar();
                i = false;
            }

        if (i) {
            System.out.println("No se encontró el producto");
        }
    }

    public void eliminarProducto() {
        System.out.println("Ingrese el producto que desea eliminar?");
        String nombre = leer.next();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        } else {
            System.out.println("No se encontró el producto");
        }

        mostrar();
    }

    public void mostrar() {
        System.out.println("La lista de productos es:");
        productos.entrySet().forEach((prodcuto) -> {
            System.out.println(prodcuto);
        });
    }
}
