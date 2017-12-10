package controle;

import java.util.ArrayList;
import javax.swing.JTextArea;
import modelo.Pessoa;


public class Controle {
    
    private ArrayList<Pessoa> pessoas = new ArrayList(); 
    
    public void cadastrar(Pessoa p){
    pessoas.add(p);
    }
    
    public void exibir(){
        for(Pessoa p: pessoas){
        System.out.println(p);
        }
    }

    public void exibir(JTextArea jTAreaExibir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
