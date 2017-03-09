
/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;
public class Ventana extends JFrame
{
    private Canvas dibujo;
    public Ventana(int ancho,int alto){
        this.setSize(ancho,alto);
        dibujo=new Canvas();
        this.add(dibujo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
