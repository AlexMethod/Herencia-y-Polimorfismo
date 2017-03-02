
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
public class Lienzo extends JPanel
{
 @Override
 public void paintComponent(Graphics g){
     
     Graphics2D g2d=(Graphics2D)g;
     Figura cu= new Cuadrado(200,40,200);
     Figura ci= new Circulo(200,40,200);
     Figura tri= new Triangulo(300,40,200,200);
     Figura rom=new Rombo(300,40);
     ArrayList<Figura> figuras=new ArrayList<Figura>();
     figuras.add(cu);
     figuras.add(ci);
     figuras.add(tri);
     figuras.add(rom);
     
     for(Figura f:figuras){
         f.pintaFigura(g);
     }
 }
}