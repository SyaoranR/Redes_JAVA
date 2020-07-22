/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor_simples;

/**
 *
 * @author Alessandro Fraga Gomes
 */
public class Vetor_Simples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int cont = 0;
        
        // "vetor" simples com zero
        System.out.println("'Vetor' simples com zero");
        for (int i = 0; i < 10; i++) {
            System.out.println("Vet[" + i + "] = " + i);
        }
        
        System.out.println("-------------------------------------------------");
        
        // "vetor" simples sem zero
        System.out.println("'Vetor' simples sem zero");
        for (int i = 0; i < 10; i++) {
            System.out.println("Vet[" + i + "] = " + (i+1));
        }
        
        System.out.println("-------------------------------------------------");
        
        // "vetor" simples em ordem inversa sem zero
        System.out.println("'Vetor' simples em ordem inversa sem zero");
        for (int i = 10; i > 0; i--) {
            System.out.println("Vet[" + cont + "] = " + i);
            cont++;
        }
        
        System.out.println("-------------------------------------------------");
        
        cont = 0;
        
        // "vetor" simples em ordem inversa com zero
        System.out.println("'Vetor' simples em ordem inversa com zero");
        for (int i = 10; i > 0; i--) {
            System.out.println("Vet[" + cont + "] = " + (i-1));
            cont++;
        }
        
        System.out.println("-------------------------------------------------");
        
    }
    
}
