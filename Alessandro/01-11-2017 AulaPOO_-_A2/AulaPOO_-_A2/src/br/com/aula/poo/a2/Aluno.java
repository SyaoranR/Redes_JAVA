/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.poo.a2;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Aluno
 * adicionar 
 * um atributo array/vetor de boletim com 5 posicoes
 * criar os metodos acessores
 * adicionar na impressao os dados do boletim
 * o array e para 5 disciplinas??
 */
public class Aluno extends Pessoa {
    //private String turma;
    //private String curso;
    private Curso curso;
    private Turma turma;
    //private Boletim[] boletims; // so declaracao, nao precisa iniciar aqui
    private List<Boletim> listaBoletim = new ArrayList(); // 01-11-2017
               
    // 27 - 09 - 2017
    public void setCurso (Curso curso) {
        this.curso = curso;
    }
    
    public Curso getCurso () {
        return this.curso;
    }
    
    // 04 - 10 - 2017
    public void setTurma (Turma turma) {
        this.turma = turma;
    }
    
    public Turma getTurma () {
        return this.turma;
    }
    /*
    // 11 - 10 - 2017
    public Boletim[] getBoletims() {
        return boletims;
    }

    public void setBoletims(Boletim[] boletims) {
        this.boletims = boletims;
    }
    */
    
    // 01-11-2017
    public List<Boletim> getListaBoletims() {
        return this.listaBoletim;
    }

    public void setBoletims(List<Boletim> boletims) {
        this.listaBoletim = boletims;
    }
        
    @Override
    public void imprimirDados() {
        super.imprimirDados(); //To change body of generated methods, 
        // choose Tools | Templates.
        // 04 - 10 - 2017
        System.out.println("Curso do(a) aluno(a): " + 
                this.curso.getNome_curso());
        System.out.println("Turma do(a) aluno(a): " + 
                this.turma.getNome_turma());
        
        /*
        // 11 - 10 - 2017
        for (int i = 0; i < getBoletims().length; i++) {
            Boletim boletim = getBoletims()[i];
            boletim.imprimirDados();
        }
        */
        
        // 01 - 11 - 2017
        for (int i = 0; i < listaBoletim.size(); i++) {
            Boletim boletim = listaBoletim.get(i);
            boletim.imprimirDados();
        }
         
        // 27 - 09 - 2017
        //System.out.println("Turma do aluno: " + this.turma);
        //System.out.println("Curso do aluno: " + this.curso);    
    }
    
    /* nao usando mais esse
    public void setTurma (String turma) {
        this.turma = turma;
    }
    
    public String getTurma () {
        return this.turma;
    }
    */
    
    /* nao usando mais esse
    public void setCurso (String curso) {
        this.curso = curso;
    }
    
    public String getCurso () {
        return this.curso;
    }
    */
       
}
