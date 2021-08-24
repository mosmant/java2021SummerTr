package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception {
	// Burada biz bir Exceptions olu�turduk.
	// create etti�imiz class Exceptions class�n�n subclass� (child class�d�r).

	private static final long serialVersionUID = 1L; 
	// Java exception'larin tekrarsiz olmasini saglamak icin her exception'a unique bir kod verir

	InvalidEmailIdCheckedException(String message){
		super(message);
	}

}