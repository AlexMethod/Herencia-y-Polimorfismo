
/**
 * Write a description of class Planeta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Planeta
{
   private ArrayList<Pais> paises;
   /*
    * Escribir un método en la clase Planeta para calcular el *promedio* de habitantes de todos los países. 
    * El método no recibe parámetros y regresa el número de habitantes en promedio por país en el planeta.
    */
   public Planeta(){
       paises = new ArrayList<Pais>();
   }
   public void agregaPais(Pais p){
       paises.add(p);
   }
   
   
}
