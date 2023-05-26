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

import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Services servicio = new Services();

        Scanner leer = new Scanner(System.in);
        boolean i = true;

        do {
            System.out.println("Bienvenido a su inventario de productos");
            System.out.println("Que desea hacer:");
            System.out.println("Ingresar Productos (1)");
            System.out.println("Modificar Precio (2)");
            System.out.println("Eliminar Productos (3)");
            System.out.println("Mostrar Productos (4)");
            System.out.println("Salir (5)");

            switch (leer.nextInt()) {
                case 1:
                    servicio.ingresarProducto();
                    break;
                case 2:
                    servicio.modificarPrecio();
                    break;
                case 3:
                    servicio.eliminarProducto();
                    break;
                case 4:
                    servicio.mostrar();
                    break;
                case 5:
                    i = false;
                default:
                    System.out.println("Opción no encontrada");
            }
        } while (i);
    }

}
