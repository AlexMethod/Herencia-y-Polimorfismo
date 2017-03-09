
/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
public class Pelota
{
   private int posX;
   private int posY;
   private int radio;
   
   public Pelota(int px,int py, int r){
       posX=px;
       posY=py;
       radio=r;
   }
   
   public void dibujate(Graphics g){
       g.drawOval(posX,posY,radio*2,radio*2);
   }
}
