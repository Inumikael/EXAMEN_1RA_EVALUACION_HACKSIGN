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
public class contrasenia {
    private String usuario;
    private String contrasenia;
    public contrasenia(){
        this.usuario = "usuario";
        this.contrasenia = "contrasenia";
    }
    public contrasenia(String usuario, String contrasenia) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    public void setusuario(String usuario) {
        this.usuario = usuario;
    }
    public void setcontrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    public boolean verificarAcceso(String usuario, String contrasena) {
        return this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia);
   }
    public void mostrarAcceso(String usuario, String contrasena) {
        if (verificarAcceso(usuario, contrasena)) {
            System.out.println("Login");
            System.out.println("¡Acceso permitido!");
        } else {
            System.out.println("Login");
            System.out.println("¡Acceso denegado!");
        }
    }

}
