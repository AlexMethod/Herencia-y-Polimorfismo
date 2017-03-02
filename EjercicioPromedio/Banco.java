
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Banco
{
    /*
     Escribir un método en el banco para *calcular el saldo promedio* de todas las cuentas del banco. 
     El método no recibe ningún parámetro y regresa un flotante con el promedio.
     */
    private ArrayList<CuentaBancaria> coleccion;
    public Banco(){
        coleccion=new ArrayList<CuentaBancaria>();
    }
    
    public void agregaCuenta(CuentaBancaria cuenta){
        coleccion.add(cuenta);
    }
    
    public float calculaProm(){
        int sum=0;
        for(int i=0;i<coleccion.size();i++){
            sum=sum + (coleccion.get(i)).getSaldo();
            
        }
        float prom=(float)sum/(float)coleccion.size();
        return prom;
    }
}
