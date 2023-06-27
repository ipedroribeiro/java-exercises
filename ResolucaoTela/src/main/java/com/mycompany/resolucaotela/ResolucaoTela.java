/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author pdped
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension size= Toolkit.getDefaultToolkit().getScreenSize();
        
        int largura = (int)size.getWidth();
        int altura = (int)size.getHeight();
        
        System.out.println("Sua resolução é de :" + " " + largura+ "X"+ altura);
       
    }
}
