/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunosituation;

import java.util.Scanner;

/**
 *
 * @author Alessandro Fraga Gomes
 */
public class AlunoSituation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leia = new Scanner(System.in);
        String nome, sexo;
        float nota1, nota2, media;
        
        System.out.println("Informe o nome");
        nome = leia.next();
        System.out.println("Informe o sexo");
        sexo = leia.next();
        
        System.out.println("Informe a nota 1");
        nota1 = leia.nextFloat();
        System.out.println("Informe a nota 2");
        nota2 = leia.nextFloat();
        
        media = (nota1 + nota2) / 2;
        
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
