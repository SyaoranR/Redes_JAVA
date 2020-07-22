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
        System.out.println("Escolha opcao '1' para Aluno(a) ou '2' para "
                + "Professor(a)");
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
        System.out.println("Informe o nome do(a) Aluno(a):");
        // nakamura.setNome(okazaki.next()); // note aqui nao aceita 'espaco' 
        // esse abaixo aceita os espacos nos nomes .nextLine
        nakamura.setNome(okazaki.next());
        System.out.println("Informe o sexo do(a) Aluno(a) como 'M' ou 'F':");
        nakamura.setSexo(okazaki.next());
        System.out.println("Informe a idade do(a) Aluno(a):");
        nakamura.setIdade(okazaki.nextInt());
        System.out.println("Informe o curso do(a) Aluno(a):");
        //nakamura.setCurso(okazaki.next());
        // 27 - 09 - 2017
        Curso graduacao = new Curso();
        //graduacao.setNome_curso(okazaki.next()); // note aqui nao aceita 
        // 'espaco' esse abaixo aceita os espacos nos nomes .nextLine
        graduacao.setNome_curso(okazaki.next());
        nakamura.setCurso(graduacao); 
        System.out.println("Informe a turma do(a) Aluno(a):");
        //nakamura.setTurma(okazaki.next());
        // 04 - 10 - 2017
        Turma grupo = new Turma();
        grupo.setNome_turma(okazaki.next());
        nakamura.setTurma(grupo);
        /* nao usar mais
        Disciplina materia = new Disciplina();
        System.out.println("Informe o nome da disciplina:");
        materia.setNome_disciplina(okazaki.next());
        */
        
        // 11 - 10 - 2017
        Boletim[] vetBoletim = new Boletim[5];
        // nakamura.setBoletims(vetBoletim); // linha necessaria para preencher 
        // o aluno aqui opcao 2
        for (int i = 0; i < vetBoletim.length; i++) {
            //Boletim desempenho = vetBoletim[i];
            Boletim desempenho = new Boletim();
            System.out.println("Entre com a disciplina");
            Disciplina materia = new Disciplina();
            System.out.println("Informe o nome da disciplina:");
            // materia.setNome_disciplina(okazaki.next()); // note aqui nao  
            // aceita 'espaco', esse abaixo aceita os espacos nos nomes
            // .nextLine
            materia.setNome_disciplina(okazaki.next());
            System.out.println("Informe a nota 1 ");
            desempenho.setNota1(okazaki.nextFloat());
            System.out.println("Informe a nota 2 ");
            desempenho.setNota2(okazaki.nextFloat());
            desempenho.setDisciplina(materia);
            vetBoletim[i] = desempenho; // para preencher o vetor
            // Ou o modo abaixo
            // nakamura.getBoletims()[i] = desempenho;
        }
        
        nakamura.setBoletims(vetBoletim); // linha necessaria para preencher o
        // aluno aqui opcao 1
       
        System.out.println("--------------Dados do(a) Aluno(a)--------------");
        nakamura.imprimirDados();
        System.out.println("--------------Dados do(a) Aluno(a)--------------");
                        
    }
    
    public static void CadastroProfessor() {
        Scanner nagisa = new Scanner(System.in);
        Professor nitroFun = new Professor();
        System.out.println("------------Dados do(a) Professor(a)------------");
        System.out.println("Informe o nome do(a) Professor(a):");
        nitroFun.setNome(nagisa.next());
        System.out.println("Informe o sexo do(a) Professor(a) como "
                + "'M' ou 'F':");
        nitroFun.setSexo(nagisa.next());
        System.out.println("Informe a idade do(a) Professor(a):");
        nitroFun.setIdade(nagisa.nextInt());
        System.out.println("Informe a carga horaria mensal do(a) "
                + "Professor(a):");
        nitroFun.setCargaHorariaMensal(nagisa.nextInt());
        System.out.println("Informe o valor por hora do(a) Professor(a):");
        nitroFun.setValorHora(nagisa.nextFloat());
        System.out.println("------------Dados do(a) Professor(a)------------");
        nitroFun.imprimirDados();
        System.out.println("------------Dados do(a) Professor(a)------------");
    }
    
    public static  void swingAluno() {
        Aluno estudante = new Aluno();
        estudante.setNome(JOptionPane.showInputDialog("Entre com o nome do(a) "
                + "aluno(a)"));
        estudante.setSexo(JOptionPane.showInputDialog("Entre com o sexo do(a) "
                + "aluno(a)"));
        estudante.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre "
                + "com a idade do(a) aluno(a)")));
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
                + "curso do(a) aluno(a)"));
        estudante.setCurso(grad);
        // 04 - 10 - 2017
        Turma serie = new Turma();
        serie.setNome_turma(JOptionPane.showInputDialog("Entre com o nome da "
                + "turma do(a) aluno(a)"));
        estudante.setTurma(serie);
        estudante.imprimirDados();
    }
    
    public static  void swingProfessor() {
        Professor prof = new Professor();
        prof.setNome(JOptionPane.showInputDialog("Entre com o nome do(a) "
                + "professor(a)"));
        prof.setSexo(JOptionPane.showInputDialog("Entre com o sexo do(a) "
                + "professor(a)"));
        prof.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Entre com "
                + " a idade do(a) professor(a)")));
        prof.setCargaHorariaMensal(Integer.parseInt(JOptionPane.
                showInputDialog("Entre com a carga horaria do(a) "
                        + "professor(a)")));
        prof.setValorHora(Float.parseFloat(JOptionPane.showInputDialog("Entre "
                + "com o valor por hora do(a) professor(a)")));
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
