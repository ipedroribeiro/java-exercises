/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12poo;

/**
 *
 * @author pdped
 */
public class Ave extends Animal {
    //Atributos
    private String corPena;
    
    //Métodos personalizados
    public void fazerNinho() {
        System.out.println("Fazendo ninho");
    }
    
    //Métodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    
    //Métodos especiais
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
}
