package br.com.avaliacao.poo;

public class Canais {
    private float numero;
    private String titulo;

    //////////////////
    public float getNumero() {
        return numero;
    }    
    public void setNumero(float numero) {
        this.numero = numero;
    }
    /////////////////////////////

    public String getTitulo() {
        return titulo;
    }   
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //////////////////////////////
    
    public void imprimirDados(){ 
        System.out.println("-------------------------------------------------");
        System.out.println("Numero canal " + this.numero);
        System.out.println("Titulo: " + this.titulo);        
    }
    
}
