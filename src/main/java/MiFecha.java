
public class MiFecha {
    
//    private int dia;
//    private int mes;
//    private int anio;
    
    private int milisegundosDesde1900;

    public int getDia() {
        //return dia;
        return this.milisegundosDesde1900/3000;
    }

    public void setDia(int dia) {
       // this.dia = dia;
    }

    public int getMes() {
        return this.milisegundosDesde1900/3000;
    }

    public void setMes(int mes) {
       // this.mes = mes;
    }

    public int getAnio() {
         return this.milisegundosDesde1900/3000;
    }

    public void setAnio(int anio) {
       // this.anio = anio;
    }
    
    
    
}
