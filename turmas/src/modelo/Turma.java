package modelo;

import mvc.Model;

public class Turma implements Model{
    String nome,sala,andar,predio;

    public Turma(String nome, String sala, String andar, String predio) {
        this.nome = nome;
        this.sala = sala;
        this.andar = andar;
        this.predio = predio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getPredio() {
        return predio;
    }

    public void setPredio(String predio) {
        this.predio = predio;
    }
    
}
