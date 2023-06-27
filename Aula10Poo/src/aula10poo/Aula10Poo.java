/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10poo;

/**
 *
 * @author pdped
 */
public class Aula10Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Paulo");
        p4.setNome("Clara");
        
        p1.setSexo("M");
        p4.setSexo("F");
        p2.setIdade(17);
        
        p2.setCurso("Publicidade e Propaganda");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        //Uma subclasse não pode utilizar métodos de outra subclasse
        //p1.receberAumento(550.64f);
        //p2.mudarTrabalho();
        //p4.cancelarMatr();
        
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
