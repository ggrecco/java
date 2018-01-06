package mvc;

import java.util.ArrayList;

public class Control {
    
private ArrayList<Model> modelos;   
private int index = 0;

    public Control(ArrayList modelos) {
        this.modelos = modelos;
    }
    
    public Model exibir(){
        return modelos.get(index);
    }
    
    public void voltar(){
        if (index > 0) index--;
    }
    
    public void avancar(){
        if (index < (modelos.size() -1)) index++;
    }
    
    public void cadastrar(Model m){
        modelos.add(m);
    }
    
    public void excluir(){
        modelos.remove(index);
    }
    
    public void editar(Model m){
        this.excluir();
        modelos.add(index, m);
    }
    
    public String print(){
        
        String exibir = "";
        int i = 1;
        for(Model f: modelos){
            System.out.println(i);
            System.out.println(f);
            exibir += Integer.toString(i);
            exibir += f.toString(); 
            i++;
        }  
        return exibir;
    }
}