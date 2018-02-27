package it.ariadne.shape;

public class Cerchio implements Forma{

	Punto p;
	int raggio;
	
	public Cerchio(Punto p, int raggio) {
		this.p = p;
		this.raggio = raggio;
	}

	public double calcolaPerimetro() {
		return this.raggio*2*3;
	}
	
	public double calcolaArea(){
		return 3*raggio*raggio;
	}

}
