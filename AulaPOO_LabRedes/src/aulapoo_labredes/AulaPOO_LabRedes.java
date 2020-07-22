/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo_labredes;

import br.com.a2.labRedes.aulaPOO.Pessoa;
import java.util.Scanner;
import br.com.a2.labRedes.aulaPOO.Aluno;
import br.com.a2.labRedes.aulaPOO.Professor;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class AulaPOO_LabRedes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 20 - 09 - 2017 comeca aqui
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor 1 para aluno e 2 para professor");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            Console_Aluno();
        } else {
            Console_Profesor();
        }
        // termina aqui 20 - 09 - 2017
        
        //swing(); // 13 - 09 - 2017
        //Console_Aluno(); // 13 - 09 - 2017
        //Console_Profesor(); // 20 - 09 - 2017
        /* 30 - 08 - 2017
        nao estou usando isso daqui
        
        //Pessoa okazaki = new Pessoa(); // * aqui
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Entre com o nome");
        String nome = leia.next();
        //okazaki.setNome(leia.next()); ou usa isso ou o de cima
        System.out.println("Entre com sexo M ou F");
        String sexo = leia.next();
        //okazaki.setSexo(leia.next()); ou usa isso ou o de cima
        System.out.println("Entre com a idade");
        int idade = leia.nextInt();
        //okazaki.setIdade(leia.nextInt()); ou usa isso ou o de cima
        /* 
        nao precisa disso
        Pessoa okazaki = new Pessoa(nome, sexo, idade); // *ou usa isso ou o de 
        lá em cima *
        System.out.println(" ");
        System.out.println("---- dados informados ----");
        System.out.println(" ");
        System.out.println("Nome: " + okazaki.getNome());
        System.out.println("Genero: " + okazaki.getSexo());
        System.out.println("Idade: " + okazaki.getIdade() + " Anos  e  possui "
            + okazaki.votoObrigatorio());
        nao precisa disso
        */ 
        //nao estou usando isso ate aqui 30 - 08 - 2017
        
        /*
        //okazaki.imprimirDados(); 13 - 09 - 2017
        // 13 - 09 - 2017
        Scanner leia = new Scanner(System.in);
        Aluno babyFlame = new Aluno();
        System.out.println("Entre com o nome");
        babyFlame.setNome(leia.next());
        System.out.println("Entre com o sexo M ou F");
        babyFlame.setSexo(leia.next());
        System.out.println("Entre com a idade");
        babyFlame.setIdade(leia.nextInt());
        System.out.println("Entre com a turma");
        babyFlame.setTurma(leia.next());
        System.out.println("Entre com o curso");
        babyFlame.setCurso(leia.next());
        babyFlame.imprimirDados();
        // 13 - 09 - 2017
        */
        
        /* 06 - 09 - 2017 
        nao precisa disso
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        Aluno babyFlame = new Aluno();
              
        System.out.println("Entre com o nome");
        babyFlame.setNome(leia.next());
        System.out.println("Entre com sexo M ou F");
        babyFlame.setSexo(leia.next());
        
        System.out.println("Entre com a turma");
        babyFlame.setTurma(leia.next());
        System.out.println("Entre com o curso");
        babyFlame.setCurso(leia.next());
        System.out.println("Entre com a idade");
        babyFlame.setIdade(leia.nextInt());
        
        System.out.println(" ");
        System.out.println("---- dados informados ----");
        System.out.println(" ");
        System.out.println("Nome: " + babyFlame.getNome());
        System.out.println("Genero: " + babyFlame.getSexo());
        
        System.out.println("Idade: " + babyFlame.getIdade() + " Anos  e  possui "
            + babyFlame.votoObrigatorio());
        
        System.out.println("Turma: " + babyFlame.getTurma());
        System.out.println("Curso: " + babyFlame.getCurso());
        
        System.out.println(" ");
        System.out.println("-------------------------------------------------");
        System.out.println(" ");
        nao precisa disso 06 - 09 - 2017       
        */
    }
    
    public static void Console_Aluno() {
        // 13 - 09 - 2017
        Scanner leia = new Scanner(System.in);
        Aluno babyFlame = new Aluno();
        System.out.println("Entre com o nome do aluno");
        babyFlame.setNome(leia.next());
        System.out.println("Entre com o sexo M ou F do aluno");
        babyFlame.setSexo(leia.next());
        System.out.println("Entre com a idade do aluno");
        babyFlame.setIdade(leia.nextInt());
        System.out.println("Entre com a turma do aluno");
        babyFlame.setTurma(leia.next());
        System.out.println("Entre com o curso do aluno");
        babyFlame.setCurso(leia.next());
        babyFlame.imprimirDados();
        // termina aqui 13 - 09 - 2017
    }
    
    public static void Console_Profesor() {
        // 20 - 09 - 2017 comeca aqui
        Scanner itDoesntMatter = new Scanner(System.in);
        Professor furukawa = new Professor();
        System.out.println("Entre com o nome do professor");
        furukawa.setNome(itDoesntMatter.next());
        System.out.println("Entre com o sexo M ou F do professor");
        furukawa.setSexo(itDoesntMatter.next());
        System.out.println("Entre com a idade do professor");
        furukawa.setIdade(itDoesntMatter.nextInt());
        System.out.println("Entre com a carga horaria do professor");
        furukawa.setCargaHoraria(itDoesntMatter.nextInt());
        System.out.println("Entre com o valor por hora do professor");
        furukawa.setValorHora(itDoesntMatter.nextFloat());
        furukawa.imprimirDados();
        // termina aqui 20 - 09 - 2017
    }
            
    public static void swing() {
        // nao usar por enquanto
        Aluno nitroFun  = new Aluno();
        nitroFun.setNome(JOptionPane.showInputDialog("Entre com o nome."));
        nitroFun.setSexo(JOptionPane.showInputDialog("Entre com o sexo "
                + "m ou f."));
        nitroFun.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre "
                + "com a idade.")));
        nitroFun.setTurma(JOptionPane.showInputDialog("Entre com a turma."));
        nitroFun.setCurso(JOptionPane.showInputDialog("Entre com o curso."));
    }

}
