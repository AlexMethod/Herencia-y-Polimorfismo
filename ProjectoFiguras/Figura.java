
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura 
{
   protected float area;
   protected String nombre;
   @Override
    public boolean equals(Object obj){
        return this.area==((Figura)obj).area;
    }
   @Override
   public String toString(){
        return ("" + area);
    }
   public Figura(){
       area = 0;
       nombre="";
   }
   
   public void calculaArea(){
       
   }
   
   public float accedeArea(){
       return area;
   }
   
   public String accedeNombre(){
       return nombre;
   }
   
   public String dimeInfo(){
       return "" + area;
   }
   
   public void pintaFigura(){
       Ventana v=new Ventana(800,600);
       v.setVisible(true);
   }
}
