import clases.Hilo;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Hilo hilo1 = new Hilo(1);
        Hilo hilo2 = new Hilo(2);

        hilo1.start();
        hilo2.start();

        System.out.println("Finalizando el main");
    }
}
