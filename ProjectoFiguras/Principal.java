
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
   public static void main(String[]args){
       Triangulo t1 = new Triangulo(3,4);
       Cuadrado c1 = new Cuadrado(3);
       Circulo cc1 = new Circulo(3);
       t1.calculaArea();
       System.out.println(t1.accedeArea());
       
       Figura []arr= new Figura[3];
       arr[0]=t1;
       arr[1]=c1;
       arr[2]=cc1;
       
       for(int i = 0;i<arr.length; i++){
           arr[i].calculaArea();
       }
       
       for(int j = 0;j<arr.length;j++){
           arr[j].accedeArea();
       }
   }
}
