package tempconvert;

import javafx.application.Application;
import javafx.stage.Stage;

public class DesktopConverter extends Application {

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		IConverterModel model = new BasicFormula();
		IConverterView view = new DesktopAppView();
		IConverterController controller = new DesktopController();
		
		controller.connect(model,  view);
		view.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
