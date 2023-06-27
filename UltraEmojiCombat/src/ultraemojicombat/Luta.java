/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;

import java.util.Random;

/**
 *
 * @author pdped
 */
public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos personalizados
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        if (this.aprovada) {
            System.out.println("-----------------------------------------------------------");
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0, 1 ou 2.
            System.out.println("========RESULTADO DA LUTA========");
            switch(vencedor) {
                case 0 -> {
                    // Empate
                    System.out.println("Temos um empate!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                }
                case 1 -> {
                    // Desafiado vence
                    System.out.println("E a vitória vai para o lutador " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                }
                case 2 -> {
                    // Desafiante vence
                    System.out.println("E a vitória vai para o lutador " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                }                
            }
            System.out.println("=================================");
        } else {
            System.out.println("Aluta não pode acontecer!");
        }
    }
    
    //Métodos especiais
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador dt) {
        this.desafiante = dt;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rd) {
        this.rounds = rd;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean ap) {
        this.aprovada = ap;
    }
    
}
