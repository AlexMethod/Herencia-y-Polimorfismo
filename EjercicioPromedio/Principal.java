
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
       Medible[] cuentas=new Medible[3];
       cuentas[0]=new CuentaBancaria(100);
       cuentas[1]=new CuentaBancaria(200);
       cuentas[2]=new CuentaBancaria(300);
       
       double promedioC = Calcular.promedio(cuentas);
       System.out.println("Promedio cuentas: "+promedioC);
       
       
       Planeta planet = new Planeta();
       Medible[] paises=new Medible[3];
       paises[0]=new Pais(25);
       paises[1]=new Pais(32);
       paises[2]=new Pais(94);
       
       double promedioP=Calcular.promedio(paises);
       System.out.println("Promedio paises: " +promedioP);
   }
}
