/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagenericexample_0;
// comando de imnportacao (veja abaixo no "main" sua serventia)
import java.util.Scanner;

/**
 *
 * @author Alessandro Fraga Gomes
 */

// -> linha para comentario de uma so linha, sendo que esta nao sera executada
// -> codigo, note que toda vez que for comentar deve-se colocar essas barras 

/* -> "inicio" de um bloco de comentarios/argumentos, assim como a acima,
 * -> nao executavel, o "*" serve para marcar/identar o codigo
 * -> abaixo se encontra o fim do comentario, nada pode ser digitado adiante
 */

public class JavaGenericExample_0 {

    /**
     * @param args the command line arguments
     */
    
    // o que sera executado de fato fica dentro do "main" = principal (abaixo)
    public static void main(String[] args) {
        // TODO code application logic here
        
        // como dito acima, a logica da aplicacao fica toda aqui
        System.out.println("javagenericexample_0."
                + "JavaGenericExample_0.main()" + 1);
                
        // declaracao de variaveis, pode ser em qualquer lugar aqui 
        // dentro do "main"
        int numero;
        float valor;
        String nome;
        
        // dados de entrada (digitacao), comando para entrada dos dados
        /* em alguns casos se faz necessario "importar" abaixo de 
         * "package nome_do_pacote", caso nao o seja feito ocorrera erros 
         * na linha de comando digitada
         */
        Scanner leia = new Scanner (System.in);
        
        // mensagem sugestiva para o usuario digitar/informar algum dado
        System.out.println("Digite/Informe um numero: ");
        
        // linha de leitura do que foi atribuido/informado
        numero = leia.nextInt();
        
        // mensagem sugestiva para o usuario digitar/informar algum dado
        System.out.println("Digite/Informe um valor: ");
        
        // linha de leitura do que foi atribuido/informado
        valor = leia.nextFloat();
        
        // mensagem sugestiva para o usuario digitar/informar algum dado
        System.out.println("Digite/Informe um nome: ");
        
        // linha de leitura do que foi atribuido/informado
        nome = leia.next(); 
        
    }
    
}
