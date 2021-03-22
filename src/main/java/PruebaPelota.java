// USO 
public class PruebaPelota {
 
    //psvm
    public static void main(String[] args) {
        Pelota p1 = new Pelota();
        p1.dibujar();
        p1.rebotar();
        
        Pelota p2 = new Pelota();
        p2.color = "verde";
        p2.dibujar();
        
        Pelota p3 = p2;
        p3.botes = 6;
        
        p2.rebotar();
        System.out.println("color de p2 " + p2.color);
        
    }
}
