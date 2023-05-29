package br.org.curso;

/**
 *
 * @author polar
 */
public class Caneta {
    private String corDaTinta = "azul";
    private int qtdeDeTinta = 3;
    private boolean tampada = true;
    
    Caneta(String corDaTinta, int qtdeDeTinta, boolean tampada) {
        this.corDaTinta = corDaTinta;
        this.qtdeDeTinta = qtdeDeTinta;
        this.tampada = tampada;
}
    
    public String escrever() {
        if(tampada){
            return "Primeiro destampe a caneta ...";
        }
        boolean tinta = temTinta();
        if(tinta){
            qtdeDeTinta--;
            return "caneta escrevendo ...";
        }
            return "caneta sem tinta ...";
    }
    
    private boolean temTinta(){
        if(qtdeDeTinta > 0) {
            return true;
        }
        return false;
    }
    
    public String tampar() {
        if(tampada){
            return "A caneta está tampada";
        }
        tampada = true;
        return "Caneta tampada com sucesso";
    }
    
    public String destampar(){
        if(tampada){
            tampada = false;
            return "A caneta está destampada";
        }
        return "Caneta destampada com sucesso";
    }
    
    public String recarregar (int qtdeRecarga) {
        qtdeDeTinta = qtdeDeTinta + qtdeRecarga;
        return "Recarga de " + qtdeRecarga + "ml de tinta realizada com sucesso";
    }
}
