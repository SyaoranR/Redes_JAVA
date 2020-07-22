/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimaaula;

import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 *
 * @author Seed
 */
public class Ultimaaula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[2];
        float media;
        String nome,sexo;
        System.out.println("digite o nome");
        nome = sc.next();
        System.out.println("digite o sexo");
        sexo = sc.next();
        System.out.println("digite nota 1");
        //nota1 = sc.nextFloat();
        notas[0] = sc.nextFloat();
        System.out.println("digite nota 2");
        //nota2 = sc.nextFloat();
        notas[1] = sc.nextFloat();
        float total = 0;
        // nao tinha vetor antes
        for (int i = 0; i < notas.length; i++) {
            total = total +notas[i];
        }
        // media = (n1+n2)/2
        media = total/notas.length;
        if (media >= 5) {
            //aprovado
            if (sexo.equalsIgnoreCase("M")) {
                System.out.println("caro aluno você esta aprovado");
            } else {
                System.out.println("cara aluna você esta aprovada");
            }
        } else {
            //reprovado
             if (sexo.equalsIgnoreCase("M")) {
                System.out.println("caro aluno você esta reprovado");
            } else {
                System.out.println("cara aluna você esta reprovada");
        }
        }
        
    
    }
    
}
