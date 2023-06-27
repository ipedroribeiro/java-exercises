/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12poo;

/**
 *
 * @author pdped
 */
public class Cachorro extends Mamifero {
    //Métodos personalizados
    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }
    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }
    
    //Métodos sobrepostos
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
    
}
