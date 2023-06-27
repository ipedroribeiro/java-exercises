/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciopoo09;

/**
 *
 * @author pdped
 */
public class ExercicioPoo09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa[2]; 
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 19, "M");
        p[1] = new Pessoa("Clara", 17, "F");
        
        l[0] = new Livro("Cabeça fria, coração quente", "Abel Ferreira", 200, p[0]);
        l[1] = new Livro("É assim que começa", "Collen", 230, p[1]);
        l[2] = new Livro("É assim que acaba", "Collen", 200, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        
        System.out.println(l[1].detalhes());
    } 
    
}
