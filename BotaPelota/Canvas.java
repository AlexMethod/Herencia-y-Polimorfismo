
/**
 * Write a description of class Canvas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
public class Canvas extends JPanel
{
    private Pelota ball;
    public Canvas(){
        ball= new Pelota(100,100,10);
        EscuchadorTiempo escuchaTiempo=new EscuchadorTiempo();
        Timer tiempo = new Timer(1000,escuchaTiempo);
        tiempo.start();
    }
    class EscuchadorTiempo implements ActionListener{
        @Override 
        public void actionPerformed(ActionEvent e){
            System.out.println("Hola");
            /*ball.muevete();
            this.repaint();*/
        }
    }
    @Override 
    public void paintComponent(Graphics g){
        ball.dibujate(g);
    }
}
