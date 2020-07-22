/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_6;

import java.util.Scanner;

/**
 *
 * @author Aluno 
 */
public class Exemplo_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        String nomes[] = new String[4];
        
        for (int i = 0; i < nomes.length; i++) {
            //String name = names[i];
            System.out.println("Digite o " + (i + 1) + " nome");
            nomes[i] = read.next();
            System.out.println("Nomes[" + (i+1) + "]: " + nomes[i]);
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < nomes.length; i++) {
            //String nome = nomes[i];
            System.out.println("o " + (i+1) + " nome foi: " + nomes[i]);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("fim do laço");
    }
    
}
