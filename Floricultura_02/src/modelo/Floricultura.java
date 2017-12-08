package modelo;

public class Floricultura {
    
    
   private String flor,quantidade,valor;

    public String getFlor() {
        return flor;
    }

    public void setFlor(String flor) {
        this.flor = flor;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    //flor,quantidade,valor
    public String toString() {
        String retorno = "FLOR: " + this.flor + "\n";
        retorno += "VALOR: " + this.valor + "\n";
        retorno += "QUANTIDADE: " + this.quantidade + "\n";
        retorno += "--------------------------\n";
        return retorno;
            }

    public Floricultura(String flor, String valor, String quantidade) {
        this.flor = flor;
        this.valor = valor;
        this.quantidade = quantidade;
    }
}
