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
public class Administrativo extends Persona{
    private Integer añoIngreso;

    public Administrativo() {
    }

    public Administrativo(Integer añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    public Administrativo(Integer añoIngreso, Integer codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
        this.añoIngreso = añoIngreso;
    }

    public Integer getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(Integer añoIngreso) {
        this.añoIngreso = añoIngreso;
    }

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
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
    
    public void calcularAntiguedad(){
        Integer antiguedad= 2022 - this.getAñoIngreso();
        
        System.out.println("La antiguedad es de "+ antiguedad + " años");
    }
    
}
