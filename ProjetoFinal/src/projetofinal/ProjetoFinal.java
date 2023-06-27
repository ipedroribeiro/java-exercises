/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetofinal;

/**
 *
 * @author pdped
 */
public class ProjetoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Video v[] = new Video[3];
        v[0] = new Video("Casamento Pedro e Clara");
        v[1] = new Video("Festa do casamento - Pedro e Clara");
        v[2] = new Video("Bastidores do casamento - Pedro e Clara");
        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Pedro Paulo", 19, "M", "pedrookrb");
        u[1] = new Usuario("Maria Clara", 17, "F", "maariaxss");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(u[0], v[2]); //Pedro assiste os Bastidores
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao(u[0], v[1]); //Pedro assiste a Festa
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());
             
        
        /* System.out.println("VÍDEOS\n--------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\n USUÁRIOS \n -------------------------");
        System.out.println(e[0].toString());
        System.out.println(e[1].toString()); */
    }
    
}
