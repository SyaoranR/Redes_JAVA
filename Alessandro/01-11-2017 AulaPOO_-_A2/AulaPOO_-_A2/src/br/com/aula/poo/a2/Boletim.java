/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula.poo.a2;

/**
 *
 * @author Aluno
 */
public class Boletim {
    private Disciplina disciplina;
    private float nota1;
    private float nota2;
    
    public void setDisciplina (Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
    public Disciplina getDisciplina() {
        return this.disciplina;
    }
    
    public void setNota1 (float nota1) {
        this.nota1 = nota1;
    }
    
    public float getNota1 () {
        return this.nota1;
    }
    
    public void setNota2 (float nota2) {
        this.nota2 = nota2;
    }
    
    public float getNota2 () {
        return this.nota2;
    }
    
    public float media () {
        return (nota1 + nota2) / 2;
    }
    
    public void imprimirDados() {
        System.out.println("----//----//----//----//----//----//----//----");
        System.out.println("Disciplina do(a) aluno(a): " + disciplina.
                getNome_disciplina());
        System.out.println("Nota 1 do(a) aluno(a): " + this.nota1);
        System.out.println("Nota 2 do(a) aluno(a): " + this.nota2);
        System.out.println("Media do(a) aluno(a): " + media());
        
    }
    
}
