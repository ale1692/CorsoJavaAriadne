package it.ariadne.esercizio1;

public class Test {
	public static void main(String[] args) {

		int aNumber = 3;

		if (aNumber >= 0) {

			if (aNumber == 0) {
				System.out.println("first string");
			} else {
				System.out.println("second string");
			}
			System.out.println("third string");
		}

		IdentifyMyParts a = new IdentifyMyParts();
		IdentifyMyParts b = new IdentifyMyParts();
		a.y = 5;
		b.y = 6;
		a.x = 1;
		b.x = 2;
		System.out.println("a.y = " + a.y);
		System.out.println("b.y = " + b.y);
		System.out.println("a.x = " + a.x);
		System.out.println("b.x = " + b.x);
		System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);

	}
}
