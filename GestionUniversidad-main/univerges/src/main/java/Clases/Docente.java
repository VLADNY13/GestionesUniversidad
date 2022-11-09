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
public class Docente extends Persona{
    private String profesion;
    private Double Salario;
    private Double estatura;
    private Double peso;

    public Docente() {
    }

    public Docente(String profesion, Double Salario, Double estatura, Double peso) {
        this.profesion = profesion;
        this.Salario = Salario;
        this.estatura = estatura;
        this.peso = peso;
    }

    public Docente(String profesion, Double Salario, Double estatura, Double peso, Integer codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
        this.profesion = profesion;
        this.Salario = Salario;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double Salario) {
        this.Salario = Salario;
    }

    public Double getEstatura() {
        return estatura;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
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
    
    //METODOS ANALIZADORES
    
    public void calcularIMC(){
        Double imc=0.0;
        
        imc = this.getPeso()/(this.getEstatura()*this.getEstatura());
        
            if(imc >0 && imc < 18.5) System.out.println("IMC: "+imc + " Peso inferior al normal");
            if(imc >=18.5 && imc < 25 ) System.out.println("IMC: "+imc + " Peso normal");
            if(imc >= 25 && imc <30) System.out.println("IMC: "+imc + " Peso superior al normal");
            if(imc >= 30) System.out.println("IMC: "+imc + " Obesidad");
        
    }
}
