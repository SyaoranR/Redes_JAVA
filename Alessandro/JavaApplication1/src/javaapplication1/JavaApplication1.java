/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Seed
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner pudim = new Scanner(System.in);
        
        int qtd;
        System.out.println("Informe a quantidade de alunos");
        qtd = pudim.nextInt();
        String nomes[] = new String[qtd];
        
        float total = 0;
           
        float notas[] = new float[2];
        
        float medias[] = new float[qtd];
             
        // need to check
        for (int i = 0; i < nomes.length; i++) {
            //String nome = nomes[i];
            System.out.println("Informe os nomes dos alunos");
            nomes[i] = pudim.next();
            
            for (int j = 0; j < notas.length; j++) {
                //float nota = notas[i];
                System.out.println("Informe as notas de cada aluno");
                notas[j] = pudim.nextInt();
                total = total + notas[j]; 
                // parece que esta pegando todas as notas
                
            }
            for (int j = 0; j < medias.length; j++) {
                //float media = medias[i];
                medias[j] = total / 2;

            }
            
        }
        
        
        
        /* not working?
        float total = 0;
           
        float notas[] = new float[2];
        
        for (int i = 0; i < notas.length; i++) {
            //float nota = notas[i];
            System.out.println("Informe as notas de cada aluno");
            notas[i] = pudim.nextInt();
            
        }
        
        
        for (int i = 0; i < notas.length; i++) {
            total = total + notas[i]; 
        }
          
        
        for (int i = 0; i < medias.length; i++) {
            //float media = medias[i];
            medias[i] = total / 2;
            
        }
        not working? */
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome[" + (i+1) + "] : " + nomes[i] + 
                       " -_-|-_- ");
            for (int j = 0; j < notas.length; j++) {
                System.out.print("Nota[" + (j+1) + "] : " + notas[j] +
                        " _-_|_-_ "); 
                // os valores que estao sendo pegos sao os ultimos;
                // o que fazer? onde esta o erro?
            }
            for (int j = 0; j < medias.length; j++) {
                System.out.println("Media[" + (j+1) + "] : " + medias[j]);            
            }
        }
        
        /* need to check
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota[" + (i+1) + "] : " + notas[i] + " _-_|_-_ ");
        }
        
        for (int i = 0; i < medias.length; i++) {
            System.out.println("Media[" + (i+1) + "] : " + medias[i]);            
        }
        need to check */
    }
    
}
