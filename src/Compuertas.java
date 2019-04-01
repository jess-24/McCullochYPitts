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
            System.out.println("entrada    salida real");
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
    public void AprendizajeExitoso(){
        if (aprendizajeExitoso==false){
            aprendizajeExitoso=true;
            aprender.valoreWyTeta();
        }else {
            System.out.println("Aprendizaje exitoso!");
        }
    }
    public void compuertaOR(ArrayList<Entrada> entradas){

        salida_real=aprender.funcionActivacion(entradas,0);

    }
}
