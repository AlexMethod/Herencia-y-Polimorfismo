
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
abstract public class Figura 
{
//   protected float area;
   private int posX;
   private int posY;
   /*@Override
   public boolean equals(Object obj){
        return this.area==((Figura)obj).area;
    }*/
   /*@Override
   public String toString(){
        return ("" + area);
   }*/
   public Figura(int x, int y){
       posX=x;
       posY=y;
   }
 
   abstract public void pintaFigura(Graphics g);
   
   public int getPosX(){
       return posX;
   }
   public int getPosY(){
       return posY;
   }
}
