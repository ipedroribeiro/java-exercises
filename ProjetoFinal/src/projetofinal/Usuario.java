/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetofinal;

/**
 *
 * @author pdped
 */
public class Usuario extends Pessoa {
    //Atributos
    private String login;
    private int totAssistido;
    
    //Construtor
    public Usuario(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //Métodos personalizados
    public void viuMaisUm() {
    
    }
    
    //Métodos especiais    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    //Métodos sobrepostos
    @Override
    public String toString() {
        return "Usuario{" +super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
    }
    

}
