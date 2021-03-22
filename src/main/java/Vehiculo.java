
public class Vehiculo {
    
    //ATRIBUTOS
    
    //visibilidad  tipo  nombreVariable
    private double cargaMaxima = 3000.0;
    private String matricula = "";
    private double cargaActual = 0.0;
    private int numCajas = 0;
    
    
    //MÉTODOS
    // getter y setter
    public double getCargaMaxima() {
        return this.cargaMaxima;
    }
                                //arg de entreda
    public void setCargaMaxima(double cargaMaxima) {
        
        //validar antes 
       this.cargaMaxima = cargaMaxima;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public int getNumCajas() {
        return numCajas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void info(){
        System.out.println(". Matrícula: " + this.matricula);
        System.out.println(". Carga Max: " + this.cargaMaxima);
        System.out.println(". Carga Actual: " + this.cargaActual);
        System.out.println(". Total Cajas cargadas: " + this.numCajas);
    }//fin info
    
    public void cargar(double peso){
        if(peso > 0 && (peso+cargaActual) <= (cargaMaxima)   ){
           //si la condicion del if se cumple 
           this.cargaActual = this.cargaActual + peso;
           this.numCajas ++;  //suma 1 a numeroCajas
        }
    }
    
    public void cargarVariasCajas(double pesoTotalCargar, int nunCajasCargas){
        if(pesoTotalCargar > 0 && (pesoTotalCargar + cargaActual) <= cargaMaxima ){
           //si la condicion del if se cumple 
           this.cargaActual = this.cargaActual + pesoTotalCargar;
           this.numCajas  = this.numCajas + nunCajasCargas;
        }
    }
  
    public void descargar(double pesoADescargar){     
        if(pesoADescargar  > 0 && (this.cargaActual - pesoADescargar) >= 0 ){
            this.cargaActual = this.cargaActual - pesoADescargar;
            this.numCajas --;
        }
    }
    
    
}//fin clase
