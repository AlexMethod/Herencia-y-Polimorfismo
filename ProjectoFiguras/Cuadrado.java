
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
//    private float lado;
   /*@Override 
   public String toString(){
        return ("Cuadrado con area: " + super.toString());
   }*/
    public Cuadrado(int x, int y){
        super(x,y);
    }
    
    /*public String dimeInfo(){
        return nombre + " " + super.dimeInfo();
    }*/
    
    public void pintaFigura(){
        Ventana ven= new Ventana(400,400);
        ven.setVisible(true);
    }
    
    /*public void pintaFigura(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
    }*/
    
}
