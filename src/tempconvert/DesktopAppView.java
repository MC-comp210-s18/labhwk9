package tempconvert;

import java.util.Observable;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DesktopAppView extends Stage implements IConverterView {

	private final Button btConvert = new Button("Convert");
	private TextField tfCelsiusInput = new TextField();
	private Label lbResult = new Label();

	DesktopAppView() {
		// @TODO: Create the UI. How about a GridPane?
	}
	
	public void setButtonAction(EventHandler<ActionEvent> h) { 
		// @TODO
	}
	public String getInputText() { 
		// @TODO
		return "";
	}

	@Override
	public void update(Observable o, Object arg) {
		assert arg instanceof Double;
		double temp = (Double)arg;
		
		// @TODO
		// You may find the static factory String.valueOf(...) useful...
	}

}
