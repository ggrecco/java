package modelo;

public class Carro {
    
    private String modelo, ano, quantidade;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }    

    @Override
    public String toString() {
        String retorno = "MODELO: " + this.modelo + "\n";
        retorno += "ANO: " + this.ano + "\n";
        retorno += "QUANTIDADE: " + this.quantidade + "\n";
        retorno += "--------------------------\n";
        return retorno;
            }

    public Carro(String modelo, String ano, String quantidade) {
        this.modelo = modelo;
        this.ano = ano;
        this.quantidade = quantidade;
    }
   
    
}
