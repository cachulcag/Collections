/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej04;

import java.util.Collections;

/**
 *
 * @author crist
 */
public class Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Services servicios = new Services();
        
        servicios.crearPelicula();
        servicios.mostrarPeliculas();
        servicios.mayor1();
        servicios.mayorMenor();
        servicios.menorMayor();
        servicios.ordenPorDirector();
        servicios.ordenPorTitulo();
        
    }
    
}
