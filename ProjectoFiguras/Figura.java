
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
abstract public class Figura 
{
//   protected float area;
   private String nombre;
   private int posX;
   private int posY;
   /*@Override
   public boolean equals(Object obj){
        return this.area==((Figura)obj).area;
    }*/
   /*@Override
   public String toString(){
        return ("" + area);
   }*/
   public Figura(int x, int y){
       posX=x;
       posY=y;
       nombre="";
   }
   
   public String accedeNombre(){
       return nombre;
   }
 
   abstract public void pintaFigura();
   
   public int getPosX(){
       return posX;
   }
   public int getPosY(){
       return posY;
   }
   public String getName(){
       return nombre;
   }
}
