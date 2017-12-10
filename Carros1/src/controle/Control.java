package controle;

import java.util.ArrayList;
import modelo.Carro;

public class Control {
    
    private ArrayList<Carro> carros = new ArrayList(); 
    
    public void cadastrar(Carro p){
    carros.add(p);
    }
    
    public String exibir(){
        String exibir = "";
        int i = 1;
        for(Carro p: carros){
            System.out.println(i);
        System.out.println(p);        
        exibir += p.toString(); 
        i++;
        }        
        return exibir;
    }

    
    
}