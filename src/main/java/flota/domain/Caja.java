package flota.domain;

public class Caja {
    
    //ATRIBUTOS
    private double peso;

    
    //CONSTRUCTORES
    public Caja(){
        System.out.println("... creo una caja");
        this.peso = 100;
    }
    
    public Caja(double pesoInicial){
        this.peso = pesoInicial;
    }
    
    //MÉTODOS
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
}
