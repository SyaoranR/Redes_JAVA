/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAppExemplo_3;

// Para executar so um pacote Shift + F6 ou botao direito mouse "Executar arquivo" 

// comando de importacao
import java.util.Scanner;

/**
 *
 * @author Aluno
 */

public class Exemplo_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        // entrada de dados
        Scanner leia = new Scanner(System.in);
        System.out.println("javaapplicationinit.JavaApplicationInit.main() " + 3);
        
        // declaracao de variaveis
        int n = 0, cont = 0;
                
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe o contador: ");
        // linha de leitura do que foi atribuido
        cont = leia.nextInt();
        System.out.println("Ordem crescente");
        
        // operacao
        while (n < cont) { // enquanto (condicao) execute           
            n = n + 1;
            System.out.println("Numero [" + n + "]: " + n);
        }
        System.out.println("-------------------------------------------------");
        
        // declaracao de variaveis
        int m = 0;
        
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe o contador 'm': ");
        // linha de leitura do que foi atribuido
        m = leia.nextInt();
        System.out.println("Ordem decrescente (incorreta)!");
        
        n = 0;
        // operacao
        while (m > 0) { // enquanto (condicao) execute           
            m = m - 1;
            n = n + 1;
            System.out.println("Numero [" + n + "]: " + m);
        }
        // a numeracao aparece com numero 0 no fim da ordem, por isso o erro
        System.out.println("-------------------------------------------------");
        
        System.out.println("Ordem decrescente");
        m = 0;
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe o contador 'm': ");
        // linha de leitura do que foi atribuido
        m = leia.nextInt();
        n = 0;
       
        // operacao
        System.out.println("Numero [" + 1 + "]: " + m);
        n = 1;
        while (m > 1) { // enquanto (condicao) execute           
            m = m - 1;
            n = n + 1;
            System.out.println("Numero [" + n + "]: " + m);
        }
        // sem o 0 
    }    
}
