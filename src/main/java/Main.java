
import flota.domain.Caja;
import flota.domain.Empresa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Caja pack = new Caja();
      
      pack.setPeso(450.12);
      
      System.out.println("Nombre de la clase y memoria: " + pack);
      
      Empresa automotriz = new Empresa("Seath.SHC");
      
      System.out.println(automotriz.toString());
      
      
        
    }
    
}
