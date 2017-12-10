package controle;

import java.util.ArrayList;
import modelo.Floricultura;

public class Control {
    
    private ArrayList<Floricultura> flores = new ArrayList(); 
    private int indice = 0;
    
    public void voltar(){
        if(indice > 0) indice --;
    }
    
    public void avancar(){
        if(indice < (flores.size() -1)) indice++;
    }
    
    public void excluir(){
        flores.remove(indice);
        voltar();
    }
    
    public void editar(Floricultura f){
        flores.remove(indice);
        flores.add(indice, f);
    }
    
    public void cadastrar(Floricultura f){
    flores.add(f);
    }
    
    public Floricultura exibir(){
        /*
        String exibir = "";
        int i = 1;
        for(Floricultura f: flores){
            System.out.println(i);
        System.out.println(f);        
        exibir += f.toString(); 
        i++;
        }    */    
        return flores.get(indice);
    }

    
    
}