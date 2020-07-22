/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_5;

import java.util.Scanner;

/**
 *
 * @author Aluno 
 */
public class Exemplo_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("exemplo_5.Exemplo_5.main()");
        int cont = 0;
        
        //String nomes [] = new String[15];
        
        /*
        System.out.println("Digite o [" + 1 + "] nome :");
        nomes[0] = sc.next();
        System.out.println("Digite o [" + 2 + "] nome :");
        nomes[1] = sc.next();
        System.out.println("Digite o [" + 3 + "] nome :");
        nomes[2] = sc.next();
        System.out.println("Digite o [" + 4 + "] nome :");
        nomes[3] = sc.next();
        System.out.println("Digite o [" + 5 + "] nome :");
        nomes[4] = sc.next();
        System.out.println("Digite o [" + 6 + "] nome :");
        nomes[5] = sc.next();
        System.out.println("Digite o [" + 7 + "] nome :");
        nomes[6] = sc.next();
        System.out.println("Digite o [" + 8 + "] nome :");
        nomes[7] = sc.next();
        System.out.println("Digite o [" + 9 + "] nome :");
        nomes[8] = sc.next();
        System.out.println("Digite o [" + 10 + "] nome :");
        nomes[9] = sc.next();
        System.out.println("Digite o [" + 11 + "] nome :");
        nomes[10] = sc.next();
        System.out.println("Digite o [" + 12 + "] nome :");
        nomes[11] = sc.next();
        System.out.println("Digite o [" + 13 + "] nome :");
        nomes[12] = sc.next();
        System.out.println("Digite o [" + 14 + "] nome :");
        nomes[13] = sc.next();
        System.out.println("Digite o [" + 15 + "] nome :");
        nomes[14] = sc.next();
        */
        
        /*
        String nomes [] = new String[50];
        
        for (int i = 0; i < 50; i++) {
            //String name = names[i];
            System.out.println("Digite o " + (i + 1) + " nome");
            nomes[i] = sc.next();
            System.out.println("Nomes[" + (i+1) + "]: " + nomes[i]);
        }
        */
        
        for (int i = 0; i < 50; i++) {
            //String name = names[i];
            System.out.println("Digite o " + (i + 1) + " nome");
            // cria ate n vezes a mesma variavel e a substitui
            String nome = sc.next();
            // por isso ele so pega o ultimo valor da "nome_variavel"
            System.out.println("Nomes[" + (i+1) + "]: " + nome);
        }
        
        System.out.println("fim do laço");
    }
    
}
