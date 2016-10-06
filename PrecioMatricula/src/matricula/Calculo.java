/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula;

/**
 *
 * @author ALUMNEDAM
 */
public class Calculo {
    private int nUF;
    private static int valorCurs=380;
    private static int valurUF=30;
    private int resultado;

    public Calculo(int nUF) {
        this.nUF = nUF;
    }

    public int getnUF() {
        return nUF;
    }

    public void setnUF(int nUF) {
        this.nUF = nUF;
    }

    public static int getValorCurs() {
        return valorCurs;
    }

    public static void setValorCurs(int valorCurs) {
        Calculo.valorCurs = valorCurs;
    }

    public static int getValurUF() {
        return valurUF;
    }

    public static void setValurUF(int valurUF) {
        Calculo.valurUF = valurUF;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    private int calcularPrecio(int nUF){
        if ((nUF<12)&&(nUF>0)){
            resultado=nUF*30;
        }
        else if((nUF>=12)){
            resultado=380;
        }
    return resultado;
    }
    
}
