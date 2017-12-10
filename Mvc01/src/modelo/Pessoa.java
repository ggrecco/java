package modelo;

public class Pessoa {
    
    private String nome,idade,sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        String retorno = "NOME: " + this.nome + "\n";
        retorno += "IDADE: " + this.idade + "\n";
        retorno += "SEXO: " + this.sexo + "\n";
        retorno += "--------------------------\n";
        return retorno;
            }

    public Pessoa(String nome, String idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
   
    
}
