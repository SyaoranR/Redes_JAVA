
package br.com.avaliacao.poo;


public class Eletrodomestico {
    private boolean ligado;
    private int voltagem;
    private String consumo;
    
   ////////////ligado//////////
    public void setLigado(boolean ligado){
        this.ligado=ligado;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    //////////voltagem////////    
    public void setVoltagem(int voltagem){
        this.voltagem=voltagem;
    }
    public int getVoltagem(){
        return this.voltagem;        
    }
    /////////consumo//////////
    public void setConsumo(String consumo){
        this.consumo=consumo;
    }
    public String getConsumo(){
        return this.consumo;
    }
    public void imprimirDados (){
        System.out.println("Ligado / Desligado: "+this.ligado);
        System.out.println("Voltagem: "+this.voltagem+" V");
        System.out.println("Consumo: "+this.consumo.toUpperCase());
      
    }
    
}
