
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Iterator;
public class Principal
{
   public static void main(String[]args){
       Triangulo t1 = new Triangulo(3,4);
       Cuadrado c1 = new Cuadrado(3);
       Circulo cc1 = new Circulo(3);
       
       ArrayList<Figura> arr= new ArrayList<Figura>();;
       arr.add(t1);
       arr.add(c1);
       arr.add(cc1);
       
       Iterator<Figura> iterador = arr.iterator();
       
       /*while(iterador.hasNext()){ //Calcular area con iterador
          (iterador.next()).calculaArea();
       }
       
       while(iterador.hasNext()){ //Imprimir area con iterador
          Figura f = iterador.next();
          System.out.println(f.accedeArea()); 
       }*/
      
      for(Figura fig:arr){ //For mejorado
         fig.calculaArea();
         System.out.println(fig.accedeArea());
      }
   }
}
