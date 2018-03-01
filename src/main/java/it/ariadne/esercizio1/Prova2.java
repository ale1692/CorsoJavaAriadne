package it.ariadne.esercizio1;

public class Prova2 implements AutoCloseable {

	public Prova2() {
		System.out.println("Creo risorsa prova2");
	}

	@Override
	public void close() throws Exception {

		System.out.println("Close risorsa prova2");
	}

}
