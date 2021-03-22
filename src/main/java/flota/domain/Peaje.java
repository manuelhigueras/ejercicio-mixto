/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota.domain;

public class Peaje{
   public double pagarPeaje = 5; 
   public Vehiculo x;
   public Camion y;
   public Barcaza m;
   
    public double getPagarPeaje() {
        return pagarPeaje;
    }
    
    public double peaje(){
        if(x.getCargaActual() >= 100){
            pagarPeaje *= 2;
        }
        else{
            pagarPeaje *= 1;
        }
        return pagarPeaje;
    }
    
}
