
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics2D;
import java.awt.Graphics;
public class Cuadrado extends Figura
{
  private int lado;
   /*@Override 
   public String toString(){
        return ("Cuadrado con area: " + super.toString());
   }*/
    public Cuadrado(int x, int y,int l){
        super(x,y);
        lado=l;
    }
    
    /*public String dimeInfo(){
        return nombre + " " + super.dimeInfo();
    }*/
    @Override
    public void pintaFigura(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        g2D.drawRect(super.getPosX(),super.getPosY(),lado,lado);
    }
    
}
