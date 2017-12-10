package controle;

import java.util.ArrayList;
import modelo.Loja;

public class Controle {
        
    private ArrayList<Loja> lojas = new ArrayList(); 
    private int indice = 0;
    
    public void cadastrar(Loja l){
    lojas.add(l);
    }
    public void voltar(){
        if(indice > 0) indice --;
    }
    
    public void avancar(){
        if(indice < (lojas.size() -1)) indice++;
    }
    
    public void excluir(){
        lojas.remove(indice);
        voltar();
    }
    
    public void editar(Loja l){
        lojas.remove(indice);
        lojas.add(indice, l);
    }
    
     public Loja exibir(){             
        return lojas.get(indice);
    }
     
     public String print(){
        String exibir = "";
        int i = 1;
        for(Loja l: lojas){
            System.out.println(i);
        System.out.println(l);        
        exibir += l.toString(); 
        i++;
        }        
        return exibir;
     }
}
