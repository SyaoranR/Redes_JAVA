/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamaiorexample;

import java.util.Scanner;

/**
 *
 * @author Alessandro Fraga Gomes
 */
public class JavaMaiorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("javamaiorexample.JavaMaiorExample.main()" + 3);
        
        // entrada de dados
        Scanner sc = new Scanner (System.in);
        
         // declaracao de variveis
        int n1, n2;
        
        // mensagem sugestiva ao usuario
        System.out.println("Informe o 1º numero : ");
        // leitura dos dados
        n1 = sc.nextInt();
        
        // mensagem sugestiva ao usuario
        System.out.println("Informe o 2º numero : ");
        // leitura dos dados
        n2 = sc.nextInt();
        
        if (n1 > n2) {
            System.out.println(n1 + " e maior que " + n2);
        } else {
            if (n1 < n2) {
                System.out.println(n1 + " e menor que " + n2);
            } else {
                System.out.println(n1 + " e igual a " + n2);
            }
        }
        
    }
    
}
