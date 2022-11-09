/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Bayron Vargas
 */
public class Prueba {
    public static void main(String[] args) {
        Docente docente = new Docente("Ing Sistemas", 500.0, 1.54, 70.0 , 1151800, "Pedro", "Pascal");
        docente.calcularIMC();
        
        Carrera car= new Carrera ("115", "Ing Sistemas", 164);
        Estudiante est = new Estudiante(car, 9, 148, 443534, "Oscar", "Velasquez");
        
        est.matricularProyecto();
        
        Administrativo admin = new Administrativo(2009, 1151842, "Hector", "Arley");
        admin.calcularAntiguedad();
    }
}
