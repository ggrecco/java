package modelo;
public class Loja {
    String produto,quantidade, valor_unitario;

    public Loja(String produto, String quantidade, String valor_unitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor_unitario = valor_unitario;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(String valor_unitario) {
        this.valor_unitario = valor_unitario;
    }
    
    public String toString() {
        String retorno = "\nPRODUTO: " + this.produto + "\n";
        retorno += "QUANTIDADE: " + this.quantidade + "\n";
        retorno += "Valor: "+ this.valor_unitario + "\n";
        retorno += "--------------------------\n";

        return retorno;
        }
    
    
}
