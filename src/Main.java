import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Aprender aprender;
    Entrada entrada,entrada2;
    ArrayList<Entrada> entradas;
    Compuertas compuertas;
    public Main(){
        aprender=new Aprender();
        compuertas=new Compuertas();
        System.out.println("******MENU******");
        System.out.println("Elige compuerta a aprender");
        System.out.println("1. NOT");
        System.out.println("2. OR");
        System.out.println("3. AND");
        Scanner s = new Scanner(System.in);
        switch (s.nextInt()){
            case 1:entrada=new Entrada();
                entradas=new ArrayList<Entrada>();
                System.out.println("Ingresa el dato1");
                entrada.setD1(s.nextInt());
                System.out.println("Ingresa el dato2");
                entrada.setD2(s.nextInt());entrada.setD3(0);entrada.setD4(0);
                entradas.add(entrada);
                //entradas.add(entrada);
                compuertas.compuertaNOT(entradas);
                break;
            case 2:
                entrada=new Entrada();
                entrada2=new Entrada();
                System.out.println("Ingresa el dato1 de la entrada 1");
                entrada.setD1(s.nextInt());
                System.out.println("Ingresa el dato1 de la entrada 2");
                entrada2.setD1(s.nextInt());
                System.out.println("Ingresa el dato2 de la entrada 1");
                entrada.setD2(s.nextInt());
                System.out.println("Ingresa el dato2 de la entrada 2");
                entrada2.setD2(s.nextInt());
                System.out.println("Ingresa el dato3 de la entrada 1");
                entrada.setD3(s.nextInt());
                System.out.println("Ingresa el dato3 de la entrada 2");
                entrada2.setD3(s.nextInt());
                System.out.println("Ingresa el dato4 de la entrada 1");
                entrada.setD4(s.nextInt());
                System.out.println("Ingresa el dato4 de la entrada 2");
                entrada2.setD4(s.nextInt());
                entradas.add(entrada);
                entradas.add(entrada2);
                compuertas.compuertaOR(entradas);
                break;
            case 3:
                break;
        }

    }

    public static void main(String [] args){
        Main obj=new Main();
    }
}
