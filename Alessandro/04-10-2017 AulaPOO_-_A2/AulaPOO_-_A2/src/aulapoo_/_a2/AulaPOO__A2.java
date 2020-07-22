/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapoo_._a2;

import br.com.aula.poo.a2.Aluno;
import br.com.aula.poo.a2.Boletim;
import br.com.aula.poo.a2.Curso;
import br.com.aula.poo.a2.Disciplina;
import br.com.aula.poo.a2.Professor;
import br.com.aula.poo.a2.Turma;
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
        System.out.println("Escolha opcao '1' para Aluno ou '2' para "
                + "Professor");
        opcao = masato.nextInt();
        
        if (opcao == 1) {
            CadastroAluno();
        } else {
            CadastroProfessor();
        }
        // usar o switch case para usar todas as opcoes com os swingAluno e 
        // swingProfessor
        
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
        //nakamura.setCurso(okazaki.next());
        // 27 - 09 - 2017
        Curso graduacao = new Curso();
        graduacao.setNome_curso(okazaki.next());
        nakamura.setCurso(graduacao);
        System.out.println("Informe a turma do Aluno:");
        //nakamura.setTurma(okazaki.next());
        // 04 - 10 - 2017
        Turma grupo = new Turma();
        grupo.setNome_turma(okazaki.next());
        nakamura.setTurma(grupo);
        Disciplina materia = new Disciplina();
        System.out.println("Informe o nome da disciplina:");
        materia.setNome_disciplina(okazaki.next());
        Boletim situacao = new Boletim();
        nakamura.setBoletim(situacao);
        
       
        
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
    
    public static  void swingAluno() {
        Aluno estudante = new Aluno();
        estudante.setNome(JOptionPane.showInputDialog("Entre com o nome do "
                + "aluno"));
        estudante.setSexo(JOptionPane.showInputDialog("Entre com o sexo do "
                + "aluno"));
        estudante.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre "
                + "com a idade do aluno")));
        /*
        estudante.setTurma(JOptionPane.showInputDialog("Entre com a turma "
                + "do aluno"));
        */
        /*
        aluno.setCurso(JOptionPane.showInputDialog("Entre com o nome do curso "
                + "do aluno"));
        */
        // 27 - 09 - 2017
        Curso grad = new Curso();
        grad.setNome_curso(JOptionPane.showInputDialog("Entre com o nome do "
                + "curso do aluno"));
        estudante.setCurso(grad);
        // 04 - 10 - 2017
        Turma serie = new Turma();
        serie.setNome_turma(JOptionPane.showInputDialog("Entre com o nome da "
                + "turma do aluno"));
        estudante.setTurma(serie);
        estudante.imprimirDados();
    }
    
    public static  void swingProfessor() {
        Professor prof = new Professor();
        prof.setNome(JOptionPane.showInputDialog("Entre com o nome do "
                + "professor"));
        prof.setSexo(JOptionPane.showInputDialog("Entre com o sexo do "
                + "professor"));
        prof.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com "
                + " a idade do professor")));
        prof.setCargaHorariaMensal(Integer.parseInt(JOptionPane.
                showInputDialog("Entre com a carga horaria do professor")));
        prof.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Entre "
                + "com o valor por hora do professor")));
        /*
        aluno.setCurso(JOptionPane.showInputDialog("Entre com o nome do curso "
                + "do aluno"));
        */
        /*
        Curso curso = new Curso();
        curso.setNome_curso(JOptionPane.showInputDialog("Entre com o nome do "
                + "curso do professor"));
        prof.setCurso(curso);
        */
        prof.imprimirDados();
    }
    
}
