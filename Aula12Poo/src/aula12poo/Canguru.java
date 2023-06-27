/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12poo;

/**
 *
 * @author pdped
 */
public class Canguru extends Mamifero {
    //Métodos personalizados
    public void usarBolsa() {
        System.out.println("Usando bolsa");
    }
    
    //Métodos sobrepostos
    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
}
