package newpackage;
public class Filho extends Pai {//herança de pai
    @Override//avisa ao compilador que o metodo será sobrescrito
    public void exibir(){
        super.exibir();
        System.out.print(" Filho!!");
    }
    @Override
    public void teste() {
    }
    //implements Padastro {
        
    //}
}