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
public class Estudiante extends Persona{
    private Carrera carrera;
    private Integer semActual;
    private Integer numCreditos;
    
    public Estudiante() {
    }

    public Estudiante(Carrera carrera, Integer semActual, Integer numCreditos) {
        this.carrera = carrera;
        this.semActual = semActual;
        this.numCreditos = numCreditos;
    }

    public Estudiante(Carrera carrera, Integer semActual, Integer numCreditos, Integer codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
        this.carrera = carrera;
        this.semActual = semActual;
        this.numCreditos = numCreditos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Integer getSemActual() {
        return semActual;
    }

    public void setSemActual(Integer semActual) {
        this.semActual = semActual;
    }

    public Integer getNumCreditos() {
        return numCreditos;
    }

    public void setNumCreditos(Integer numCreditos) {
        this.numCreditos = numCreditos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void matricularProyecto(){
        Boolean puede= (this.getNumCreditos()>(this.getCarrera().getCreditos()*0.9));
        if(puede){
            System.out.println("Estudiante "+ this.getNombre()+" ya puede matricular proyecto de grado :)" );
        } else{
            System.out.println("Estudiante "+ this.getNombre()+" creditos insuficientes para matricular proyecto de grado" );
        }
    }
    
}
