/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.transfer.Professor;
import java.util.Scanner;

/**
 *
 * @author Labredes
 */
public class Main {
    public static void main(String[] args) {
        try {
            // "compacta" professor
            
            boolean continuar = true;
            ProfessorDAO pdao = new ProfessorDAO();
            Scanner sc = new Scanner(System.in);
            do { // executa e depois testa, inverso do while
                Professor professor = new Professor(); // vira um obj qdo instancia
                System.out.println("Entre com o nome");
                professor.setNome(sc.next());
                System.out.println("Entre com o valor hora aula");
                professor.setVl_hora_aula(sc.nextFloat());
                System.out.println("Deseja continuar 'S' Sim ou 'N' Não");
                pdao.openConnection();
                pdao.insert(professor);
                pdao.closeConnection();
                continuar = sc.next().equalsIgnoreCase(sc.next()); // onde fica esta linha?
            } while (continuar);
            
            /*
            Professor professor = new Professor(); // vira um obj qdo instancia
            professor.setNome("marcos augusto2");
            professor.setVl_hora_aula(16);
            ProfessorDAO pdao = new ProfessorDAO();
            pdao.insert(professor); // passa o obj
            professor = new Professor();
            professor.setNome("wesley2");
            professor.setVl_hora_aula(16);
           
            pdao = new ProfessorDAO();
            pdao.insert(professor); // passa o obj
            */
            /* nao precisa
            MyConnection conexao = new MyConnection();
            conexao.openConnection();
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /* ou assim
    public static void main(String[] args) throws Exception {
        Professor prof = new Professor(); // vira um obj qdo instancia
        ProfessorDAO pdao = new ProfessorDAO();
        pdao.insert(prof); // passa o obj
    }
    */
}
