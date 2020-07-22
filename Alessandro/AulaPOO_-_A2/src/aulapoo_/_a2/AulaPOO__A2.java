/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo_._a2;

import br.com.aula.poo.a2.Aluno;
import br.com.aula.poo.a2.Curso;
import br.com.aula.poo.a2.Professor;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class AulaPOO__A2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masato = new Scanner(System.in);
        
        int opcao;      
        System.out.println("Escolha opcao '1' para Aluno ou "
                + "'2' para Professor");
        opcao = masato.nextInt();
        
        if (opcao == 1) {
            CadastroAluno();
        } else {
            CadastroProfessor();
        }
        
    }
    
    public static void CadastroAluno() {
        Scanner okazaki = new Scanner(System.in);
        Aluno nakamura = new Aluno();
        System.out.println("-----------------Dados do Aluno-----------------");
        System.out.println("Informe o nome do Aluno:");
        nakamura.setNome(okazaki.next());
        System.out.println("Informe o sexo do Aluno como 'M' ou 'F':");
        nakamura.setSexo(okazaki.next());
        System.out.println("Informe a idade do Aluno:");
        nakamura.setIdade(okazaki.nextInt());
        System.out.println("Informe o curso do Aluno:");
        Curso graduacao = new Curso();
        graduacao.setNome_curso(okazaki.next());
        //nakamura.setCurso(okazaki.next());
        nakamura.setCurso(graduacao);
        System.out.println("Informe a turma do Aluno:");
        nakamura.setTurma(okazaki.next());
        System.out.println("-----------------Dados do Aluno-----------------");
        nakamura.imprimirDados();
        System.out.println("-----------------Dados do Aluno-----------------");
    }
    
    public static void CadastroProfessor() {
        Scanner nagisa = new Scanner(System.in);
        Professor nitroFun = new Professor();
        System.out.println("---------------Dados do Professor---------------");
        System.out.println("Informe o nome do Professor:");
        nitroFun.setNome(nagisa.next());
        System.out.println("Informe o sexo do Professor como 'M' ou 'F':");
        nitroFun.setSexo(nagisa.next());
        System.out.println("Informe a idade do Professor:");
        nitroFun.setIdade(nagisa.nextInt());
        System.out.println("Informe a carga horaria mensal do Professor:");
        nitroFun.setCargaHorariaMensal(nagisa.nextInt());
        System.out.println("Informe o valor por hora do Professor:");
        nitroFun.setValorHora(nagisa.nextFloat());
        System.out.println("---------------Dados do Professor---------------");
        nitroFun.imprimirDados();
        System.out.println("---------------Dados do Professor---------------");
    }
    
    public static  void swing() {
        Aluno aluno = new Aluno();
        aluno.setNome(JOptionPane.showInputDialog("Entre com o nome do aluno"));
        aluno.setSexo(JOptionPane.showInputDialog("Entre com o sexo do aluno"));
        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com "
                + " a idade do aluno")));
        aluno.setTurma(JOptionPane.showInputDialog("Entre com a turma "
                + "do aluno"));
        /*
        aluno.setCurso(JOptionPane.showInputDialog("Entre com o nome do curso "
                + "do aluno"));
        */
        Curso curso = new Curso();
        curso.setNome_curso(JOptionPane.showInputDialog("Entre com o nome do "
                + "curso do aluno"));
        aluno.setCurso(curso);
        aluno.imprimirDados();
    }
    
}
