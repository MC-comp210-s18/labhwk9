package tempconvert;

import java.util.Observable;

public class BasicFormula extends Observable implements IConverterModel {

	// You will need to lookup the Observable interface documentation...
	public void convert(double celsius) {
		double fahr = celsius * (9.0/5.0) + 32.0;
		setChanged();
		notifyObservers(fahr);
	}
	
	// Since we extend Observable, we get addObserver and notifyObservers for free!

}
