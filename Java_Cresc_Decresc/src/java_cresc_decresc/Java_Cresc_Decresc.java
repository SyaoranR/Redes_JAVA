/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_cresc_decresc;
// comando de importacao

import java.util.Scanner;

/**
 *
 * @author Alessandro Fraga Gomes
 */
public class Java_Cresc_Decresc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("javacalcexample.JavaCalcExample.main()" + 4);
        
        //  entrada de dados
        Scanner scan = new Scanner(System.in);
        
        // declaracao de variveis
        int n = 0, cont = 0;
        // mensagem sugestiva ao usuario
        System.out.println("Informe o contador : ");
        // leitura dos dados
        cont = scan.nextInt();
        
        System.out.println("Ordem Crescente");
        
        while (n < cont) { // enquanto (condicao) execute           
            n = n + 1;
            System.out.println("Numero [" + n + "] : " + n);
        }
        
        System.out.println("-------------------------------------------------");
        
        int m = 0;
        n = 0;
        // mensagem sugestiva ao usuario
        System.out.println("Informe o contador 'm' : ");
        // leitura dos dados
        m = scan.nextInt();
        
        System.out.println("Ordem Decrescente (incoreta!)");
        
        while (m > 0) {  // enquanto (condicao) execute           
            m = m - 1;
            n = n + 1;
            System.out.println("Numero [" + n + "] : " + m);
        }
        
        // o erro esta no fato de que ele conta ate o 0
        System.out.println("-------------------------------------------------");
        
        n = 1;
        // mensagem sugestiva ao usuario
        System.out.println("Informe o contador 'm' : ");
        // leitura dos dados
        m = scan.nextInt();
                
        System.out.println("Ordem Decrescente");
        
        System.out.println("Numero [" + n + "] : " + m);      
        
        while (m > 1) {  // enquanto (condicao) execute           
            m = m - 1;
            n = n + 1;
            System.out.println("Numero [" + n + "] : " + m);
        }
        // corrigido o erro        
    }
    
}
