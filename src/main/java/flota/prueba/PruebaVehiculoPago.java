/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota.prueba;

import flota.domain.Barcaza;
import flota.domain.Camion;
import flota.domain.Peaje;
import flota.domain.Vehiculo;

public class PruebaVehiculoPago {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Vehiculo bmw = new Vehiculo("AM126G");
//        Camion vw = new Camion("K1SZ12");
//        Barcaza camionRodante = new Barcaza("P24XGH");
//        
//        bmw.cargar(102);
//        vw.cargar(80);
//        camionRodante.cargar(300);
    
        System.out.println("... Creo peaje");
        Peaje p = new Peaje();
        
        Vehiculo v = new Camion(2,"AB1234");
        Vehiculo m = new Barcaza("ASD142");
        
        System.out.println("Vas a pagar " + v.peaje() + " euros.");
        System.out.println("Vas a pagar " + m.peaje() + " euros.");
        
    }
    
}
