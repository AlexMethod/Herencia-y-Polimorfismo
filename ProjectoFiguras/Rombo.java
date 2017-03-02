
/**
 * Write a description of class Rombo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics2D;
import java.awt.Graphics;
public class Rombo extends Figura
{
    private int lado;
    public Rombo(int x, int y){
        super(x,y);
    }
     @Override
    public void pintaFigura(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        g.drawLine( super.getPosX(),super.getPosY(),super.getPosX()/2,super.getPosY()*2 );
        g.drawLine(super.getPosX(),super.getPosY(),super.getPosX() + super.getPosX()/2,super.getPosY()*2 );
        g.drawLine( super.getPosX()/2,super.getPosY()*2,super.getPosX() + super.getPosX()/2,super.getPosY()*2 ); 
    }
}
