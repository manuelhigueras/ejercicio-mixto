/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota.domain;

public class Empresa {
   
    private String name;
    private Vehiculo vehiculo; //CLS Vehiculo es la Var vehiculo de referencia
                                // que apunta a un Objeto de CLS Vehiculo
    
    public Empresa(String nombre){
        this.name = nombre;
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

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
}
