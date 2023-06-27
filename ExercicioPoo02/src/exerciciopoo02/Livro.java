/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciopoo02;

/**
 *
 * @author pdped
 */
public class Livro {
    String titulo;
    String editora;
    int edicao;
    int ano;
    String autor;
    String tipoCapa;
    int qtDeFolhas;
    String ISBN;
    String idioma;
    boolean aberto;
    
    void status() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Editora: " + this.editora);
        System.out.println("Edição: " + this.edicao);
        System.out.println("Ano: " + this.ano);
        System.out.println("Tipo da capa: " + this.tipoCapa);
        System.out.println("Quantidade de folhas: " + this.qtDeFolhas);
        System.out.println("ISBN: " + this.ISBN);
        System.out.println("Idioma: " + this.idioma);
        if (aberto) {
            System.out.println("O livro está aberto.");
        } else {
            System.out.println("O livro está fechado.");
        }
    }
    
    void estudar() {
        if (this.aberto == false) {
            System.out.println("Você não pode estudar, o livro esta fechado.");
        } else {
            System.out.println("Bons estudos!");
        }
    }
    
    void abrir() {
        this.aberto = true;
    }
    
    void fechar() {
        this.aberto = false;
    }
    
    void anotar() {
        if (this.aberto == false) {
            System.out.println("Você precisa abrir o livro para poder anotar...");
        } else {
            System.out.println("Anotando");
        }
    }
}
