/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author Seed
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        
        int n1;
        n1 = 0;
        n1 = leia.nextInt();
        
        if(n1%2==0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        
        
        }
                
    }
    
}
