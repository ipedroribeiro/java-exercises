/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11poo;

/**
 *
 * @author pdped
 */
public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos personalizados 
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome() + ".");
    }
    
    //Métodos especiais
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
