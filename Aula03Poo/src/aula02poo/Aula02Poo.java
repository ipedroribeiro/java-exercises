/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02poo;

/**
 *
 * @author pdped
 */
public class Aula02Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; -- PONTA É UM ATRIBUTO PRIVADO
        c1.carga = 80;
        // c1.tampada = false; -- TAMPADA É UM ATRIBUTO PRIVADO
        c1.destampar();
        c1.status();
        
        c1.rabiscar();
        
    }
    
}
