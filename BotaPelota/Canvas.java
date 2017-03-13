
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.awt.Rectangle;
public class Canvas extends JPanel 
{
    private LinkedList<Pelota> balls;
    public Canvas(){
        balls = new LinkedList<Pelota>();
        balls.add(new Pelota(100,100,10));
        EscuchadorRaton escuchaRaton = new EscuchadorRaton();
        this.addMouseListener(escuchaRaton);//Agrega al canvas un MouseListener para detectar los 
        //botones del raton 
    }
   
    @Override 
        public void paintComponent(Graphics g){
            super.paintComponent(g); //borra el canvas 
            for(Pelota p:balls){
                p.dibujate(g);
            }
            
        }
        
    public void actua(){
        Rectangle r = this.getBounds();
        for(Pelota p:balls){ //Le indica a cada pelota que se mueva
            p.muevete(r);
            this.repaint();
        }
        
    }
    
    public class EscuchadorRaton extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e){
            int tamRandom=(int)(10 + Math.random()*20); //Genera valores aleatorios entre 10-30
            Pelota ball2 = new Pelota(e.getX(),e.getY(),tamRandom);
            balls.add(ball2);
            
        }
    }
}
