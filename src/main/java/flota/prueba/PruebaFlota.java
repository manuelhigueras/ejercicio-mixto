package flota.prueba;


import flota.domain.Vehiculo;
import flota.domain.Caja;


public class PruebaFlota {

    public static void main(String[] args) {
        //sout  tabulador
        System.out.println(".... pruebas de flota .....");

        //CREO UN OBJ VEHICULO
        Vehiculo v = new Vehiculo("");
       
        //ASIGNO VALORES
        // v.cargaMaxima = -3.0;   NO SE PUEDE
        v.setCargaMaxima(300.5);
        v.setMatricula("1234TTT");
        
        // VER INFO
        v.info();
        
        System.out.println("... cargo 20 kg");
        v.cargar(20.0);
        v.info();
        
        System.out.println("... intento sobrecargar 2000 kg");
        v.cargar(2000.0);
        v.info();
        
        System.out.println("... cargo 30 kg");
        v.cargar(30.0);
        v.info();
        
        
        System.out.println("... cargo 4 cajas de 100 kg en total");
        v.cargarVariasCajas(100, 4);
        v.info();
        
        System.out.println("... descargo 1 caja de 30 kg");
        v.descargar(30);
        v.info();
        
        
        System.out.println(".... pruebas cajas");
        
        Caja c = new Caja();
        System.out.println("... peso " + c.getPeso());
        // opción A. No declaro nigún constructor
        //... peso 0.0  
        // No hemos declarado ningun constructor
        // Java ha creado un constructro por defecto
        // que inicializa todas las variables a su valor
        // por defecto. Esto es int y double  a 0 o 0.0
        
        //opción B. Defino yo el constctor
        // ... peso 100.0 
        // yo he declarado el constructor 
        // y le he indicado que inicialice peso a 100
        
        
        
        
    }

}
