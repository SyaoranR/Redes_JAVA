/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_a1_02;

import java.util.Scanner;

/**
 *
 * @author Seed
 */
public class Aula_A1_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[3];
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("informe o "+(i+1)+" nome");
            nomes[i] = sc.next();
        }
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("o "+(i+1)+" nome foi "+nomes[i]); 
        }
        System.out.println("fim do laço");
            
        
      
    }
    
}
