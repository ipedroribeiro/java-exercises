/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciopoo09;

/**
 *
 * @author pdped
 */
public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Métodos personalizados 
    public String detalhes() {
        return "============ DETALHES DO LIVRO ============" + "\n Título: " + titulo + "\n Autor: " + 
                autor + "\n Total da páginas: " + totPaginas + "Página atual: " + 
                pagAtual + "Está aberto?" + aberto + 
                "\n Quem está lendo? " + leitor.getNome() + ", idade: " + 
                leitor.getIdade() + ", sexo: " + leitor.getSexo();
    }
    
    
    //Métodos especiais
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos abstratos
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        } else {
            this.pagAtual= p;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}
