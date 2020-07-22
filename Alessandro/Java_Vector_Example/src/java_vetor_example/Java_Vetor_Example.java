/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_vetor_example;

import java.util.Scanner;

/**
 *
 * @author Alessandro Fraga Gomes
 */
public class Java_Vetor_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        
        String[] nomes = new String[8];
        nomes[0] = "Chester Bannington";
        nomes[1] = "Mike Shinoda";
        nomes[2] = "Masato Nakamura";
        nomes[3] = "Rom Di Prisco";
        nomes[4] = "JunkieXL";
        nomes[5] = "Armin Van Buureen";
        nomes[6] = "Steve Aoki";
        nomes[7] = "Joe Hahn";
         
        
        // vetor predeterminado acima
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nomes[" + (i + 1) + "]: " + nomes[i]);
        }
        
        System.out.println("-------------------------------------------------");
        
        // isso nao e um vetor, porque o que ocorre e que o String simplesmente 
        // e substituido por outro mais novo, o conteudo da variavel muda
        int contador = 0;
        System.out.println("Informe o contador do vetor: ");
        contador = read.nextInt();
        for (int i = 0; i < contador; i++) {
            System.out.println("Informe o " + (i+1) + " nome: ");
            String nome = read.next();
            System.out.println("Nomes[" + (i+1) +  "] = " + nome);
        }
        
        System.out.println("-------------------------------------------------");
        
        // vetor[]
        int cont = 0;
        System.out.println("Informe o contador do vetor: ");
        cont = read.nextInt();
        String names[] = new String[cont];
        
               
        for (int i = 0; i < names.length; i++) {
            //String name = names[i];
            System.out.println("Informe o " + (i+1) + " nome: ");
            names[i] = read.next();
            //System.out.println(" Nome [" + (i+1) + "]: " + names[i]);
        }
        
        for (int i = 0; i < names.length; i++) {
            System.out.println(" Nome [" + (i+1) + "]: " + names[i]);
        }
        
        System.out.println("-------------------------------------------------");
    }
    
}
