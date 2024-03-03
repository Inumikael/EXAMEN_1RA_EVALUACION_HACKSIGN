/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;
import java.util.Scanner;
/**
 *
 * @author hackSign
 */
public class TestCovid {
    // Atributos
    private int edad;
    private boolean tieneEnfermedadCronica;
    private double peso;
    private double estatura;

    // Constructor
    public TestCovid(int edad, boolean tieneEnfermedadCronica, double peso, double estatura) {
        this.edad = edad;
        this.tieneEnfermedadCronica = tieneEnfermedadCronica;
        this.peso = peso;
        this.estatura = estatura;
    }

    // Métodos Set
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTieneEnfermedadCronica(boolean tieneEnfermedadCronica) {
        this.tieneEnfermedadCronica = tieneEnfermedadCronica;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    // Métodos Get
    public int getEdad() {
        return edad;
    }

    public boolean isTieneEnfermedadCronica() {
        return tieneEnfermedadCronica;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    // Método privado para calcular el índice de masa corporal (IMC)
    private double calcularIMC() {
        return peso / (estatura * estatura);
    }

    // Método para calcular si la persona tiene riesgo de enfermarse gravemente por COVID
    public String calcularPersonaRiesgo() {
        if (tieneEdadMayor65() || tieneEnfermedadCronica || tieneObesidad()) {
            return "PERSONA DE RIESGO";
        } else {
            return "PERSONA SIN RIESGO";
        }
    }

    // Método auxiliar para verificar si la persona tiene obesidad
    private boolean tieneObesidad() {
        double imc = calcularIMC();
        return imc > 30;
    }

    // Método auxiliar para verificar si la persona tiene 65 años o más
    private boolean tieneEdadMayor65() {
        return edad >= 65;
    }
}
    