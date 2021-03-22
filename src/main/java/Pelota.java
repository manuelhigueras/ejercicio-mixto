
/*
prototipo que dice como son los objetos pelota
y como debe comportarse (que puede hacer)
*/
public class Pelota {
    
    //ATRIBUTOS
    String color = "Rojo";
    int botes = 1;
    
    //CONSTRUCTORES
    
    //MÉTODOS
    public void rebotar(){
      //  System.out.println("Boing  ... Boing con color " + color );
        System.out.println("boto " + botes  + "vez");
    }
    
    public void dibujar(){
        System.out.println("soy una pelota " + color);
    }

}
