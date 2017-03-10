
/**
 * Write a description of class Canvas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Canvas extends JPanel 
{
    private Pelota ball;
    public Canvas(){
        ball= new Pelota(100,100,10);
    }
   
    @Override 
        public void paintComponent(Graphics g){
            ball.dibujate(g);
        }
        
    public void actua(){
       // ball.muevete(this.getBounds());
        this.repaint();
        
    }
}
