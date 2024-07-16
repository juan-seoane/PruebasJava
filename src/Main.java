import clases.Hilo;
import clases.PruebaAplicFX;
import javafx.application.Application;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Prueba con hilos");
        Hilo hilo1 = new Hilo(1);
        Hilo hilo2 = new Hilo(2);

        hilo1.start();
        //hilo1.arrancarSubhilos();
        hilo2.start();
        //hilo2.arrancarSubhilos();
        
        hilo1.join();
        hilo2.join();
        System.out.println("Finalizada la prueba con hilos");
        System.out.println("Comenzando la prueba con JavaFX");
        Application.launch(PruebaAplicFX.class);

        System.out.println("Finalizando el main");
    }
}
