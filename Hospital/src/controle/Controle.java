package controle;

import java.util.ArrayList;
import modelo.Hospital;

public class Controle {
    private ArrayList<Hospital> hospitais = new ArrayList(); 
    private int indice = 0;
    
    public void cadastrar(Hospital h){
        hospitais.add(h);
    }
    public void voltar(){
        if(indice > 0) indice --;
    }
    
    public void avancar(){
        if(indice < (hospitais.size() -1)) indice++;
    }
    
    public void excluir(){
        hospitais.remove(indice);
        voltar();
    }
    
    public void editar(Hospital h){
        hospitais.remove(indice);
        hospitais.add(indice, h);
    }
    
     public Hospital exibir(){             
        return hospitais.get(indice);
    }
     
     public String print(){
        String exibir = "";
        int i = 1;
        for(Hospital h: hospitais){
            System.out.print(i);
            System.out.println(h);  
            exibir += Integer.toString(i);
            exibir += h.toString();                        
            i++;
        }        
        return exibir;
     }
}
