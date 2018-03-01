package it.ariadne.esercizio1;

public class Prova1 implements AutoCloseable {

	public Prova1() {
		System.out.println("Creo risorsa prova1");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Close risorsa prova1");
		
	}
}
