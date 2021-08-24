package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception {
	// Burada biz bir Exceptions oluþturduk.
	// create ettiðimiz class Exceptions classýnýn subclassý (child classýdýr).

	private static final long serialVersionUID = 1L; 
	// Java exception'larin tekrarsiz olmasini saglamak icin her exception'a unique bir kod verir

	InvalidEmailIdCheckedException(String message){
		super(message);
	}

}