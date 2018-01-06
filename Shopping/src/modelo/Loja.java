package modelo;

import mvc.Model;

public class Loja implements Model{
    String loja, sala, andar, corredor;

    public Loja(String loja, String sala, String andar, String corredor) {
        this.loja = loja;
        this.sala = sala;
        this.andar = andar;
        this.corredor = corredor;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getCorredor() {
        return corredor;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }
    public String toString() {
        String retorno = "\nLoja: " + this.loja + "\n";
        retorno += "Sala: " + this.sala + "\n";
        retorno += "Andar: "+ this.andar + "\n";
        retorno += "Corredor: "+ this.corredor + "\n";
        retorno += "--------------------------\n";
        return retorno;
        }
}