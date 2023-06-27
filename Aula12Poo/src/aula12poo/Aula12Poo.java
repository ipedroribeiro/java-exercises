/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12poo;

/**
 *
 * @author pdped
 */
public class Aula12Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Animal n = new Animal();  <-- Impossível criar um objeto da classe "Animal" pois a classe é abstrata.
        /* Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(85.3f);
        m.setIdade(2);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho(); */
        
        Mamifero m1 = new Mamifero();
        Canguru c1 = new Canguru();
        Cachorro k1 = new Cachorro();
        
        m1.setPeso(5.70f);
        m1.setIdade(8);
        m1.setMembros(4);
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        
        c1.setPeso(55.30f);
        c1.setIdade(3);
        c1.setMembros(4);
        c1.locomover();
        c1.alimentar();
        c1.emitirSom();
        c1.usarBolsa();
        
        k1.setPeso(3.94f);
        k1.setIdade(5);
        k1.setMembros(4);
        k1.locomover();
        k1.alimentar();
        k1.emitirSom();
        k1.abanarRabo();
        k1.enterrarOsso();
    }
    
}
