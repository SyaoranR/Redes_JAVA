/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationinit;

import java.util.Scanner; // comando de importacao

// Para executar so um pacote Shift + F6 ou botao direito mouse "Executar arquivo" 

/**
 *
 * @author Aluno
 */

/* -> considere este o "inicio" de um comentario e/ou argumentos
* -> sao como linhas nao executaveis do codigo
// -> este e um comentario "individual", usado em uma so linha
* -> mas note que estamos em um intervalo de "inicio" e "fim" de comentario
* -> e este asterisco e uma forma de marcar a continuacao do mesmo
* -> e como a identacao do comentario
* -> o que esta embaixo e o "fim" do comentario
*/ 

// aqui temos a classe da aplicacao
public class JavaApplicationInit {

    /**
     * @param args the command line arguments
     */
    
    // o que sera de fato executado so fica dentro do "main" = principal
    public static void main(String[] args) {
        // TODO code application logic here
        // como dito acima, a logica da aplicacao fica toda aqui
        
        // declaracao de variaveis, isso pode ser em qualquer lugar do codigo
        // logo e irrelevante se sera colocado aqui ou ali, desde que dentro
        // deste "main", "{" = o "inicio" e "}" = o "fim" do algoritmo em java
        /*
         *  String nome;
         *  int idade;
         *  float valor;
         *  boolean valido;
        */
                     
        // essa linha abaixo servira para os dados de entrada (digitacao)
        // deve ser notado que a linha abaixo pode nao funcionar, pois nao
        // existe a informacao no programa, por isso e necessario "importar"
        // esse "Scanner" de uma "bliblioteca" que ja existe em java
        // la em cima debaixo da palavra reservada "package nome_do_pacote"
        Scanner leia = new Scanner(System.in);
           
        
        System.out.println("javaapplicationinit.JavaApplicationInit.main() " + "Exemplo Geral");
                           
        
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe o nome: ");
        // linha de leitura do que foi atribuido
        String nome = leia.next();
        
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe um numero: ");
         // linha de leitura do que foi atribuido
        int numero = leia.nextInt();
        
        // mensagem sugestiva para o usuario digitar ou informar algum dado
        System.out.println ("Digite/Informe um valor: ");
         // linha de leitura do que foi atribuido
        float valor = leia.nextFloat();
             
        
        // calculos, procedimentos a serem executados para saida 
        // ou seja, e o que o programa fara
        
        
        
        // linha(s) de impressao (escreva/imprima)
        System.out.println("Nome: " + nome);
        System.out.println("Numero: " + numero);
        System.out.println("Valor: " + valor);
    
    }
    
}
