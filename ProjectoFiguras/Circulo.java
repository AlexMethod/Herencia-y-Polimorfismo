
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circulo extends Figura
{
    private float radio;
    @Override 
    public String toString(){
        return ("Circulo con area: " + super.toString()); /*el objeto super accede a los metodos 
        del padre o superclase inmediata
        */
    }
    public Circulo(float r){
        radio = r;
    }
    
    public void calculaArea(){
        area = (float)(3.141592*radio*radio)/2;
    }
    
    public void ponerNombre(String nom){
        nombre = nom;
    }
    
    public String dimeInfo(){
        return nombre + " " + super.dimeInfo();
    }
}
