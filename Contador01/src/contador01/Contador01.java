/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author pdped
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 1;
        while (cc <= 20) {
            cc++;
            if (cc == 2 || cc == 5 || cc == 10 || cc == 15) {
                continue;
            }
            if ( cc == 7) {
                break;
            }
            System.out.println("CAMBALHOTA!" + cc);
        }
    }
    
}
