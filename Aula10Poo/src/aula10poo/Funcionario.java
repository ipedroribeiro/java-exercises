/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10poo;

/**
 *
 * @author pdped
 */
public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Métodos personalizados
    public void mudaTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }
    
    //Métodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
