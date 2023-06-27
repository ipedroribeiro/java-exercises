/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13poo;

/**
 *
 * @author pdped
 */
public class Cachorro extends Lobo {
    //Métodos sobrepostos
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }
    
    //Métodos personalizados <--- SOBRECARGA
    public void reagir(String frase) {
       if (frase.equals("Toma comida") || frase.equals("Olá")) {
           System.out.println("Abanando e latindo");   
       } else {
           System.out.println("Rosnando");
       }
    }
    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Abanando o rabo");
        } else if (hora >= 18) {
            System.out.println("Ignorando");
        } else {
            System.out.println("Abanando e latindo");
        }
    }
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Abanando o rabo");
        } else {
            System.out.println("Rosnando e latindo");
            this.emitirSom();
        }
    }
    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanando");
            } else {
                System.out.println("Latindo");
            }
        } else {
           if (peso < 10) {
               System.out.println("Rosnar");
           } else {
               System.out.println("Ignorando");
           } 
        }
    }
    
}












