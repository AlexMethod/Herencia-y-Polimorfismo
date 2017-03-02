
/**
 * Write a description of class Circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Graphics2D;
import java.awt.Graphics;
public class Circulo extends Figura
{
    
    private int radio;
    
    /*@Override
    public boolean equals(Object obj){
        return this.radio==((Circulo)obj).radio;
        //Se hace cast a circulo ya que el atributo radio no existe en la clase Object :)
    }*/
    
    /*@Override 
    public String toString(){
        return ("Circulo con area: " + super.toString()); /*el objeto super accede a los metodos 
        del padre o superclase inmediata
        
    }*/
    public Circulo(int x, int y,int r){
        super(x,y);
        radio=r;
    }
    
    /*public void calculaArea(){
        area = (float)(3.141592*radio*radio)/2;
    }*/
    
    /*public void ponerNombre(String nom){
        nombre = nom;
    }*/
    
    /*public String dimeInfo(){
        return nombre + " " + super.dimeInfo();
    }*/
    
    @Override
    public void pintaFigura(Graphics g){
        Graphics2D g2D = (Graphics2D)g;
        g2D.drawOval(super.getPosX(),super.getPosY(), radio, radio);
    }
}
