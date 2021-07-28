package hw;

public class FullGroupException extends Exception {

	public FullGroupException() {
		super();
	}

	public FullGroupException(String message) {
		super("Group is full!");
	}

}
