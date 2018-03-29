package tempconvert;

public class DesktopController implements IConverterController {

  // In Java 8 and with Eclipse 4+ (we have 3.8) making the event
  // handler here is easy. In our case, there are two ways of doing
  // this with an anonymous inner class:
  // (1) make the model and view private fields of this class,
  // DesktopController, and use them in the anonymous inner class.
  // (2) make the model and view private fields of the anonymous inner
  // class itself.

	// Set the right action for the convert button, and add the view to
	// the model's observers.
	@Override
	public void connect(final IConverterModel m, final IConverterView v) {
		// @TODO
	}

}
