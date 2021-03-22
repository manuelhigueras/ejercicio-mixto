/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota.prueba;

import flota.domain.Barcaza;
import flota.domain.Camion;
import flota.domain.Empresa2;
import flota.domain.Vehiculo;
import java.util.Scanner;

public class PruebaEmpresaVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OTRA PERSONA DESARROLLADOR USA EMPRESA Y VEHICULO
        
        int cont = 5;
        Empresa2 emp2;
        Vehiculo v2;
        String nombre2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("...EMPRESA DE TRANSPORTE...");
        emp2 = new Empresa2("Empresa Privada");
        emp2.addVehiculoGen();
        //ERROR - REPITE LA CONDICION QUE VA A MODIFICAR Y NO CAMBIA EL VALOR DE
        //        LA POSICION
        //emp2.modifyVehiculoGen(emp2);
        emp2.showVehiculoGen(emp2);

        ////////////////////////////////////////////////////////////////////
        
        //CLASE: DECLARACION DE UN SOLO ARRAY ESPECIFICO 
        
//        System.out.println("Introduce nombre empresa: ");
//        String nombre = sc.next();
//        
//        Empresa2 emp = new Empresa2(nombre);
//        
//        System.out.println("Introduce matricula del nuevo vehiculo:");
//        Vehiculo v1 = new Vehiculo("A14FA14");
//        
//        emp.addVehiculo(v1);
//        
        /////////////////////////////////////////////////////////////////////
        
        //CLASE: IMPRIME UN ARRAY CON UNA POSICION CREADA
        
        //System.out.println("Mostrar empresa y su flota de camiones");
        
//        Vehiculo[] flota = emp.getVehiculo();
        
//        for(Vehiculo v: flota){
//            if(v != null)
//                System.out.println(v.getMatricula());
//            else
//                System.out.println("Esta vacio");
//            
//        }    

    }
    
}
