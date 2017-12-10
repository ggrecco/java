package modelo;
public class Hospital {
    String nome, quarto, leito, andar, bloco;

    public Hospital(String nome, String quarto, String leito, String andar, String bloco) {
        this.nome = nome;
        this.quarto = quarto;
        this.leito = leito;
        this.andar = andar;
        this.bloco = bloco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public String getLeito() {
        return leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }
    
    public String toString() {
        String retorno = "\nNome: " + this.nome + "\n";
        retorno += "QUARTO: " + this.quarto +"\n";
        retorno += "LEITO: " + this.leito +"\n";
        retorno += "ANDAR: " + this.andar + "\n";
        retorno += "BLOCO: " + this.bloco +"\n";
        retorno += "--------------------------\n";
        return retorno;
        }
}
