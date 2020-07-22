/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_4;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exemplo_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        System.out.println("exemplo_4.Exemplo_4.main()");
        int n = 0, m = 0;
        int vetor [] = new int[n];
        int [] trem = new int[m];
        int k = 0;
        String[] nomes = new String[3];
        nomes[0] = "Marcos";
        nomes[1] = "Augusto";
        nomes[2] = "Santos";
        System.out.println("Primeiro nome e " + nomes[0]);
        System.out.println("Segundo nome e " + nomes[1]);
        System.out.println("Terceiro nome e " + nomes[2]);
        System.out.println("Digite o primeiro nome ");
        nomes[0] = leia.next();
        System.out.println("Digite o segundo nome ");
        nomes[1] = leia.next();
        System.out.println("Digite o terceiro nome ");
        nomes[2] = leia.next();
        
        
        System.out.println("Digite a quantidade de nomes 'k' ");
        k = leia.nextInt();
        String names[] = new String[k];
        //String names[] = new String[2];
        for (int i = 0; i < names.length; i++) {
            //String name = names[i];
            System.out.println("Digite o " + (i + 1) + " nome");
            names[i] = leia.next();
        }
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < names.length; i++) {
            //String nome = nomes[i];
            System.out.println("o " + (i+1) + " nome foi: " + names[i]);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("fim do laço");
    }
    
}
