/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalcexample;
// comando de importacao

import java.util.Scanner;

/**
 *
 * @author Alessandro Fraga Gomes
 */
public class JavaCalcExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("javacalcexample.JavaCalcExample.main()" + 2);
        
        //  entrada de dados
        Scanner sc = new Scanner(System.in);
        
        // declaracao de variveis
        int n1, n2, soma, sub, mult, div;
        // mensagem sugestiva ao usuario
        System.out.println("Informe o 1º numero : ");
        // leitura dos dados
        n1 = sc.nextInt();
        
        // mensagem sugestiva ao usuario
        System.out.println("Informe o 2º numero : ");
        // leitura dos dados
        n2 = sc.nextInt();
        
        // operacao
        soma = n1 + n2;
        System.out.println("Soma = " + soma);
        
        // operacao
        sub = n1 - n2;
        System.out.println("Subtracao = " + sub);
        
        // operacao
        mult = n1 * n2;
        System.out.println("Multiplicacao = " + mult);
        
        // operacao
        div = n1 / n2;
        System.out.println("Divisao = " + div);
        
    }
    
}
