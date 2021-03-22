/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flota.domain;

public class Camion extends Vehiculo{
    private int ejes;

    public Camion(int ejes, String matricula){
        super(matricula);
        this.ejes = ejes;
    }
    
    @Override
    public double peaje(){
        return super.peaje() + (ejes * 2);
    }
    
}
