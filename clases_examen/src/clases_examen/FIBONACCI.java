/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author HackSign
 */
class FIBONACCI {
    private int a1;
    private int a2;
    private int n;

    public FIBONACCI() {
        this.a1 = 1;
        this.a2 = 1;
        this.n = 6;
    }

    public int geta1() {
        return a1;
    }
    public void seta1(int a1) {
        this.a1 = a1;
    }
    public int geta2() {
        return a2;
    }
    public void seta2(int a2) {
        this.a2 = a2;
    }
    public int getn() {
        return n;
    }
    public void setn(int n) {
        this.n = n;
    }
    public void calcularResultado() {
        int actual;
        int anterior = a1;
        int nuevo = a2;

        System.out.println("Resultado Fibonacci ");
        System.out.print(anterior + " " + nuevo + " ");

        for (int i = 2; i < n; i++) {
            actual = anterior + nuevo;
            System.out.print(actual + " ");
            anterior = nuevo;
            nuevo = actual;
        }
        System.out.println("\n\n");
    }
}
