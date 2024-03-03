/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author hecto
 */
public class DatosIntegrantes {
    private static String nombreEquipo = "\nHackSign";
    private static String[] integrantes = {
        "23550339, Ingeniería en Sistemas Computacionales, Dulce Naomi, Pérez Franco",
        "23550356, Ingeniería en Sistemas Computacionales, Héctor Ernesto, Murguía García",
        "22550348, Ingeniería en Sistemas Computacionales, Fernando, González",
        "23550413, Ingeniería en Sistemas Computacionales, Emily, Sánchez", 
    };
    private static String[] problemasResueltos = {
        "Ejercicio 1: DATOS DEL EQUIPO",
        "Ejercicio 2: Pelicula",
        "Ejercicio 3: Contraseña",
        "Ejercicio 4: TestCovid",
        "Ejercicio 5: FIBONACCI\n"
    };
    public static void imprimirDatosEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("\nListado de integrantes:");
        System.out.println("No. Control, Carrera, Nombre, Apellidos");
        for (String integrante : integrantes) {
            String[] datos = integrante.split(", ");
            System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2] + ", " + datos[3]);
        }
    }
    
    public static void imprimirProblemasResueltos() {
        System.out.println("\nListado de problemas resueltos:");
        for (int i = 0; i < problemasResueltos.length; i++) {
            System.out.println((i + 1) + ". " + problemasResueltos[i]);
        }
    }
}
