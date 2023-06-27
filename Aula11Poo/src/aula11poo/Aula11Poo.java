/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11poo;

/**
 *
 * @author pdped
 */
public class Aula11Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Pessoa p1 = new Pessoa();   <-- Essa linha não funciona pois a classe Pessoa é abstrata.
        /* Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(19);
        v1.setSexo("M");
        System.out.println(v1.toString()); */
        
        Aluno a1 = new Aluno();
        a1.setNome("Clara");
        a1.setMatricula(1111);
        a1.setCurso("Publicidade e Propaganda");
        a1.setIdade(17);
        a1.setSexo("F");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(2222);
        b1.setNome("Paulo");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        
    }
    
}
