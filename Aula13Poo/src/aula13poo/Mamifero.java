/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13poo;

/**
 *
 * @author pdped
 */
public class Mamifero extends Animal {
    //Atributos
    protected String corPelo;
    
    //Métodos sobrepostos
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
    
}
