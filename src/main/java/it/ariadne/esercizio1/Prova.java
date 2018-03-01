package it.ariadne.esercizio1;

public class Prova {

	/*
	 * Esercizi 1/32018
	 */
	public static void main(String[] args) {

		// esempio 1 switch
		// String var = "March";
		//
		// switch (var) {
		//
		// case "January":
		// System.out.println("Janu");
		// case "Feruary":
		// System.out.println("Feb");
		// case "March":
		// System.out.println("March");
		// case"October":
		// System.out.println("Oct");
		// default:
		// System.out.println("Any Month");
		// break;
		//
		// }

		try (Prova1 p1 = new Prova1(); Prova2 p2 = new Prova2()) {

			System.out.println("Sono nel try");
			
//			String ciao=null;
//			int l=ciao.length();
			System.out.println("Sono alla fine try");
			//throw new MyException();

		} catch (Exception e) {

			System.out.println("Sono nel catch");

		} finally {

			System.out.println("Sono nel finally");
		}
	}

	
	//Provare dopo
	private class MyException extends RuntimeException{

		public MyException() {
			super();
			System.out.println("mia eccezione");
		}

	}
	

	private static void prova() {
		// Prova funzione riflessiva per mandare in stack overflow
		System.out.println("Prova");
		prova();
	}

	private static void StringFiller() {

		// stringhe immutabili, creo sempre una nuova istanza.
		String ciao = "ciao";
		for (long i = 0; i < 10000000; i++) {
			// oggetto stesso + il valore della lunghezza istanziati, out of memory heap

			ciao += ciao;

			try {

				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private static void StringBui() {

		StringBuilder str = new StringBuilder("ciao");
		for (long i = 0; i < 10000000; i++) {
			// una solo istanza di un oggetto -> out of memory heap lo stesso ma dopo molto
			// più tempo rispetto a prima.

			str.append(str);

			try {

				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
