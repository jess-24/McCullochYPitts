import java.util.ArrayList;

public class Compuertas {
    Aprender aprender=new Aprender();
    ArrayList<Integer> salida_real;
    boolean aprendizajeExitoso=true;
    /*
    -----------------
      entradas   y
    -----------------
       d1  0     0
       d2  1     1
     */
    public void compuertaNOT(ArrayList<Entrada> entradas){
        do {
            aprendizajeExitoso=true;
            aprender.valoreWyTeta();
            salida_real = aprender.funcionActivacion(entradas, 1);
            if (entradas.get(0).getD1() == 0) {
                if (salida_real.get(0) != 1) {
                    aprendizajeExitoso = false;
                }
            } else {
                if (salida_real.get(0) != 0) {
                    aprendizajeExitoso = false;
                }
            }
            System.out.println("entrada              salida real");
            System.out.println(entradas.get(0).getD1() + "     " + salida_real.get(0));
            if (entradas.get(0).getD2() == 0) {
                if (salida_real.get(1) != 1) {
                    aprendizajeExitoso = false;
                }
            } else {
                if (salida_real.get(1) != 0) {
                    aprendizajeExitoso = false;
                }
            }
            System.out.println(entradas.get(0).getD2() + "     " + salida_real.get(1));
        }while (aprendizajeExitoso==false);
        System.out.println("Aprendizaje exitoso!");
    }
    public void compuertaOR(ArrayList<Entrada> entradas){
        do {
            aprendizajeExitoso = true;
            aprender.valoreWyTeta();
            salida_real = aprender.funcionActivacion(entradas, 0);
            if (entradas.get(0).getD1()==0 && entradas.get(1).getD1()==0){
                if(salida_real.get(0)!=0) aprendizajeExitoso=false;
            }
            if (entradas.get(0).getD2()==0 && entradas.get(1).getD2()==0){
                if(salida_real.get(1)!=0) aprendizajeExitoso=false;
            }
            if (entradas.get(0).getD3()==0 && entradas.get(1).getD3()==0){
                if(salida_real.get(2)!=0) {aprendizajeExitoso=false;}
            }
            if (entradas.get(0).getD4()==0 && entradas.get(1).getD4()==0){
                if(salida_real.get(3)!=0) aprendizajeExitoso=false;
            }
            System.out.println("entrada              salida real");
            System.out.println(entradas.get(0).getD1() + "  "+entradas.get(1).getD1()+"   "+ salida_real.get(0));
            System.out.println(entradas.get(0).getD2() + "  "+entradas.get(1).getD2()+"   "+ salida_real.get(1));
            System.out.println(entradas.get(0).getD3() + "  "+entradas.get(1).getD3()+"   "+ salida_real.get(2));
            System.out.println(entradas.get(0).getD4() + "  "+entradas.get(1).getD4()+"   "+ salida_real.get(3));

        }while (aprendizajeExitoso==false);
        System.out.println("Aprendizaje exitoso!");
    }
}
