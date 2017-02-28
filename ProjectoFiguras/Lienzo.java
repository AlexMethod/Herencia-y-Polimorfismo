
/**
 * Write a description of class Lienzo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class Lienzo extends JPanel
{
 @Override
 public void paintComponent(Graphics g){
     Graphics2D g2d=(Graphics2D)g;
     g2d.drawRect(60,60,200,200);
 }
}