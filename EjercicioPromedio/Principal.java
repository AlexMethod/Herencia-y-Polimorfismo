
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    /*
     . El main crea un banco y agrega tres cuentas bancarias con un saldo de 100, 200 y 300.
     */
   public static void main(String[]args){
       Banco banc=new Banco();
       CuentaBancaria cuenta1=new CuentaBancaria(100);
       CuentaBancaria cuenta2=new CuentaBancaria(200);
       CuentaBancaria cuenta3=new CuentaBancaria(300);
       banc.agregaCuenta(cuenta1);
       banc.agregaCuenta(cuenta2);
       banc.agregaCuenta(cuenta3);
       
       float promedio=banc.calculaProm();
       System.out.println(promedio);
   }
}
