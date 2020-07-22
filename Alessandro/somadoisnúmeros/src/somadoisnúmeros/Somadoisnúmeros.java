/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somadoisnúmeros;

import java.util.Scanner;

/**
 *
 * @author Seed
 */
public class Somadoisnúmeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leia = new Scanner(System.in);
       int a ,b;
        System.out.println("Entre com 1° número");
        a = Leia.nextInt();
        System.out.println("Entre com 2° número");
        b = Leia.nextInt();
        if (a>b) {
            System.out.println(a+ " é maior que " +b);          
        } else {
            System.out.println(b+ " é maior que " +a);
        
        }
       
    }
    
}
