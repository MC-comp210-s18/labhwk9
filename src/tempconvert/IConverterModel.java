package tempconvert;

import java.util.Observer;

// All models must be able to...
public interface IConverterModel {
	//...convert from celius to fahrenheit
	void convert(double celsius);
	
	//...attach observers
	void addObserver(Observer o);
	
	//...update the observers
	
}
