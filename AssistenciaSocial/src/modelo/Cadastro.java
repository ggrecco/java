
package modelo;

import mvc.Model;

public class Cadastro implements Model{
    String nome, nDependentes, endereco, rendaFamiliar;

    public Cadastro(String nome, String nDependentes, String endereco, String rendaFamiliar) {
        this.nome = nome;
        this.nDependentes = nDependentes;
        this.endereco = endereco;
        this.rendaFamiliar = rendaFamiliar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnDependentes() {
        return nDependentes;
    }

    public void setnDependentes(String nDependentes) {
        this.nDependentes = nDependentes;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(String rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }
    public String toString() {
        String retorno = "\nNome: " + this.nome + "\n";
        retorno += "Nº Dependentes: " + this.nDependentes + "\n";
        retorno += "Endereço: "+ this.endereco + "\n";
        retorno += "Renda Familiar: "+ this.rendaFamiliar + "\n";
        retorno += "--------------------------\n";
        return retorno;
        }
}
