/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor_ex_simple;

/**
 *
 * @author Aluno
 */
public class Vetor_Ex_Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 0;
        
        // "vetor" simples incluindo o zero
        System.out.println(" 'vetor' simples com o zero");
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero[" + cont + "] = " + i);
            cont++;
        }
        
        System.out.println("-------------------------------------------------");
        cont = 0;
        
        // "vetor" simples sem o zero
        System.out.println(" 'vetor' simples sem o zero");
        for (int i = 0; i < 10; i++) {
            System.out.println("Numero[" + cont + "] = " + (i+1));
            cont++;
        }
        
        System.out.println("-------------------------------------------------");
        /*
        cont = 0;
        
        // "vetor" simples em ordem inversa com zero
        System.out.println(" 'vetor' simples em ordem inversa com o zero");
        for (int i = 10; i > 0; i--) {
            System.out.println("Numero[" + cont + "] = " + (i-1));
            cont++;
        }
        
        System.out.println("-------------------------------------------------");
        cont = 0;
        
        // "vetor" simples em ordem inversa sem zero
        System.out.println(" 'vetor' simples em ordem inversa sem o zero");
        for (int i = 10; i > 0; i--) {
            System.out.println("Numero[" + cont + "] = " + i);
            cont++;
        }
        
        System.out.println("-------------------------------------------------");
        */
    }
    
}
