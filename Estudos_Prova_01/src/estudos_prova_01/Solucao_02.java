/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos_prova_01;

import java.util.Scanner;

/**
 *
 * @author Alessandro Fraga Gomes
 */
public class Solucao_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Algoritmos");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("VETOR_SIMPLES");
        
        int cont = 0;
        
        // "vetor" simples sem zero
        System.out.println("'Vetor' simples sem zero");
        for (int i = 0; i < 10; i++) {
            System.out.println("Vet[" + i + "] = " + (i+1));
        }
        
        System.out.println("");
        System.out.println("");
                        
        // "vetor" simples em ordem inversa sem zero
        System.out.println("'Vetor' simples em ordem inversa sem zero");
        for (int i = 10; i > 0; i--) {
            System.out.println("Vet[" + cont + "] = " + i);
            cont++;
        }
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("TROCO_CEDULAS");
        
        int pago, compra, troco, notas100 = 0, notas50 = 0, 
                notas10 = 0, notas5 = 0, notas1 = 0, aux = 0;
        
        System.out.println("Informe o que foi pago pelo cliente");
        pago = scan.nextInt();
        System.out.println("Informe o valor da compra");
        compra = scan.nextInt();
        
        troco = pago - compra;
        aux = troco;
        
        if (aux >= 100) {
            notas100 = aux / 100;
            aux = aux % 100;
        }
        
        if (aux >= 50) {
            notas50 = aux / 50;
            aux = aux % 50;
        }
        
        if (aux >= 10) {
            notas10 = aux / 10;
            aux = aux % 10;
        }
        
        if (aux >= 5) {
            notas5 = aux / 5;
            aux = aux % 5;
        } else {
            if (aux < 5) {
                notas1 = aux;
            }
        }
        
        System.out.println("Pago = R$" + pago + ",00, compra = R$" + compra + 
                ",00, notas de 100 = " + notas100 + ", notas de 50 = " + 
                notas50 + ", notas de 10 = " + notas10 + ", notas de 5 = " + 
                notas5 + ", notas de 1 = " + notas1 + ", troco = R$" + troco +
                ",00, " + " e numero de cedulas = " + (notas100 + notas50 +
                notas10 + notas5 + notas1));
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("IDADE");
        
        int idade;
                
        System.out.println("Informe a idade");
        idade = scan.nextInt();
        
        if ((idade >= 5) && (idade <= 7)) {
            System.out.println("Infantil");
        } else { 
            if ((idade >= 8) && (idade <= 10)) {
                System.out.println("Juvenil");
            } else {
                if ((idade >= 11) && (idade <= 15)) {
                    System.out.println("Adolescente");
                } else {
                    if ((idade >= 16) && (idade <= 30)) {
                        System.out.println("Adulto");
                    } else {
                        System.out.println("Senior");
                    }
                }
            }
        }
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("SITUACAO_ALUNO");
        
        String nome, sexo;
        float[] notas = new float[2];
                
        System.out.println("Informe o nome");
        nome = scan.next();
        System.out.println("Informe o sexo");
        sexo = scan.next();
        
        System.out.println("Informe a nota 1");
        notas[0] = scan.nextFloat();
        System.out.println("Informe a nota 2");
        notas[1] = scan.nextFloat();
        
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
