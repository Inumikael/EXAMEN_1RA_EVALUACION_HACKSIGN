/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author HackSign
 */
public class Clases_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Integrantes
        DatosIntegrantes datos = new DatosIntegrantes();
        datos.imprimirDatosEquipo();
        DatosIntegrantes resultados = new DatosIntegrantes();
        resultados.imprimirProblemasResueltos();
         // Película
        Pelicula pelicula = new Pelicula("Deadpool 3", "Marvel", 18);
        pelicula.imprimirDatos();
        pelicula.evaluarEdad(18);
        //Test Covid
        TestCovid persona = new TestCovid(39, true, 82, 1.78);
        System.out.println("La persona tiene riesgo de COVID: " + persona.calcularPersonaRiesgo());
        // Fibonacci
        FIBONACCI fibon = new FIBONACCI();
        fibon.calcularResultado();
        FIBONACCI fibon2 = new FIBONACCI();
        fibon2.seta1(7);
        fibon2.seta2(15);
        fibon2.setn(25);
        fibon2.calcularResultado();
    }
}
      