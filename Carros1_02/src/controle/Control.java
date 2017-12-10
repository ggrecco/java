package controle;

import java.util.ArrayList;
import modelo.Carro;

public class Control {
    
    private ArrayList<Carro> carros = new ArrayList(); 
    private int indice = 0;    
    
    public void cadastrar(Carro p){
    carros.add(p);
    }
    
    public void voltar(){
        if(indice > 0) indice --;
    }
    
    public void avancar(){
        if(indice < (carros.size() -1)) indice++;
    }
    
    public void excluir(){
        carros.remove(indice);
        voltar();
    }
    
    public void editar(Carro f){
        carros.remove(indice);
        carros.add(indice, f);
    }
    
    public Carro exibir(){
        /* String exibir = "";
        int i = 1;
        for(Carro p: carros){
            System.out.println(i);
        System.out.println(p);        
        exibir += p.toString(); 
        i++;
        } */       
        return carros.get(indice);
    }

    
    
}