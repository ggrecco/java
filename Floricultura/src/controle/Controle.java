package controle;

import java.util.ArrayList;
import modelo.Floricultura;

public class Controle {
    
    private ArrayList<Floricultura> flores = new ArrayList(); 
    
    public void cadastrar(Floricultura f){
    flores.add(f);
    }
    
    public String exibir(){
        String exibir = "";
        int i = 1;
        for(Floricultura f: flores){
            System.out.println(i);
        System.out.println(f);        
        exibir += f.toString(); 
        i++;
        }        
        return exibir;
    }

    
    
}