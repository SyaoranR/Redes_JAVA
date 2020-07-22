package uaiforduai;

import java.awt.BorderLayout;
import java.util.Scanner;

public class UaiForDuai {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Quantas pessoas cabem na boate? ");
        String companhia;
        int idadeResp;
        int qtdMax = entrada.nextInt();
        if (qtdMax > 0) {
            System.out.println(" Digite a idade da pessoa.\n Caso queira encerrar a venda de ingressos antes de alcançar a lotação máxima digite -1. ");

            int idade = entrada.nextInt();
            do {

                while (idade > 0) {
                    for (int pessoas = 0; pessoas < qtdMax;) {
                        System.out.println(" Checagem. ");

                    if (idade > 15) {
                            
                        if (idade < 18) {
                            System.out.println(" Você so podera entrar acompanhado por alguem maior de idade. ");
                        System.out.println(" Você esta acompanhado?[S/N] ");
                        companhia = entrada.next();
                            if (companhia.equalsIgnoreCase("S")) {
                                System.out.println(" Qual a idade do responsavel? ");
                                idadeResp = entrada.nextInt();
                                if (idadeResp > 17) {
                                    System.out.println(" Voces poderao entrar.\n Bem vindo a festa. ");
                                    pessoas++;
                                    pessoas++;
                                } else {
                                    System.out.println(" Desculpe mas nenhum de voces podera entrar. ");
                                }
                                
                            } else {
                                System.out.println(" Desculpe, mas voce nao podera entrar pois esta sem algum responsavel. ");
                            }
                            
                        
                        
                        
                        }else {
                            System.out.println(" Bem Vindo a festa. ");
                            pessoas++;
                        }
                        
                        
                    } else {
                        System.out.println(" Desculpe mas voçe tem " + idade + " e nao podera entrar. ");

                    }

                    
                    }
                }

            } while (idade != -1);
            System.out.println(" Foi digitado o flag de parada. " + idade);

        } else {
            System.out.println(" Capacidade máxima igual a 0 ou negativa. ");
        }

    }
}
