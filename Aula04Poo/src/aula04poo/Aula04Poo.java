/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04poo;

/**
 *
 * @author pdped
 */
public class Aula04Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("MCFM", "Lilás", 0.25f);
        /* c1.setModelo("BIC");
        //c1.modelo = "BIC";
        
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " com a ponta tamanho " + c1.getPonta()); */
        c1.status();
        
        Caneta c2 = new Caneta("PPR", "Verde", 0.24f);
        c2.status();
    }
    
}
