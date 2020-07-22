/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_2;

// Para executar so um pacote Shift + F6 ou botao direito mouse "Executar arquivo" 

// comando de importacao
import java.util.Scanner;

/**
 *
 * @author Aluno
 */

public class Exemplo_2 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        // entrada de dados
        Scanner ler = new Scanner(System.in);
        System.out.println("javaapplicationinit.JavaApplicationInit.main() " + 2);
        
        // declaracao de variaveis
        int a, b;
        
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe o numero 1: ");
        // linha de leitura do que foi atribuido
        a = ler.nextInt();
        
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe o numero 2: ");
        // linha de leitura do que foi atribuido
        b = ler.nextInt();
        
        // operacao a ser realizada (condicional) 
        if (a > b) {
            System.out.println (a + " e maior que " + b);
        } else {
            if (a < b) {
                System.out.println (a + " e menor que " + b);
            } else {
                System.out.println (a + " e igual a " + b);
            }
        }
    }    
}
