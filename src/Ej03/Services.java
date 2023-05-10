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
    Scanner leer = new Scanner(System.in);

    public void crearAlumno() {
        String validacion;
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
            validacion = leer.next();

        } while ("si".equalsIgnoreCase(validacion));
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno que desea obtener el promedio");
        String nombre = leer.next();
        alumno.forEach(alumno -> {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(promedio(alumno.getNotas()));
            }else{
                System.out.println("Estudiante no encontrado");
            }
        });
    }

    public double promedio(ArrayList<Integer> notas) {
        int suma = 0;
        for (Integer nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }
}
