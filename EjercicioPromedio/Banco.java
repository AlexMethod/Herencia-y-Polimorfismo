
/**
 * Write a description of class Banco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Banco
{
    
    private ArrayList<CuentaBancaria> coleccion;
    public Banco(){
        coleccion=new ArrayList<CuentaBancaria>();
    }
    
    public void agregaCuenta(CuentaBancaria cuenta){
        coleccion.add(cuenta);
    }
}
