/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class Services {

    ArrayList<Integer> notas = new ArrayList();
    ArrayList<Alumno> alumno = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    boolean confirmacion;

    public void crearAlumno() {
        do {
            Alumno estudiante = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            estudiante.setNombre(leer.next());

            System.out.println("Ingrese la notas");
            for (int i = 0; i < 3; i++) {
                notas.add(leer.nextInt());
            }

            estudiante.setNotas(notas);
            alumno.add(estudiante);

            System.out.println("desea ingresar otro estudiante?");

        } while ("si".equalsIgnoreCase(leer.next()));
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno que desea obtener el promedio");

        alumno.forEach((Alumno i) -> {
            if (i.getNombre().contentEquals(leer.next())) {
                confirmacion = false;
                System.out.println((i.getNotas().stream().map(nota -> nota).reduce(0, Integer::sum)) / notas.size());
            }
        });

        if (confirmacion) {
            System.out.println("no se encontró el estudiante");
        }

    }

}
