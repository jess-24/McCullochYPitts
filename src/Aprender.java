import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;

public class Aprender {
    double w1,w2,teta,x;
    boolean exitoso;
    ArrayList<Integer> salida_real;
    public void valoreWyTeta(){
        w1=(double)Math.round((Math.random()*((-0.5)-0.5)+0.5)*100d)/100d;
        w2=(double)Math.round((Math.random()*((-0.5)-0.5)+0.5)*100d)/100d;
        //teta=(double)Math.round((Math.random()*(0-0.2)+0.2)*100d)/100d;
        teta=-0.2;
    }
    /*
    -----------------
      entradas   y
    -----------------
  d1  0     0     0
  d2  0     1     1
  d3  1     0     1
  d4  1     1     1
     */
    public ArrayList<Integer> funcionActivacion(ArrayList<Entrada> entradas,int compuerta) {
        //int[] datosEntrada;
        salida_real=new ArrayList<Integer>();
        int aux=0;
        System.out.println("Valor TETA:"+teta);
         double[] datosEntrada1 = {entradas.get(0).getD1(), entradas.get(0).getD2(), entradas.get(0).getD3(), entradas.get(0).getD4()};
        double[] datosEntrada2=new double[4];
        System.out.println("VALOR W1: "+w1);
            if (compuerta!=1) {
                aux=4;
                datosEntrada2[0]=entradas.get(1).getD1();datosEntrada2[1]=entradas.get(1).getD2();datosEntrada2[2]= entradas.get(1).getD3();
                datosEntrada2[3]=entradas.get(1).getD4();
                System.out.println("VALOR W2: "+w2);
            }else{
                aux=2;
            }
            for (int y=0;y<aux;y++) {
                if (compuerta!=1) {
                    x = w1 * datosEntrada1[y] + datosEntrada2[y];
                }else{
                    x = w1 * datosEntrada1[y];
                }
                System.out.println("valor de x::::"+x);
                if (x >= teta) {
                    System.out.println("hola");
                    salida_real.add(1);
                } else {
                    salida_real.add(0);
                }
            }

        return salida_real;
    }
}
