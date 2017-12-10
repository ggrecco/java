package modelo;
public class Loja {
    String peca, altura, largura, quantidade;

    public Loja(String peca, String altura, String largura, String quantidade) {
        this.peca = peca;
        this.altura = altura;
        this.largura = largura;
        this.quantidade = quantidade;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getLargura() {
        return largura;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    public String toString() {
        String retorno = "\nPEÇA: " + this.peca + "\n";
        retorno += "ALTURA: " + this.altura +"\n";
        retorno += "LARGURA: " + this.largura +"\n";
        retorno += "QUANTIDADE: " + this.quantidade + "\n";
        retorno += "--------------------------\n";
        return retorno;
        }
}
