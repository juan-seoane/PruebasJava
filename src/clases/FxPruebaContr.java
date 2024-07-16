package clases;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FxPruebaContr implements Initializable{

	@FXML Button btn1;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}
	@FXML
	public void btn1Pulsado(Event ev){
		System.out.println("[FxPruebaContr] El programa se apaga!!!");
		System.exit(0);
	}

}
