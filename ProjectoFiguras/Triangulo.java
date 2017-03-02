
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics2D;
import java.awt.Graphics;
public class Triangulo extends Figura
{
    private int base;
    private int altura;
    /*@Override
    public String toString(){
        return ("Triangulo con area: " + super.toString());
    }*/
    public Triangulo (int x,int y,int b, int a){
        super(x,y);
        base=b;
        altura=a;
    }
    
    /*public void calculaArea(){
        area = base*altura/2;
    }
    
    public void ponerNombre(String nom){
        nombre = nom;
    }
    
    public String dimeInfo(){
        return nombre + " " + super.dimeInfo();
    }*/
    
     @Override
    public void pintaFigura(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
          g2D.drawLine(super.getPosX(),super.getPosY(), super.getPosX()+(base/2), super.getPosY()+altura);
          g2D.drawLine(super.getPosX()+(base/2), super.getPosY()+altura, super.getPosX()-(base/2), super.getPosY()+altura);
          g2D.drawLine(super.getPosX(),super.getPosY(),super.getPosX()-(base/2), super.getPosY()+altura);
    }
}
