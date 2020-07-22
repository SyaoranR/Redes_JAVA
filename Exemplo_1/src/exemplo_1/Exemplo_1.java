/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_1;

// Para executar so um pacote Shift + F6 ou botao direito mouse "Executar arquivo" 

// comando de importacao
import java.util.Scanner;

/**
 *
 * @author Aluno
 */

public class Exemplo_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        // entrada de dados
        Scanner leia = new Scanner(System.in);
        
        System.out.println("javaapplicationinit.JavaApplicationInit.main() " + 1);
        
        // declaracao de variaveis
        int n1, n2;
        
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe o numero 1: ");
        // linha de leitura do que foi atribuido
        n1 = leia.nextInt();
        
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe o numero 2: ");
        // linha de leitura do que foi atribuido
        n2 = leia.nextInt();
        
        // operacao a ser realizada
        int soma = n1 + n2;
        
        System.out.println ("A soma e : " + soma);
    }
    
}
