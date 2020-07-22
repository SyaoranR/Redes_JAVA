/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudos_prova_01;

import java.util.Scanner;

/**
 *
 * @author Alessandro Fraga Gomes
 */
public class Solucao_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Algoritmos Simples");
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("TROCO");
        
        Scanner leia = new Scanner(System.in);
        
        float pago, preco, troco;
        
        System.out.println("Informe o preco");
        preco = leia.nextFloat();
        System.out.println("Informe o que foi pago");
        pago = leia.nextFloat();
        
        troco = pago - preco;
        
        System.out.println("Troco = R$" + troco + "0");
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("QUILO");
        
        int quilo;
        float valor, total;
        
        System.out.println("Informe a quantidade de quilos");
        quilo = leia.nextInt();
        System.out.println("Informe o preco/valor por quilo");
        valor = leia.nextFloat();
        
        total = valor * quilo;
        
        System.out.println("Total a pagar R$" + total + "0");
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("AUTOMOVEL");
        
        String nomeCar;
        float preco_fab, imposto, porc_revendedor, precoFinal;
        
        System.out.println("Informe o nome do carro");
        nomeCar = leia.next();
        System.out.println("Informe o preco de fabrica");
        preco_fab = leia.nextFloat();
        System.out.println("Informe o imposto");
        imposto = leia.nextFloat();
        System.out.println("Informe a porcentagem do revendedor");
        porc_revendedor = leia.nextFloat();
        
        //precoFinal = preco_fab + (preco_fab * 0.44f) + (preco_fab * 0.28f);
        precoFinal = preco_fab + (preco_fab * imposto) + 
                (preco_fab * porc_revendedor);
        
        System.out.println("O nome do carro é: " + nomeCar + 
                " e seu preco final é R$" + precoFinal + "0");
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Algoritmo nao tao simple");
        
        System.out.println("IDADE");        
        
        int idade_dias, anos, meses, dias, resto;
        
        System.out.println("Informe a idade em dias");
        idade_dias = leia.nextInt();
        
        anos = idade_dias / 365;
        System.out.println("Ano = " + anos);
        resto = idade_dias % 365;
        System.out.println("Resto = " + resto);
        meses = resto / 30;
        System.out.println("Meses = " + meses);
        dias = resto % 30;
        System.out.println("Dias = " + dias);
        
        System.out.println("Anos = " + anos + ", Meses = " + meses 
                + " e Dias = " + dias);
    }
    
}
