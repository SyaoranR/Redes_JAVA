
package br.com.avaliacao.poo;

public class Tv extends Eletrodomestico {
    private int tamanho;
    private float valor;
    private Canais[] canais;
    private Tipo_tvs tipo;

    
    public int getTamanho() {
        return tamanho;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Canais[] getCanais() {
        return canais;
    }
    public void setCanais(Canais[] canais) {
        this.canais = canais;
    }
    public Tipo_tvs getTipo() {
        return tipo;
    }
    public void setTipo(Tipo_tvs tipo) {
        this.tipo = tipo;
    }
    //////////////// desconto ////////////////
    private float desconto;
    public void setDesconto(float desconto){
        this.desconto=desconto;
    }
    public float getDesconto(){
        return this.desconto;
    }
    /////////////////////////////////////////

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Tipo: " + this.tipo.getDescricao().toUpperCase()); 
        System.out.println("Tamanho: "+this.tamanho);
        System.out.println("Valor :"+this.valor);
        System.out.println("Desconto: "+this.desconto); 
        System.out.println("");
        System.out.println("====== Canais =======");
        System.out.println("");
        
        // vetor canais
        for (int i = 0; i < getCanais().length; i++) {
            Canais canal = getCanais()[i];
            canal.imprimirDados();
            
        } 
        
    }
}
