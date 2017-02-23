
/**
 * Write a description of class Cuadrado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cuadrado extends Figura
{
    private float lado;
   @Override 
   public String toString(){
        return ("Cuadrado con area: " + super.toString());
    }
    public Cuadrado(float l){
        lado = l;
    }
    
    public void calculaArea(){
        area = lado*lado;
    }
    
    public void ponerNombre(String nom){
        nombre = nom;
    }
    
    public String dimeInfo(){
        return nombre + " " + super.dimeInfo();
    }
    
}
