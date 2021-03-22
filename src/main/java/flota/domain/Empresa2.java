/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota.domain;

import java.util.Scanner;

public class Empresa2 {
   
    private String name;
    private int posicion = 0;
    private Vehiculo[] vehiculos; //CLS Vehiculo es la Var vehiculo de referencia
                                // que apunta a un Objeto de CLS Vehiculo
    private Empresa2 emp2;
    
    public Empresa2(String nombre){
        this.name = nombre;
        this.vehiculos = new Vehiculo[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Empresa{" + "name=" + name + '}';
    }

    public boolean addVehiculo(Vehiculo v){
        boolean haPodido = false;
        if(posicion == 4){
            System.out.println("... esta lleno");
        }
        else{
            vehiculos[posicion] = v;
            posicion++;
            haPodido = true;
        }
        return haPodido;
    }
    
    public Vehiculo[] getVehiculo() {
        return vehiculos;
    }

    public void setVehiculo(Vehiculo[] vehiculo) {
        this.vehiculos = vehiculo;
    }
    
    public Empresa2 addVehiculoGen(){
        int cont = 0;
        String nombre2;
        Scanner sc = new Scanner(System.in);
        
        while(cont < 5){
            System.out.println("Introduce nombre empresa: ");
            nombre2 = sc.next();
            this.vehiculos[cont] = new Vehiculo(nombre2);
            this.emp2 = new Empresa2(nombre2);
            this.emp2.addVehiculo(this.vehiculos[cont]);
            cont++;
        }
        
        return this.emp2;
        
    }
    
    public void showVehiculoGen(Empresa2 emp2){
        Vehiculo[] flota = emp2.getVehiculo();
        System.out.println("Mostrar empresa y su flota de camiones");
        for(Vehiculo v: flota){
            if(v != null)
                System.out.println(v.getMatricula());
            else
                System.out.println("Esta vacio");
            
        }
        
    }
    
    public void modifyVehiculoGen(Empresa2 emp2){
        int cont = 0;
        String nombre2;
        Scanner sc = new Scanner(System.in);
        Vehiculo[] flota = emp2.getVehiculo();
        
        System.out.println("Mostrar empresa y cambiando un vehiculo especifico");
        while(cont < 5){
            System.out.println("Introduce el nombre de matricula a cambiar: ");
            nombre2 = sc.next();
            if(flota[cont].equals(nombre2) == true){
                System.out.println("Introduce el nuevo nombre de la matricula:");
                nombre2 = sc.next();
                flota[cont].setMatricula(nombre2);
                break;
            }
            cont++;
        }
    }
    
}
