import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;

public class Aprender {
    double w,teta,x;
    boolean exitoso;
    ArrayList<Integer> salida_real=new ArrayList<Integer>();
    public void valoreWyTeta(){
        w=(double)Math.round((Math.random()*((-0.5)-0.5)+0.5)*100d)/100d;
        teta=(double)Math.round((Math.random()*(0-0.5)+0.5)*100d)/100d;
    }
    public ArrayList<Integer> funcionActivacion(ArrayList<Entrada> entradas,int compuerta) {
        //int[] datosEntrada;
        for (int i=0; i<entradas.size();i++){
            double [] datosEntrada={entradas.get(i).getD1(),entradas.get(i).getD2()};
            for (int y=0;y<datosEntrada.length;y++) {
                x = w * datosEntrada[y];
                if (x >= teta) {
                    salida_real.add(1);
                } else {
                    salida_real.add(0);
                }
            }
        }
        return salida_real;
    }
}
