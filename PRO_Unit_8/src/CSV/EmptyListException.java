package CSV;
public class EmptyListException extends ObjectNotFoundException {
	private static final long serialVersionUID = -731906302185179355L;
	EmptyListException() {
		super();
	}
	EmptyListException(String message) {
		super(message);
	}
}