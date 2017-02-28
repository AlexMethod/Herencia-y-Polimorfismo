
/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo extends Figura
{
    private float base;
    private float altura;
    private float x;
    private float y;
    @Override
    public String toString(){
        return ("Triangulo con area: " + super.toString());
    }
    public Triangulo (float b, float a){
        base = b;
        altura = a;
    }
    
    public void calculaArea(){
        area = base*altura/2;
    }
    
    public void ponerNombre(String nom){
        nombre = nom;
    }
    
    public String dimeInfo(){
        return nombre + " " + super.dimeInfo();
    }
    
    public void pintaFigura(){
        Ventana ven= new Ventana(400,400);
        ven.setVisible(true);
    }
}
