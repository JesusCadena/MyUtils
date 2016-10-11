/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

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
    
    int resultat=0;
    return resultat;
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
