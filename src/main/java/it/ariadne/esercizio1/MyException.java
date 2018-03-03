package it.ariadne.esercizio1;

public class MyException extends RuntimeException{

	public MyException() {
		super();
		System.out.println("mia eccezione");
	}

}
