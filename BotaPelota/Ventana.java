
/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
public class Ventana extends JFrame
{
    private Canvas dibujo;
    private Timer tiempo;
    public Ventana(int ancho,int alto){
        this.setSize(ancho,alto);
        dibujo=new Canvas();
        this.add(dibujo);
        EscuchadorTeclado escuchaTeclado = new EscuchadorTeclado();
        this.addKeyListener(escuchaTeclado);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        EscuchadorTiempo escuchaTiempo=new EscuchadorTiempo();//determina la accion a ejecutar 
        Timer tiempo = new Timer(50,escuchaTiempo); //
        tiempo.start();
    }
    
    class EscuchadorTeclado implements KeyListener{
        @Override
        public void keyPressed(KeyEvent e){
            if(e.getKeyChar()=='d'){
               tiempo.stop();
            }
            if(e.getKeyChar()=='i'){
                tiempo.start();
            }
            
        }
        @Override
        public void keyReleased(KeyEvent e){
            System.out.println("Key Released: "+e.getKeyChar());
        }
        @Override 
        public void keyTyped(KeyEvent e){
            System.out.println("Key Typed: "+e.getKeyChar());
        }
    }
     class EscuchadorTiempo implements ActionListener{
        @Override 
        public void actionPerformed(ActionEvent e){
            dibujo.actua();
            dibujo.repaint();
        }
    }
    
}
