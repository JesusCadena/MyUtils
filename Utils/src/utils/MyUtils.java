/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author X
 * Classe de funcions pròpies utils.
 */
public class MyUtils {
    

/**
 * 
 * @param cadena Strint cadena que es vol invertir
 * @return cadena invertida (null per cadenes nulls).
 */
public static String inverteix (String cadena)
{
    String resultat="";
    
    for(int x=cadena.length()-1;x>0;x--){
        resultat = resultat+cadena.charAt(x);
    }
    resultat=resultat+cadena.charAt(0);
    return resultat;
}
/**
 * 
 * @param day int dia del naixement
 * @param month int  mes del naixement
 * @param year int any del naixement
 * @return edat de la persona, per edat>150 retorna -1, per dates impossibles retorna -2
 * 
 */
public static int edat (int day, int month, int year)
{   
  
    //Se crea un objeto con la fecha actual
        String fecha="";
        if(((day>0)&&(day<=31))&&(month>0)&&(month<=12)){
        fecha=fecha+Integer.toString(day)+"-"+Integer.toString(month)+"-"+Integer.toString(year);
        
        Date fechaNac=null;
        try {
            fechaNac = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
        } catch (Exception ex) {
            System.out.println("Error:"+ex);
        }
        
        Calendar fechaNacimiento = Calendar.getInstance();
        
        Calendar fechaActual = Calendar.getInstance();
        //Se asigna la fecha recibida a la fecha de nacimiento.
        fechaNacimiento.setTime(fechaNac);
        //Se restan la fecha actual y la fecha de nacimiento
        day = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
        month =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
        year = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
        
        
            //Se ajusta el año dependiendo el mes y el día
            if(month<0 || (month==0 && day<0)){
                year--;
            }
        }else{
            System.out.println("ERROR de valores ingresados");
        }
        //Regresa la edad en base a la fecha de nacimiento
        return year;
    
    //return resultat;
}

/**
 * 
 * @param numero número del que es calcula el factorial
 * @return retorna el factorial d'un número. Si el nombre es negatiu retorna -1.
 */
public static double factorial (double numero) {
 
if (numero==0)
return 1;
else
{
double resultat = numero * factorial(numero-1);
return resultat;
}
}
}
