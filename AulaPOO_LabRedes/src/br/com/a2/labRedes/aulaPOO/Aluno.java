/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.a2.labRedes.aulaPOO;

/**
 *
 * @author Aluno
 */

// heranca "heranssa"
public class Aluno extends Pessoa {
      
    private String turma;
    private String curso;
    
    public void setTurma (String turma) {
        this.turma = turma;
    }
    
    public String getTurma () {
        return this.turma;
    }
    
    public void setCurso (String curso) {
        this.curso = curso;
    }
    
    public String getCurso () {
        return this.curso;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados(); //To change body of generated methods, 
        //choose Tools | Templates.
        System.out.println("Turma do aluno: " + this.turma);
        System.out.println("Curso do aluno: " + this.curso);
    }
    
   
}
