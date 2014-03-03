package CSV;
public class InvalidIndexException extends LinkedListException {
	private static final long serialVersionUID = -7963781360110160006L;
	InvalidIndexException() {
		super();
	}
	InvalidIndexException(String message) {
		super(message);
	}
}
