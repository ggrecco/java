package modelo;

import mvc.Model;

public class Predio implements Model {
    String inquilino,endereco,bloco,edificio;

    public Predio(String inquilino, String endereco, String bloco, String edificio) {
        this.inquilino = inquilino;
        this.endereco = endereco;
        this.bloco = bloco;
        this.edificio = edificio;
    }

    public String getInquilino() {
        return inquilino;
    }

    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }
    public String toString() {
        String retorno = "\nInquilino: " + this.inquilino + "\n";
        retorno += "Endereço: " + this.endereco + "\n";
        retorno += "Bloco: "+ this.bloco + "\n";
        retorno += "Edificio: "+ this.edificio + "\n";
        retorno += "--------------------------\n";
        return retorno;
        }
    
    //inquilino,endereco,bloco,edificio;
}
