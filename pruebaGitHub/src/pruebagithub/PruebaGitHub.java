/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagithub;

/**
 * 
 * @author MR
 */
public class PruebaGitHub {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private int edad;
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Esto es una prueba de GitHub");
        // otro cambio
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }
}

