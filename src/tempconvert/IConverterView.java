package tempconvert;

import java.util.Observer;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public interface IConverterView extends Observer {
	public void setButtonAction(EventHandler<ActionEvent> h);
	public String getInputText();
	
	// This comes for free if your View class extends Stage...
	public void show();
}
