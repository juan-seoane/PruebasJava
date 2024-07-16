package clases;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.stage.Stage;

public class PruebaAplicFX extends Application{

	@Override
    public void start(Stage primaryStage) throws Exception {
        URL url = getClass().getResource("/resources/prueba1.fxml");
        Parent root = FXMLLoader.load(url);
		Scene escena = new Scene(root);
        primaryStage.setScene(escena);
        
        primaryStage.show();
    }
	
}
