/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunosituation02;

import java.util.Scanner;

/**
 *
 * @author Alessandro Fraga Gomes
 */
public class AlunoSituation02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in);
        String nome, sexo;
        float[] notas = new float[2];
                
        System.out.println("Informe o nome");
        nome = leia.next();
        System.out.println("Informe o sexo");
        sexo = leia.next();
        
        System.out.println("Informe a nota 1");
        notas[0] = leia.nextFloat();
        System.out.println("Informe a nota 2");
        notas[1] = leia.nextFloat();
        
        float total = 0, media;
        
        for (int i = 0; i < notas.length; i++) {
            // total += notas[i]; mesma coisa do abaixo
            total = total + notas[i];
        }
        
        media = total/notas.length;
        
        if (media >= 5) {
            // Aprovado(a)
            if (sexo.equalsIgnoreCase("M")) {
                // Aprovado
                System.out.println("Caro aluno, voce foi aprovado" + 
                        " e sua media foi = " + media);  
            } else {
                // Aprovada
                System.out.println("Cara aluna, voce foi aprovada" + 
                        " e sua media foi = " + media);; 
            }
        } else {
            // Reprovado(a)
            if (sexo.equalsIgnoreCase("M")) {
                // Reprovado
                System.out.println("Caro aluno, voce foi reprovado" + 
                        " e sua media foi = " + media);  
            } else {
                // Reprovada
                System.out.println("Cara aluna, voce foi reprovada" + 
                        " e sua media foi = " + media);  
            }
        }
        
    }
}

