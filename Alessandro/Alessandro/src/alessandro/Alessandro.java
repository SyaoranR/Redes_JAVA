/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alessandro;

import java.util.Scanner;

/**
 *
 * @author Alessandro e Willy
 */
public class Alessandro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("PROVA02");
        
        System.out.println("Quesito_01");
        
        Scanner leia = new Scanner(System.in);
        
        String nome;
        float salario;
        
        System.out.println("Informe o nome do funcionário");
        nome = leia.next();
        
        System.out.println("Informe o salário do funcionário");
        salario = leia.nextFloat();

        System.out.println("");
        System.out.println("");
        System.out.println("Quesito_02");
        
        int cont = 0; // contador, inicializacao do contador do vetor
        
        System.out.println("Informe o contador");
        cont = leia.nextInt();
                
        /* caso o usuario informe uma quantidade inferior de elementos no vetor
         * enquanto nao for maior que 2, devera ser informado o valor que 
         * atenda a condicao exigida
         */
        while (cont < 2) {
            System.out.println("Informe um contador maior");
            cont = leia.nextInt();
        }
        
        int idades[] = new int[cont]; // indice que o usuario define "cont"
        
        // vetor para informar as idades
        for (int i = 0; i < idades.length; i++) {
            // int idade = idades[i]; nao sera usada esta linha
            // "(i+1)" para o indice começar do 1 na hora de visualizar
            System.out.println("Informe a " + (i+1) + " idade: ");
            idades[i] = leia.nextInt();
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Quesito_03");
        
        System.out.println("Nome do funcionário: " + nome + 
                " e seu salário = R$" + salario + "0");
        
        // vetor para imprimir as idades
        for (int i = 0; i < idades.length; i++) {
            // int idade = idades[i];
            System.out.println(" Idade [" + (i+1) + "]: " + idades[i]);
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Quesito_04");
        
        // se declara ou nao o IRPF
        if (salario > 2279) {
            System.out.println("Deve declarar o IRPF");
            System.out.println("Valor do IRPF = R$" + (salario * 0.11) + "0");
        } else {
            System.out.println("Não precisa declarar o IRPF");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("Quesito_05");
        
        for (int i = 0; i < idades.length; i++) {
            // se vota ou nao vota
            if (idades[i] > 17) {
                System.out.println("O dependente de " + idades[i] 
                        + " anos de idade tem seu voto obrigatório");                
            } else {
                System.out.println("O dependente de " + idades[i] 
                        + " anos de idade tem seu voto não obrigatório");
            }            
        }
        
    }
    
}
