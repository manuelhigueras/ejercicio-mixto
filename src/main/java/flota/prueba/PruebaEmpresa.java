/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota.prueba;

import flota.domain.Caja;
import flota.domain.Empresa;
import flota.domain.Vehiculo;

public class PruebaEmpresa {
    public static void main(String[] args){
        //1. Crear una empresa
        //2. Crear un vehiculo
        //3. Asignar el vehiculo a la empresa
        
        System.out.println(".... nueva empresa 'Transporte Acme'");
                
        Empresa vehiculo = new Empresa("Acme");
        Vehiculo toyota = new Vehiculo("AB1234M");
        
        vehiculo.setVehiculo(toyota);
        
        System.out.println("... cargo una caja de 200kg");
        toyota.cargar(201);
        
        System.out.println(toyota.getCargaActual());
        
        java.util.Date fecha;
        //long d = fecha.getDay();
        
        int edad = 0;
        edad++;
        
        Caja c = new Caja(100);
        double pesodelacaja = c.getPeso();
        
        //if(c!=null)
                
        
    }
}
