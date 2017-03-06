
/**
 * Write a description of class Calcular here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calcular
{
    public static double promedio(Medible[] objetos){
        double sum=0;
        for(Medible obj:objetos){
            sum=sum + obj.getMedida();
        }
        float prom = (float)sum/(float)objetos.length;
            return prom;
        
    }
}
