/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciopoo02;

/**
 *
 * @author pdped
 */
public class ExercicioPoo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Livro l = new Livro();
        
        l.titulo = "Bora estudar! Java";
        l.editora = "programa-dores";
        l.edicao = 2;
        l.ano = 2018;
        l.autor = "Neymar Júnior";
        l.tipoCapa = "Capa Dura";
        l.qtDeFolhas = 1000;
        l.ISBN = "6482746523897";
        l.idioma = "Português";
        
        l.abrir();
        l.estudar();
        System.out.println("**********STATUS**********");
        l.status();
        System.out.println("**************************");
        l.anotar();
        
    }
    
}
