/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.util.Scanner;

/**
 *
 * @author pdped
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
            String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            System.out.println("Insira o ano atual: ");
            int ano = sc.nextInt();
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
                dias[1] = 29;
            }
            for (int c = 0; c < mes.length; c++) {
                System.out.println ("O mês de " + mes[c] + " tem " + dias[c] + " dias.");
            }
    }
    
}
