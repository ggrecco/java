package modelo;

public class Pessoa {
    
    private String nome,turno,sala;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurno() {
        return turno;
    }

    public String getSala() {
        return sala;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
       

    @Override
    public String toString() {
        String retorno = "Nome: " + this.nome + "\n";
        retorno += "Turno: " + this.turno + "\n";
        retorno += "Sala: " + this.sala + "\n";
        retorno += "--------------------------\n";
        return retorno;
            }

    public Pessoa(String nome, String turno, String sala) {
        this.nome = nome;
        this.turno = turno;
        this.sala = sala;
    }
   
    
}
