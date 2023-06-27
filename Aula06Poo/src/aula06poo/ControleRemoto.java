/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula06poo;

/**
 *
 * @author pdped
 */
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;        
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Sobrescrevendo os métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    
    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("_____ MENU _____");
            System.out.println("Está ligado? " + this.getTocando());
            System.out.println("Está tocando? " + this.getTocando());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 1; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
        } else if (!(this.getLigado())) {
            System.err.println("Erro: o controle está desligado.");
        }     
    }

    @Override
    public void fecharMenu() {
        System.out.print(System.lineSeparator());
        if (!(this.getLigado())) {
            System.err.println("Erro: o controle está desligado.");
        } else if (this.getLigado()) {
            System.out.println("Fechando MENU...");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        } else {
            System.err.println("Impossível aumentar volume.");
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        } else {
            System.err.println("Impossível diminuir volume.");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        } else {
            System.err.println("Erro: Não consegui reproduzir.");
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.err.println("Erro: Não consegui pausar.");
        }
    }
    
}








