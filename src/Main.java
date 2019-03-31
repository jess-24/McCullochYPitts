public class Main {
    Aprender aprender;
    public Main(){
        aprender=new Aprender();
        System.out.println("******MENU******");
        System.out.println("Elige compuerta a aprender");
        System.out.println("1. NOT");
        System.out.println("2. OR");
        System.out.println("3. AND");
        System.out.println("4. Salir");
        aprender.valoreWyTeta();
    }

    public static void main(String [] args){
        Main obj=new Main();
    }
}
