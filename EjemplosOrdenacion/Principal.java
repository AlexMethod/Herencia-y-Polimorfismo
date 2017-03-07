
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Arrays;
public class Principal
{
   public static void main (String[]args){
       ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
       
       alumnos.add(new Alumno(100));
       alumnos.add(new Alumno(150));
       alumnos.add(new Alumno(120));
       alumnos.add(new Alumno(40));
       alumnos.add(new Alumno(350));
       
       //Transformar el ArrayList en Array normal
       Alumno[] arrAlumnos=new Alumno[alumnos.size()];
       arrAlumnos=alumnos.toArray(arrAlumnos);
       Arrays.sort(arrAlumnos);
       System.out.println("Arreglo normal");
       for(Alumno alu:arrAlumnos){ //Arreglo que se ordena D: 
           System.out.println(alu);
       }
       System.out.println("Lista de Arreglo");
       for(Alumno alu: alumnos){
           System.out.println(alu);
        }
       
   }
}
