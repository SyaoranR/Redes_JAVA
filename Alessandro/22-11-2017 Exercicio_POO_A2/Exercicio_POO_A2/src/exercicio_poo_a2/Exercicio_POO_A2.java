/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_poo_a2;

import br.com.exercicio.poo.a2.Disciplina;
import br.com.exercicio.poo.a2.Professor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alessandro e Willy 
 */
public class Exercicio_POO_A2 {
   
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Professor> listaProfessores = new ArrayList();
        Scanner leia = new Scanner(System.in);

        String continuarCadProf = "s";
        // String continuarCadDisciplina = "s"; 
        // aqui parece que sai do while interno pois ele deixa de ser 's'
        
        while(continuarCadProf.equalsIgnoreCase("s")) {
            Professor prof = new Professor();
            System.out.println("Informe o nome do(a) professor(a):");
            prof.setNome(leia.next());
            System.out.println("Informe o sexo do(a) professor(a):");
            prof.setSexo(leia.next());
            System.out.println("Informe a idade do(a) professor(a):");
            prof.setIdade(leia.nextInt());
            System.out.println("Informe a carga horaria do(a) professor(a):");
            prof.setCargaHoraria(leia.nextInt());
            System.out.println("Informe o valor por hora de aula do(a) "
                    + "professor(a):");
            prof.setValorHoraAula(leia.nextFloat());
            
            String continuarCadDisciplina = "s";
            /*
            List<Disciplina> listaDisciplinas = new ArrayList(); 
            ja instanciado no professor
            prof.setListaDisciplinas(listaDisciplinas);
            */
            List<Disciplina> listaDisciplinas = new ArrayList();
            prof.setListaDisciplinas(listaDisciplinas);
            while(continuarCadDisciplina.equalsIgnoreCase("s")) {
                Disciplina materia = new Disciplina();
                System.out.println("Informe o nome da disciplina:");
                materia.setNome_Disciplina(leia.next());
                System.out.println("Informe a carga horaria da disciplina:");
                materia.setCargaHoraria_Disciplina(leia.nextInt());  
                
                //prof.getListaDisciplinas().add(materia);
                // ou listaDisciplinas.add(materia); 
                listaDisciplinas.add(materia);
                
                System.out.println("Este professor possui mais disciplinas? "
                        + "'s' ou 'n' ");
                continuarCadDisciplina = leia.next();
                
            }
            
            listaProfessores.add(prof);
            
            System.out.println("Deseja continuar cadastro de professores? "
                    + "'s' ou 'n' ");
            continuarCadProf = leia.next();
            
            /*
            if(continuarCadDisciplina.equalsIgnoreCase("n")) {
                continuarCadDisciplina = "s";
            }
            */
        }
        
        
        // nao tinha esse for, por isso so saia os dados do ultimo informado
        for (int i = 0; i < listaProfessores.size() ; i++) {
            Professor teacher = listaProfessores.get(i);
            System.out.println("----------------Dados Informados----------------");
            teacher.imprimir();
            //System.out.println("----------------Dados Informados----------------");
        }
        
                
        
                        
    }
}
