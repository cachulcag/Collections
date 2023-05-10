/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej03;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Alumno {
    private String Nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
    }

    public Alumno(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    

}
