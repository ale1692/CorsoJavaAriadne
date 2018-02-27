package it.ariadne.shape;

public class Quadrato implements Forma{

	Punto p;
	int lato;
	
	public Quadrato(Punto p, int lato) {
		this.p = p;
		this.lato = lato;
	}

	public double calcolaPerimetro() {
		return 4*this.lato;
	}
	
	public double calcolaArea(){
		return lato*lato;
	}

}