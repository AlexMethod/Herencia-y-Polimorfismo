
/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
public class Pelota
{
   private int posX;
   private int posY;
   private int radio;
   private int incx;
   private int incy;
   
   public Pelota(int px,int py, int r){
       posX=px;
       posY=py;
       radio=r;
       int aleatorio =(int)(Math.random()*2);
       if(aleatorio ==0){
           aleatorio = -1;
       }
       incx=aleatorio*10;
       incy=aleatorio*10;
       
   }
   
   public void dibujate(Graphics g){
       g.drawOval(posX,posY,radio*2,radio*2);
   }
   
   public void muevete(Rectangle r){
       posX+=incx;
       posY+=incy;
       if(posX>r.getWidth() - radio*2 || posX<radio*2){
           incx=-incx;
       }
       if(posY>r.getHeight() - radio*2 || posY<radio*2){
           incy=-incy;
       }
   }
}
