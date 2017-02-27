
/**
 * Write a description of class Ventana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.JFrame;

public class Ventana extends JFrame
{
    private Lienzo lienzo;
    public Ventana(int ancho, int alto){
        super.setSize(ancho,alto); //Es un metodo que se hereda de JFrame 
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lienzo=new Lienzo();
        super.add(lienzo);
    }
}
